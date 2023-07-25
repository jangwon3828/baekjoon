SELECT ORDER_ID, PRODUCT_ID, date_format(OUT_DATE,'%Y-%m-%d') as OUT_DATE
    ,case when out_date <= '2022-05-01' then '출고완료'
        else case when out_date is null then '출고미정' else '출고대기' end end as 출고여부
    from FOOD_ORDER f 
    order by order_id