-- Write your query below
select c.customer_id, c.customer_name
from customers as c
Right JOIN orders as o
ON c.customer_id = o.customer_id
Group BY c.customer_id
Having
    sum(Case when o.product_name = 'A' then 1 else 0 end) > 0 and
    sum(Case when o.product_name = 'B' then 1 else 0 end) > 0 and
    sum(Case when o.product_name = 'C' then 1 else 0 end) = 0
Order by c.customer_name
