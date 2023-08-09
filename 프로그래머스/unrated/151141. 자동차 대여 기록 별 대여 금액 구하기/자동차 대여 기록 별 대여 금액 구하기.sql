SELECT p.HISTORY_ID,
       CASE WHEN p.DURATION_TYPE = '기타' THEN FEE
            ELSE ROUND(FEE * (100 - d.DISCOUNT_RATE)/100)
       END AS FEE
FROM (SELECT *
      FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
      WHERE CAR_TYPE = '트럭') as d
RIGHT OUTER JOIN (SELECT CASE WHEN DATEDIFF(h.END_DATE, h.START_DATE) + 1 BETWEEN 7 and 29 THEN '7일 이상'
                              WHEN DATEDIFF(h.END_DATE, h.START_DATE) + 1 BETWEEN 30 and 89 THEN '30일 이상'
                              WHEN DATEDIFF(h.END_DATE, h.START_DATE) + 1 >= 90 THEN '90일 이상'
                              ELSE '기타'
                         END AS 'DURATION_TYPE',
                         (DATEDIFF(h.END_DATE, h.START_DATE) + 1) * c.DAILY_FEE AS FEE,
                         h.HISTORY_ID
                  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY as h
                  INNER JOIN CAR_RENTAL_COMPANY_CAR as c
                  ON h.CAR_ID = c.CAR_ID
                  WHERE c.CAR_TYPE = '트럭') AS p
ON d.DURATION_TYPE = p.DURATION_TYPE
ORDER BY FEE DESC, HISTORY_ID DESC