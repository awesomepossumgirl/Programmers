-- 코드를 입력하세요
SELECT 
    Animal_id, 
    name,
    CASE 
        WHEN Sex_upon_intake LIKE '%Neutered%' OR
              Sex_upon_intake LIKE '%Spayed%'
        THEN 'O'
        ELSE 'X'
    END AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
