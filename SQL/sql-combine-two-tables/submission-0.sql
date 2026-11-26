-- Write your query below
select p.first_name, p.last_name, a.city, a.state
From person as p
Left join address as a
ON p.person_id = a.person_id