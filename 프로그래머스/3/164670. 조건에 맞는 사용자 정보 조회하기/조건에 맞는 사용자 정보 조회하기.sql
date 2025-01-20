-- 코드를 입력하세요
SELECT U.User_id, U.Nickname, 
    CONCAT(U.City, ' ', U.Street_address1, ' ',
           U.Street_address2) AS 전체주소,
    CONCAT(SUBSTR(TLNO, 1, 3), '-', 
           SUBSTR(TLNO, 4, 4), '-', 
           SUBSTR(TLNO, 8)) AS 전화번호
FROM Used_goods_board B JOIN Used_goods_user U
     ON B.Writer_id = U.User_id
GROUP BY 
    U.User_id, U.Nickname, U.City, U.Street_address1, U.Street_address2, U.TLNO
HAVING COUNT(BOARD_ID) >= 3
ORDER BY U.User_id DESC;