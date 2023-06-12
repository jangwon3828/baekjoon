-- 코드를 입력하세요
SELECT  u1.TITLE, u1.BOARD_ID ,u2.REPLY_ID , u2.WRITER_ID , u2.CONTENTS ,  DATE_FORMAT(u2.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from 
    USED_GOODS_BOARD u1
 join 
    USED_GOODS_REPLY u2
on 
    u1.BOARD_ID =u2.BOARD_ID
where 
    u1.CREATED_DATE between '2022-10-01' and '2022-10-31'
order by 
    u2.CREATED_DATE asc , u1.TITLE asc;