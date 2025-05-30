-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
    CASE 
        WHEN STATUS = 'sale' THEN '판매중'
        WHEN STATUS = 'reserved' THEN '예약중'
        WHEN STATUS = 'done' THEN '거래완료' 
        ELSE '알 수 없음'
    END AS STATUS 
FROM USED_GOODS_BOARD
WHERE CREATED_DATE = '2022-10-05'
ORDER BY BOARD_ID DESC;

