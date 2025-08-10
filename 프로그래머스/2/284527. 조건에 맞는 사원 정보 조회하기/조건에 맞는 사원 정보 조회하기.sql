WITH total_scores AS (
    SELECT
        e.emp_no,
        e.emp_name,
        e.position,
        e.email,
        SUM(g.score) AS score
    FROM hr_employees e
    JOIN hr_department d
        ON e.dept_id = d.dept_id
    JOIN hr_grade g
        ON e.emp_no = g.emp_no
    WHERE g.year = 2022
    GROUP BY e.emp_no, e.emp_name, e.position, e.email
)
SELECT
    score,
    emp_no,
    emp_name,
    position,
    email
FROM total_scores
WHERE score = (SELECT MAX(score) FROM total_scores);