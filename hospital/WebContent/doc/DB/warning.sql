select p.t_product_name,s_in.t_in_date,p.t_preWarn_days,
s_in.t_expire_date,s_in.t_store_area,
case when TO_DAYS(s_in.t_expire_date)-TO_DAYS(NOW())<=p.t_preWarn_days THEN
1 else 0 end p_warn,
TO_DAYS(s_in.t_expire_date)-TO_DAYS(NOW()) from t_store_in s_in,t_product p 
where p.t_qr_code=s_in.t_qr_code

