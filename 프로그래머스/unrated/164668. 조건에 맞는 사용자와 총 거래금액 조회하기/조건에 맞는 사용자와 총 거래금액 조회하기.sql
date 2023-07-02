SELECT U.user_id, U.nickname, SUM(B.price) AS TOTAL_SALES
FROM used_goods_user U
JOIN used_goods_board B ON U.user_id = B.writer_id
WHERE B.status = 'done'
GROUP BY U.user_id, U.nickname
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC;