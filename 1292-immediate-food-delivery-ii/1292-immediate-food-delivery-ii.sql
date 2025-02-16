SELECT
    ROUND((COUNT(CASE WHEN order_date = customer_pref_delivery_date THEN 1 END) * 100.0) / COUNT(*), 2) AS immediate_percentage
FROM (
    SELECT
        customer_id,
        order_date,
        customer_pref_delivery_date,
        ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY order_date ASC) AS rnum
    FROM
        Delivery
) AS first_orders
WHERE rnum = 1;

 



 







