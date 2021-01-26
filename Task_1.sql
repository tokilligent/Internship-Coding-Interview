1. SELECT `name` FROM `courses` 
   UNION 
   SELECT `name` FROM `teachers`

2. SELECT `teachers`.`name`, COUNT(*)
   FROM `courses`,`teachers`
   WHERE `courses`.`teacher_id` = `teachers`.`id`
   GROUP BY `courses`.`teacher_id`
   ORDER BY COUNT(*) DESC

3. SELECT `teachers`.`name` FROM `teachers`
   WHERE `teachers`.`id` NOT IN (
   SELECT `teachers`.`id`
   FROM `courses`,`teachers`
   WHERE `courses`.`teacher_id` = `teachers`.`id`
   GROUP BY `courses`.`teacher_id`)