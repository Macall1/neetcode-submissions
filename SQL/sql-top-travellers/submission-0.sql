-- Write your query below
select u.name,
    case
        when sum(r.distance) is null then 0
        else sum(r.distance)
    end as travelled_distance
from users as u
Left Join rides as r
on u.id = r.user_id
group by u.name, u.id
order by travelled_distance desc ,u.name asc