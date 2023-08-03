WITH RECURSIVE cte AS (
    SELECT 0 AS n
    UNION ALL
    SELECT n+1 FROM cte WHERE n < 23)

SELECT n 'HOUR', 0
FROM cte
WHERE n NOT IN (SELECT HOUR(DATETIME) HOUR
    FROM ANIMAL_OUTS
    GROUP BY HOUR)
UNION ALL
SELECT HOUR(DATETIME) HOUR, COUNT(ANIMAL_ID) COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR
ORDER BY HOUR