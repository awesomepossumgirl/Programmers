-- 코드를 작성해주세요
SELECT ROUTE, 
       CONCAT(ROUND(SUM(d_between_dist), 1), 'km') AS TOTAL_DISTANCE, 
       CONCAT(ROUND(AVG(d_between_dist), 2), 'km') AS AVERAGE_DISTANCE
FROM subway_distance
GROUP BY route
ORDER BY ROUND(SUM(d_between_dist), 1) DESC;