-- 코드를 입력하세요
SELECT * 
FROM (
    SELECT USER_ID, NICKNAME, SUM(b.price) AS TOTAL_SALES
    FROM used_goods_board b JOIN used_goods_user u ON b.writer_id = u.user_id
    WHERE b.status = 'DONE'
    GROUP BY user_id) sum
WHERE total_sales >= 700000
ORDER BY total_sales;
