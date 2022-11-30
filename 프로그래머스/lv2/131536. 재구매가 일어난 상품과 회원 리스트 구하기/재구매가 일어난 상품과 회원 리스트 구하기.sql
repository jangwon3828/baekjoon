-- 코드를 입력하세요
SELECT user_id,product_id
from ONLINE_SALE o
group by PRODUCT_ID ,user_id
having count(o.user_id)>=2
order by user_id, product_id desc
;