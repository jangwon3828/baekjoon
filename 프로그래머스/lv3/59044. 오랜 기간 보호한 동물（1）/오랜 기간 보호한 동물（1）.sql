-- 코드를 입력하세요
SELECT ins.NAME , ins.DATETIME
from ANIMAL_INS ins
left join ANIMAL_OUTS outs 
using(ANIMAL_ID)
where outs.datetime is null
order by ins.datetime asc
limit 3;
