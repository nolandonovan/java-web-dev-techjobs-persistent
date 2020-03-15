## Part 1: Test it with SQL
DESCRIBE job;

## Part 2: Test it with SQL
SELECT name WHERE location="St. Louis City" FROM employer;

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT DISTINCT name, description FROM skill INNER JOIN job_skills ON skill.id = skills_id ORDER BY name ASC;