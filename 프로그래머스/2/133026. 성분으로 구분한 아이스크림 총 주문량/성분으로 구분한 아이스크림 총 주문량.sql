WITH order_sum AS (
    SELECT i.ingredient_type, 
           SUM(h.total_order) AS TOTAL_ORDER
    FROM first_half h
    JOIN icecream_info i ON h.flavor = i.flavor
    GROUP BY i.ingredient_type
)
SELECT INGREDIENT_TYPE,
       TOTAL_ORDER
FROM order_sum
ORDER BY TOTAL_ORDER ASC;
