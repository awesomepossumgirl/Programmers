WITH ValidCars AS (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY car_id
    HAVING COUNT(*) >= 5
)
SELECT MONTH(start_date) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM car_rental_company_rental_history
WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31' -- 다시 조건 걸기
    AND car_id IN (SELECT car_id FROM ValidCars)
GROUP BY MONTH, CAR_ID
ORDER BY MONTH, CAR_ID DESC;
