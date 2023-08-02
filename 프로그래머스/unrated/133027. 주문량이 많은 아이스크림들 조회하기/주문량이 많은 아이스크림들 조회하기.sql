SELECT a.flavor 
FROM first_half AS a
INNER JOIN july AS b USING(flavor)
GROUP BY a.flavor
ORDER BY SUM(a.total_order + b.total_order) DESC
LIMIT 3;