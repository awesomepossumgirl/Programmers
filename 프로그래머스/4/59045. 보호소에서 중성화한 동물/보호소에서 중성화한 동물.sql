-- 코드를 입력하세요
-- 들어때는 중성화 X
-- 나갈때는 중성화 O
-- ANIMAL_INS에서는 SEX_SEX_UPON_INTAKE 에서 Neutered 가 안들어간 애들만 CTE
-- CTE를 ANIMAL_ID 기준으로 ANIMAL_OUTS 랑 조회해서
-- SEX_SEX_UPON_INTAKE가 Neutered 인 애들 조회
-- Spayed, Intact 뜻 찾아보기

WITH INTACTS AS (
    SELECT ANIMAL_ID
    FROM ANIMAL_INS
    WHERE SEX_UPON_INTAKE LIKE 'Intact%'
)
SELECT o.ANIMAL_ID, o.ANIMAL_TYPE, o.NAME
FROM ANIMAL_OUTS o JOIN INTACTS i ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE SEX_UPON_OUTCOME LIKE 'Spayed%' 
      OR SEX_UPON_OUTCOME LIKE 'Neutered%'