SELECT animal_type, count(*) as count
from animal_ins
group by animal_type
having animal_type in ('cat', 'dog')
order by 1