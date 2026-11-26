-- Write your query below
select student_id, exam_id, score
from (select *,
        Row_number() Over(
            partition by student_id
            Order by score desc, exam_id asc
        ) as rn
        From exam_results
    ) as grade
where rn = 1
Order by student_id 

