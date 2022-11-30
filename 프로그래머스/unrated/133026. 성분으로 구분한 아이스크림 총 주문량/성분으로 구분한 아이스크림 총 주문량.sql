-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(total_order) as INGREDIENT_TYPE
from FIRST_HALF f
    inner join ICECREAM_INFO  i
    on f.FLAVOR=i.FLAVOR
group by i.INGREDIENT_TYPE
