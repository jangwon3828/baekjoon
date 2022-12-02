-- 코드를 입력하세요
SELECT MCDP_CD as `진료과코드`, count(*) as `5월예약건수`
from APPOINTMENT a 
where APNT_YMD between '2022-05-01 00:00:00' and '2022-05-31 23:59:59' 
group by MCDP_CD
order by count(MCDP_CD),MCDP_CD