SELECT B.CATEGORY, SUM(I.SALES)
FROM BOOK_SALES I, BOOK B
WHERE B.BOOK_ID = I.BOOK_ID
AND DATE_FORMAT(SALES_DATE, '%m') = '01'
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY