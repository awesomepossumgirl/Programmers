-- 코드를 입력하세요
SELECT FLAVOR
FROM (
    SELECT flavor, SUM(total_order) AS total
    FROM (
        SELECT flavor, total_order from first_half
        UNION ALL
        SELECT flavor, total_order from july
    ) AS all_orders
    GROUP BY flavor
) AS order_sum
ORDER BY total DESC
LIMIT 3;