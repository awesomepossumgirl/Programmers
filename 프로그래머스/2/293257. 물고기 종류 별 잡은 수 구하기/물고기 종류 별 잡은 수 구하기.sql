-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT, n. FISH_NAME
FROM fish_info i JOIN fish_name_info n ON i.fish_type = n.fish_type
GROUP BY fish_name
ORDER BY fish_count DESC;