CREATE MATERIALIZED VIEW project_task_summary AS
SELECT 
    p.id AS project_id,
    p.name AS project_name,
    COUNT(t.id) AS task_count
FROM 
    projet p
LEFT JOIN 
    task t ON p.id = t.projet_id
GROUP BY 
    p.id, p.name;