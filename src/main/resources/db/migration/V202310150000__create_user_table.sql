create table user (
    id bigint auto_increment,
    username varchar(60),
    password varchar(60),
    primary key (id)
) engine=InnoDB;