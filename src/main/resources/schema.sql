create table user_info
(
    id           bigint not null auto_increment,
    user_id      bigint comment '使用者id',
    password     varchar(60) comment '密碼',
    nick_name    varchar(60) comment '暱稱',
    mobile_phone varchar(60) comment '手機',
    is_login     tinyint(1) comment '是否登入,0-未登入,1-登入',
    is_del       tinyint(1) comment '是否刪除,0-未刪除,1-刪除',
    create_time  timestamp default current_timestamp comment '建立時間',
    primary key (id)
);
alter table user_info comment '使用者資訊';
-- 設定index加速查詢
create index user_info_user_id_index on user_info (user_id);
create index user_info_mobile_phone_index on user_info (mobile_phone);

create table user_sms_code
(
    id           bigint not null auto_increment,
    mobile_phone varchar(60) comment '使用者註冊手機號碼',
    sms_code     varchar(60) comment '簡訊驗證碼',
    send_time    timestamp default current_timestamp comment '簡訊發送時間',
    create_time  timestamp default current_timestamp comment '建立時間',
    primary key (id)
);
alter table user_sms_code comment '使用者簡訊驗證碼';
-- 設定index加速查詢
create index user_sms_code_mobile_phone on user_sms_code (mobile_phone);