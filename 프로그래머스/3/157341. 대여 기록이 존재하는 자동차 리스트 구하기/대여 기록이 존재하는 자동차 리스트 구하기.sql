SELECT 
    DISTINCT(A.Car_id)
FROM 
    Car_rental_company_car A 
    JOIN Car_rental_company_rental_history B 
    ON A.Car_id = B.Car_id
WHERE 
    A.Car_type = '세단' 
    AND B.Start_date BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY 
    A.Car_id DESC;
