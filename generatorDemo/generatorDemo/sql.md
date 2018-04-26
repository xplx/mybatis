
CREATE DATABASE IF NOT EXISTS ssm DEFAULT CHARSET utf8 COLLATE utf8_general_ci;


CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `time_add` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8




insert into `ssm`.`user` ( `username`, `time_add`) values ( '测试', '2017-10-20 08:57:43');