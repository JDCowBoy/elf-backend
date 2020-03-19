
-- ----------------------------
-- 1、菜单权限表
-- ----------------------------
DROP TABLE IF EXISTS `elf_sys_menu`;

CREATE TABLE `elf_sys_menu`(
	`id`            INT(11)       NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`menu_name`     VARCHAR(50)   NOT NULL                COMMENT '菜单名称',
	`parent_id`     INT(11)       NOT NULL  DEFAULT 0     COMMENT '父id',
	`order_num`     INT(4)        NOT NULL  DEFAULT 0     COMMENT '顺序',
	`url`           VARCHAR(200)            DEFAULT '#'   COMMENT '请求地址',
  `target`        VARCHAR(20)             DEFAULT ''    COMMENT '打开方式',
  `menu_type`     CHAR(1)                 DEFAULT ''    COMMENT '菜单类型',
  `visible`       CHAR(1)                 DEFAULT 0     COMMENT '菜单状态（0显示 1隐藏）',
  `perms`         VARCHAR(100)            DEFAULT NULL  COMMENT '权限标识',
  `icon`          VARCHAR(100)            DEFAULT '#'   COMMENT '菜单图标',
  `create_user`   VARCHAR(50)             DEFAULT ''    COMMENT '创建者',
  `create_time`   datetime                              COMMENT '创建时间',
  `update_user`   VARCHAR(64)             DEFAULT ''    COMMENT '更新者',
  `update_time`   datetime                              COMMENT '更新时间',
  `remark`        VARCHAR(500)            DEFAULT ''    COMMENT '备注',
	`is_delete`     INT(1)       NOT NULL   DEFAULT 0     COMMENT '删除标识',
  primary key (id)
)ENGINE=INNODB auto_increment=0 COMMENT = '菜单权限表';

-- ----------------------------
-- 初始化-菜单信息表数据
-- ----------------------------
insert into elf_sys_menu values('1', '系统管理', '0', '1', '#', '', 'M', '0', '', 'fa fa-gear',         'admin', '2018-03-16 11-33-00', 'ry', '2018-03-16 11-33-00', '系统管理目录', 0);
insert into elf_sys_menu values('2', '系统监控', '0', '2', '#', '', 'M', '0', '', 'fa fa-video-camera', 'admin', '2018-03-16 11-33-00', 'ry', '2018-03-16 11-33-00', '系统监控目录', 0);
insert into elf_sys_menu values('3', '系统工具', '0', '3', '#', '', 'M', '0', '', 'fa fa-bars',         'admin', '2018-03-16 11-33-00', 'ry', '2018-03-16 11-33-00', '系统工具目录', 0);
-- 二级菜单
insert into sys_menu values('100',  '用户管理', '1', '1', '/system/user',          '', 'C', '0', 'system:user:view',         '#', 'admin', '2018-03-16 11-33-00', 'ry', '2018-03-16 11-33-00', '用户管理菜单', 0);
insert into sys_menu values('101',  '角色管理', '1', '2', '/system/role',          '', 'C', '0', 'system:role:view',         '#', 'admin', '2018-03-16 11-33-00', 'ry', '2018-03-16 11-33-00', '角色管理菜单', 0);