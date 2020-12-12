create table task
(
  id            bigserial not null
    constraint task_pkey
    primary key,
  name          varchar(100),
  date_start    timestamp,
  real_date_end timestamp,
  date_end      timestamp
);
CREATE UNIQUE INDEX task_name_uindex ON public.task (name);

create table division
(
  id   bigserial not null
    constraint division_pkey
    primary key,
  name varchar(100)
);
CREATE UNIQUE INDEX division_name_uindex ON public.division (name);


create table employee
(
  id          bigserial not null
    constraint employee_pkey
    primary key,
  name        varchar(50),
  surname     varchar(50),
  division_id integer
    constraint employee_division_id_fk
    references division
    on delete cascade,
  is_boss     boolean
);

create table name_stage
(
  id   bigserial not null
    constraint name_stage_pkey
    primary key,
  name varchar(250)
);
CREATE UNIQUE INDEX name_stage_name_uindex ON public.name_stage (name);

create table stage
(
  id               bigserial not null
    constraint stage_pkey
    primary key,
  name_id          integer
    constraint stage_name_stage_id_fk
    references name_stage
    on delete cascade,
  date_start       timestamp,
  importance       integer,
  responsible_id   integer
    constraint stage_employee_id_fk
    references employee
    on delete cascade,
  readiness_degree float,
  task_id          integer
    constraint stage_task_id_fk
    references task
    on delete cascade,
  real_date_end    timestamp,
  date_end         timestamp
);


create table employee_stage
(
  id          bigserial not null
    constraint employee_stage_pkey
    primary key,
  employee_id integer
    constraint employee_stage_employee_id_fk
    references employee
    on delete cascade,
  stage_id    integer
    constraint employee_stage_stage_id_fk
    references stage
    on delete cascade
);

