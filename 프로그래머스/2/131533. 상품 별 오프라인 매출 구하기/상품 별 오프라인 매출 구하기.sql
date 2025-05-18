-- 코드를 입력하세요
SELECT p.PRODUCT_CODE, SUM(p.price * o.sales_amount) AS SALES
FROM offline_sale o INNER JOIN product p ON o.product_id = p.product_id
GROUP BY p.product_code
ORDER BY sales DESC, p.product_code;