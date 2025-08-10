-- 코드를 입력하세요
-- OPTIONS IN ('통풍시트', '열선싱트', '가죽시트')
-- 종류별로 group by CAR_TYPE
-- 몇 대? COUNT(*) AS CARS
SELECT CAR_TYPE, COUNT(*) AS CARS
FROM car_rental_company_car
WHERE options LIKE ('%통풍시트%') OR
      options LIKE ('%열선시트%') OR
      options LIKE ('%가죽시트%')
GROUP BY car_type
ORDER BY car_type;
