SELECT 
    FLOOR(Price/10000) * 10000 AS PRICE_GROUP,
    COUNT(*) AS PRODUCTS
FROM product
GROUP BY price_group
ORDER BY price_group;
    
