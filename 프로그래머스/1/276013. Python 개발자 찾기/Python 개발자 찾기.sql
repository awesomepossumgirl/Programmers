-- 코드를 작성해주세요
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE 'python' IN (LOWER(SKILL_1), LOWER(SKILL_2), LOWER(SKILL_3))
ORDER BY ID;