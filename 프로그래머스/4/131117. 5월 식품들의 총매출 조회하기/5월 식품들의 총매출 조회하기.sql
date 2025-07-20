-- 조인: FOOD_PRODUCT (A) + FOOD_ORDER (B)
-- 필터: 2022년 5월 생산분 (B.PRODUCE_DATE)
-- 집계: SUM(B.AMOUNT * A.PRICE) → 총매출
-- 그룹화: A.PRODUCT_ID, A.PRODUCT_NAME
-- 정렬: 총매출 DESC, PRODUCT_ID ASC
-- 컬럼명 별칭 사용
-- 총매출 = 식품id의 주문량 * 식품 가격
-- 코드를 입력하세요
SELECT A.product_id AS PRODUCT_ID, A.product_name AS PRODUCT_NAME, SUM(B.amount * A.price) AS TOTAL_SALES
FROM food_product A INNER JOIN food_order B ON A.product_id = B.product_id
WHERE B.produce_date BETWEEN '2022-05-01' AND '2022-05-31'
GROUP BY A.product_id, A.product_name
ORDER BY TOTAL_SALES DESC, A.product_id ASC;