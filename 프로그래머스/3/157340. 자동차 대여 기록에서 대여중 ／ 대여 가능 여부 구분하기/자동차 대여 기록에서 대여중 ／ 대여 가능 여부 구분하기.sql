-- 코드를 입력하세요
SELECT CAR_ID,
    CASE 
        WHEN MAX(CASE 
                    WHEN DATE '2022-10-16' BETWEEN START_DATE AND END_DATE 
                    THEN 1
                    ELSE 0 
                 END) = 1
        THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC;