create table sys_user(
    id      bigint  auto_increment primary key comment '主键',
    user_code   varchar(50) comment '编码',
    user_name   varchar(500) comment '名称'
);

alter table sys_user comment '用户表';

alter table sys_user add index idx_user (user_code);