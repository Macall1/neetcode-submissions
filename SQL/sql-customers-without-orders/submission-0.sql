-- Write your query below
select name
from customers as c
Left Join orders as o
ON c.id = o.customer_id
Where o.customer_id IS null