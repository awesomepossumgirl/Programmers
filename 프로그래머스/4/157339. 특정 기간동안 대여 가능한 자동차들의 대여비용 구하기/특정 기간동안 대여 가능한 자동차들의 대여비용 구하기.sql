-- 코드를 입력하세요
SELECT j.car_id, j.car_type, ROUND(j.daily_fee * ((100 - j.discount_rate)*0.01) * 30) AS fee
FROM (SELECT c.car_id, c.car_type, c.daily_fee, d.discount_rate from car_rental_company_car c INNER JOIN car_rental_company_discount_plan d ON c.car_type = d.car_type AND d.duration_type = '30일 이상') AS j
      INNER JOIN car_rental_company_rental_history h ON j.car_id = h.car_id
WHERE car_type IN ('세단', 'SUV')
AND NOT EXISTS (
        SELECT car_id
        FROM car_rental_company_rental_history h2
        WHERE h2.car_id = j.car_id
          AND NOT (
              h2.end_date < '2022-11-01' OR h2.start_date > '2022-11-30')
        )
    AND ROUND(j.daily_fee * ((100 - j.discount_rate)*0.01) * 30) BETWEEN 500000 AND 2000000
group by car_id
ORDER BY fee DESC, j.car_type, j.car_id DESC