SELECT CATEGORY, SUM(s.sales)TOTAL_SALES
FROM book b JOIN book_sales s ON b.book_id = s.book_id
WHERE DATE_FORMAT(s.sales_date, '%Y-%m') = '2022-01'
GROUP BY CATEGORY
ORDER BY CATEGORY;
