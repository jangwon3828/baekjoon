-- 코드를 입력하세요
SELECT f.FLAVOR
from FIRST_HALF f
    inner join ICECREAM_INFO i
    on i.FLAVOR=f.FLAVOR  
where f.TOTAL_ORDER>3000 and i.INGREDIENT_TYPE='fruit_based'