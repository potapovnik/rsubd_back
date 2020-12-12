insert into division(name) values('Бухгалтерия');
insert into division(name) values('Чёрная бухгалтерия');
insert into division(name) values('Кладовщики для бумажек бухгалтерии');
insert into division(name) values('Кладовщики для тёмных вещичек чёрной бухгалтерии');
insert into division(name) values('Отдел охраны');
insert into division(name) values('Малый отдел офисного планктона');
insert into division(name) values('Средний отдел офисного планктона');
insert into division(name) values('Большой отдел офисного планктона');
insert into division(name) values('Отдел консультантов');
insert into division(name) values('Отдел технической поддержки не технических людям');

insert into employee (name, surname, division_id, is_boss)
values ('Иван','Карамзин',1,true );
insert into employee (name, surname, division_id, is_boss)
values ('Владимир','Мономах',2,true );
insert into employee (name, surname, division_id, is_boss)
values ('Игорь','Емельянов',5,false );
insert into employee (name, surname, division_id, is_boss)
values ('Андрей','Горбачёв',3,false );
insert into employee (name, surname, division_id, is_boss)
values ('Илья','Фомин',5,false );
insert into employee (name, surname, division_id, is_boss)
values ('Пётр','Жданов',1,FALSE );
insert into employee (name, surname, division_id, is_boss)
values ('Кирилл','Песцов',2,false );
insert into employee (name, surname, division_id, is_boss)
values ('Стенька','Разин',7,false );
insert into employee (name, surname, division_id, is_boss)
values ('Вадим','Кротов',7,false );
insert into employee (name, surname, division_id, is_boss)
values ('Антон','Кузнецов',3,true );


INSERT into name_stage(name) values ('Обсуждение идеи проекта');
INSERT into name_stage(name) values ('Анализ аналогичных проектов на рынке');
INSERT into name_stage(name) values ('Прогнозирование спроса на рынке');
INSERT into name_stage(name) values ('Прогнозирование затрат на проект');
INSERT into name_stage(name) values ('Подписание договора');
INSERT into name_stage(name) values ('Проектирование системы');
INSERT into name_stage(name) values ('Поиск уизвимостей системы');
INSERT into name_stage(name) values ('Проверка стандартов разработки');
INSERT into name_stage(name) values ('Обсуждение возможных улучшений');
INSERT into name_stage(name) values ('Анализ готового продукта');

insert into task(name, date_start, real_date_end, date_end)
VALUES ('ВК','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Apple','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Microsoft','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Linux','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Unix','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Одноклассницы','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('QIWI кошелёк','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Delivery Club','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Пицеррия додо','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');
insert into task(name, date_start, real_date_end, date_end)
VALUES ('Макдональдс','2016-06-22 19:10:25-07','2018-06-22 19:10:25-07','2017-06-22 19:10:25-07');

insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (1,'2016-06-22 19:10:25-07',1,1,100,1,'2017-03-22 19:10:25-07','2017-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (2,'2016-06-22 19:10:25-07',2,2,99,6,'2017-03-22 19:10:25-07','2018-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (3,'2016-06-22 19:10:25-07',3,3,10,2,'2017-03-22 19:10:25-07','2019-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (4,'2016-06-22 19:10:25-07',3,4,25,1,'2017-03-22 19:10:25-07','2020-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (5,'2016-06-22 19:10:25-07',4,5,24,3,'2017-03-22 19:10:25-07','2021-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (6,'2016-06-22 19:10:25-07',4,6,37,2,'2017-03-22 19:10:25-07','2022-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (7,'2016-06-22 19:10:25-07',5,5,58,4,'2017-03-22 19:10:25-07','2023-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (8,'2016-06-22 19:10:25-07',2,2,43,3,'2017-03-22 19:10:25-07','2024-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (9,'2016-06-22 19:10:25-07',3,9,29,2,'2017-03-22 19:10:25-07','2025-06-22 19:10:25-07');
insert INTO stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)
values (10,'2016-06-22 19:10:25-07',1,2,11,1,'2017-03-22 19:10:25-07','2026-06-22 19:10:25-07');

INSERT into employee_stage(employee_id, stage_id) VALUES (1,1);
INSERT into employee_stage(employee_id, stage_id) VALUES (3,2);
INSERT into employee_stage(employee_id, stage_id) VALUES (4,3);
INSERT into employee_stage(employee_id, stage_id) VALUES (10,8);
INSERT into employee_stage(employee_id, stage_id) VALUES (6,5);
INSERT into employee_stage(employee_id, stage_id) VALUES (5,4);
INSERT into employee_stage(employee_id, stage_id) VALUES (2,6);
INSERT into employee_stage(employee_id, stage_id) VALUES (2,2);
INSERT into employee_stage(employee_id, stage_id) VALUES (2,1);
INSERT into employee_stage(employee_id, stage_id) VALUES (8,2);
INSERT into employee_stage(employee_id, stage_id) VALUES (9,2);
INSERT into employee_stage(employee_id, stage_id) VALUES (7,3);