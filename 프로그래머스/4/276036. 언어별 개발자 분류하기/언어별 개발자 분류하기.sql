-- 코드를 작성해주세요
SELECT CASE 
            WHEN SUM(CASE WHEN s.CATEGORY = 'Front End' THEN 1 ELSE 0 END) > 0                    AND SUM(CASE WHEN s.NAME = 'PYTHON' THEN 1 ELSE 0 END) > 0
                 THEN 'A'
            WHEN SUM(CASE WHEN s.NAME = 'C#' THEN 1 ELSE 0 END) > 0
                 THEN 'B'
            WHEN SUM(CASE WHEN s.CATEGORY = 'Front End' THEN 1 ELSE 0 END) > 0
                 THEN 'C'    
       END AS GRADE,
       d.ID,
       d.EMAIL
FROM SKILLCODES s 
JOIN DEVELOPERS d 
     ON (s.CODE & d.SKILL_CODE) > 0
GROUP BY d.ID, d.EMAIL
HAVING GRADE IS NOT NULL
ORDER BY GRADE, d.ID;
