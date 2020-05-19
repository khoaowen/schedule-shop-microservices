create table usertype
(
    ID            bigint not null auto_increment primary key,
    NAME          varchar(100),
    DESCRIPTION   varchar(500),
    NOTE          varchar(1000),
    ENTERED_BY    varchar(100),
    ENTERED_DATE  DATETIME,
    MODIFIED_BY   varchar(100),
    MODIFIED_DATE DATETIME,
    ENDED_DATE    DATETIME

);
create table userinfo
(
    ID            bigint not null auto_increment primary key,
    USER_TYPE     bigint,
    DETAIL_INFO   bigint,
    SHOP_INFO     bigint,
    EMAIL         varchar(100),
    PASSWORD      varchar(100),
    ENTERED_BY    varchar(100),
    ENTERED_DATE  DATETIME,
    MODIFIED_BY   varchar(100),
    MODIFIED_DATE DATETIME,
    ENDED_DATE    DATETIME,

    foreign key (USER_TYPE)
        references usertype (ID)
);

insert into usertype
values (1, 'OWNER', 'THE OWNER', null, null, null, null, null, null);
insert into usertype
values (2, 'TECHNICIAN', 'THE WORKER', null, null, null, null, null, null);