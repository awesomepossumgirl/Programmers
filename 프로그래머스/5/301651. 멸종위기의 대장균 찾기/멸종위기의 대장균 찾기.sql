-- 코드를 작성해주세요
WITH RECURSIVE Generation AS (
    -- 최초 대장균을 1세대로 정의
    SELECT ID, 
           PARENT_ID, 
           SIZE_OF_COLONY, 
           DIFFERENTIATION_DATE, 
           GENOTYPE, 1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    
    UNION ALL
    -- 부모 개체로부터 자식의 세대 수 계산
    SELECT e.ID,
           e.PARENT_ID,
           e.SIZE_OF_COLONY,
           e.DIFFERENTIATION_DATE, 
           e.GENOTYPE,
           g.GENERATION + 1 AS GENERATION
    FROM ECOLI_DATA e
    INNER JOIN Generation g ON e.PARENT_ID = g.ID    
)

-- 각 세대별로 자식이 없는 개체 수 계산
SELECT COUNT(*) AS COUNT,
       GENERATION
FROM Generation gn
WHERE NOT EXISTS (
    SELECT 1
    FROM ECOLI_DATA e
    WHERE e.PARENT_ID = gn.ID
)
GROUP BY GENERATION
ORDER BY GENERATION