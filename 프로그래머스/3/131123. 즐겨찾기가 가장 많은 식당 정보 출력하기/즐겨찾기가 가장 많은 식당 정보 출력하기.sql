-- 코드를 입력하세요
WITH ranked_rest AS (
    SELECT rest_id,
           rest_name,
           food_type,
           favorites,
           ROW_NUMBER() OVER (PARTITION BY food_type ORDER BY favorites DESC) AS rn
    FROM rest_info
)
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM ranked_rest
WHERE rn = 1
ORDER BY food_type DESC;