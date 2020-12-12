create view full_stage as select stage.id,n.name as name_of_stage,t.name as name_of_project,t.date_start,t.date_end,t.real_date_end,e.name,e.surname,e.is_boss
from stage join name_stage n on stage.name_id = n.id
           join task t on stage.task_id = t.id
           join employee e on stage.responsible_id = e.id;

create view unsuccessful_task as
select s.name_id,
       s.date_start,
       s.date_end,
       s.real_date_end,
       e.name,
       e.surname,
       e.is_boss,
       d2.name as name_division
from employee_stage
       join stage s on employee_stage.stage_id = s.id
       join employee e on employee_stage.employee_id = e.id
       join division d2 on e.division_id = d2.id
where date_start > '2016-01-01'
  and date_end > s.real_date_end;


create view  boss_proj as
select employee.name,employee.surname,count(t.id) as project
from employee join stage s2 on employee.id = s2.responsible_id
              join task t on s2.task_id = t.id
group by employee.name,employee.surname,employee.is_boss
having employee.is_boss = true ;

create view  delete_task_info as
select task.name ,s2.id as stage_id,name_id,employee_id,e.name as имя,e.surname as фамилия
from task inner join stage s2 on task.id = s2.task_id inner join employee_stage es on s2.id = es.stage_id inner join name_stage n on s2.name_id = n.id inner join employee e on es.employee_id = e.id
order by task_id,name_id asc;