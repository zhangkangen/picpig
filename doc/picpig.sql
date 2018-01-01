-- ----------------------------
-- Table structure for sys_login
-- ----------------------------
DROP TABLE IF EXISTS `sys_login`;
CREATE TABLE `sys_login`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `last_login_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后登录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1718 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;


-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `menu_id` int(11) NOT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `menu_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `menu_url` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '#',
  `menu_type` enum('2','1') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '2' COMMENT '1 -- 系统菜单，2 -- 业务菜单',
  `menu_icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '#',
  `sort_num` int(11) DEFAULT 1,
  `user_id` int(11) DEFAULT 1 COMMENT '创建这个菜单的用户id',
  `is_del` int(11) DEFAULT 0 COMMENT '1-- 删除状态，0 -- 正常',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `create_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (0, 5, '用户标签管理', 'userTag/index', '2', '', 6, 1, 1, '2017-12-16 11:04:00', '2017-11-22 17:56:19');
INSERT INTO `sys_menu` VALUES (1, 0, '系统管理', '#', '1', 'fa fa-tasks', 1, 1, 0, '2017-11-14 13:45:59', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (2, 1, '菜单管理', 'menu/list', '1', '#', 1, 1, 0, '2017-09-12 11:28:09', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (3, 1, '角色管理', 'role/list', '1', NULL, 2, 1, 0, '2017-09-07 17:58:52', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (4, 1, '用户管理', 'user/list', '1', '', 3, 1, 0, '2017-09-12 09:44:48', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (5, 0, '分享管理', '#', '2', 'fa fa-share-alt', 2, 1, 1, '2017-12-16 11:04:00', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (6, 5, '内容设置', 'contentpage/editcontentpage', '2', '', 1, 1, 1, '2017-12-16 11:04:00', '2017-09-07 14:52:41');
INSERT INTO `sys_menu` VALUES (7, 0, '百诺', '', '2', 'fa fa-map', 3, 1, 1, '2017-12-17 20:54:56', '2017-10-24 14:33:25');
INSERT INTO `sys_menu` VALUES (9, 7, '返券记录', 'page/t4', '2', '', 2, 1, 1, '2017-10-26 18:07:57', '2017-10-24 14:35:27');
INSERT INTO `sys_menu` VALUES (10, 1, '测试菜单', 'test', '1', '', 2, 1, 1, '2017-10-26 11:20:19', '2017-10-24 18:22:10');
INSERT INTO `sys_menu` VALUES (11, 7, '返券设置', 'coupon/couponset', '2', '', 2, 1, 1, '2017-12-16 11:01:32', '2017-10-24 18:25:26');
INSERT INTO `sys_menu` VALUES (12, 7, '订单详情', 'order/orderList', '2', '', 1, 1, 1, '2017-12-16 11:01:26', '2017-10-25 17:06:34');
INSERT INTO `sys_menu` VALUES (13, 7, '返券设置历史', 'coupon/hiscouponset', '2', '', 3, 1, 1, '2017-12-16 11:01:37', '2017-10-27 09:37:48');
INSERT INTO `sys_menu` VALUES (14, 5, '分享列表', 'contentpage/contentpageListIndex', '2', '', 2, 1, 1, '2017-12-16 11:04:00', '2017-10-28 13:05:41');
INSERT INTO `sys_menu` VALUES (15, 5, '分享记录', 'shareListIndex', '2', '', 2, 1, 1, '2017-12-16 11:04:00', '2017-10-28 13:05:41');
INSERT INTO `sys_menu` VALUES (16, 0, '其它信息', '', '2', 'fa fa-github-alt', 5, 1, 0, '2017-11-15 16:08:54', '2017-11-14 13:43:51');
INSERT INTO `sys_menu` VALUES (17, 1, '网易云音乐', 'http://music.163.com', '2', '', 1, 1, 1, '2017-11-14 13:46:20', '2017-11-14 13:44:45');
INSERT INTO `sys_menu` VALUES (18, 16, '网易云音乐', 'other/music', '2', '11', 1, 1, 0, '2017-12-16 13:44:47', '2017-11-14 13:46:56');
INSERT INTO `sys_menu` VALUES (19, 16, '旋转', 'other/canvas', '2', '', 2, 1, 0, '2017-11-30 18:35:28', '2017-11-14 14:46:34');
INSERT INTO `sys_menu` VALUES (20, 0, '数据统计', '', '2', 'fa fa-bar-chart', 4, 1, 1, '2017-12-17 20:55:01', '2017-11-15 16:09:22');
INSERT INTO `sys_menu` VALUES (21, 20, '订单交易明细', 'order/orderTrading', '2', '', 1, 1, 1, '2017-12-17 20:55:01', '2017-11-15 16:11:18');
INSERT INTO `sys_menu` VALUES (22, 20, '收入-支出费用统计', 'order/incomeAndExpenseIndex', '2', '', 2, 1, 1, '2017-12-17 20:55:01', '2017-11-15 16:11:18');
INSERT INTO `sys_menu` VALUES (24, 20, '佣金结算费用统计', 'ordersCommision/index', '2', '', 3, 1, 1, '2017-12-17 20:55:01', '2017-11-21 14:07:27');
INSERT INTO `sys_menu` VALUES (25, 5, '标签管理', 'shareTag/tagList', '2', '', 4, 1, 1, '2017-12-16 11:04:00', '2017-11-22 10:31:07');
INSERT INTO `sys_menu` VALUES (26, 5, '推广员排行', 'order/orderRank', '2', '#', 5, 1, 1, '2017-12-16 11:04:00', '2017-11-22 14:24:01');
INSERT INTO `sys_menu` VALUES (27, 16, '图表', 'echart/demo', '2', '', 1, 1, 1, '2017-11-30 18:36:07', '2017-11-24 19:33:40');
INSERT INTO `sys_menu` VALUES (28, 5, '通用标签配置', 'shareTag/commonTagIndex', '2', '#', 6, 1, 1, '2017-12-16 11:04:00', '2017-11-22 14:24:01');
INSERT INTO `sys_menu` VALUES (29, 16, '订单统计图', 'order/orderTotal', '2', '', 3, 1, 0, '2017-12-01 11:41:21', '2017-12-01 11:41:21');
INSERT INTO `sys_menu` VALUES (30, 20, '设置业务用户组', 'bnuser/userGroupList', '2', '#', 4, 1, 1, '2017-12-16 11:04:08', '2017-12-02 14:51:36');
INSERT INTO `sys_menu` VALUES (31, 7, '设置用户业务组', 'bnuser/userGroupList', '2', '', 1, 1, 1, '2017-12-17 20:54:56', '2017-12-16 11:02:43');
INSERT INTO `sys_menu` VALUES (32, 1, '13', '234', '2', '', 1, 1, 1, '2017-12-16 17:53:33', '2017-12-16 13:45:42');
INSERT INTO `sys_menu` VALUES (33, 7, '组设置', 'bnuser/groupList', '2', '', 1, 1, 1, '2017-12-17 20:54:56', '2017-12-16 17:54:33');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '角色名',
  `role_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `rights` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0' COMMENT '最大权限的值',
  `add_qx` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `del_qx` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `edit_qx` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `query_qx` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `user_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, '管理员', '管理员权限', '1267650600228229401496703205375', '67110944', '1', '3068', '7164', '1', '2017-11-22 14:27:22');
INSERT INTO `sys_role` VALUES (2, '经理', '经理', '94', '2', '1', '4', '126', '1', '2017-10-24 18:24:26');
INSERT INTO `sys_role` VALUES (3, '员工', '员工', '382', '382', '382', '382', '126', '1', '2017-10-24 18:24:49');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nick_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pic_path` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '/images/logo.png',
  `status` enum('unlock','lock') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT 'unlock',
  `create_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', '管理员', 'd033e22ae348aeb5660fc2140aec35850c4da997', 'http://www.lrshuai.top/upload/user/20170612/05976238.png', 'unlock', '2017-08-18 13:57:32');
INSERT INTO `sys_user` VALUES (2, 'tyro', 'tyro', '481c63e8b904bb8399f1fc1dfdb77cb40842eb6f', '/upload/show/user/82197046.png', 'unlock', '2017-09-12 14:03:39');
INSERT INTO `sys_user` VALUES (3, 'asdf', 'asdf', '3da541559918a808c2402bba5012f6c60b27661c', '/upload/show/user/85610497.png', 'unlock', '2017-09-13 14:49:10');
INSERT INTO `sys_user` VALUES (13, 'suqiang', '苏强', '7c4a8d09ca3762af61e59520943dc26494f8941b', '/upload/show/user/60817295.png', 'unlock', '2017-10-24 14:25:56');
INSERT INTO `sys_user` VALUES (14, '1', '1', '7c4a8d09ca3762af61e59520943dc26494f8941b', '/images/logo.png', 'unlock', '2017-10-24 18:17:36');
INSERT INTO `sys_user` VALUES (15, '2', '123456', '7c4a8d09ca3762af61e59520943dc26494f8941b', '/images/logo.png', 'unlock', '2017-10-24 18:17:47');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1, 1, '2017-08-18 14:45:43');
INSERT INTO `sys_user_role` VALUES (2, 2, 3, '2017-09-08 17:12:58');
INSERT INTO `sys_user_role` VALUES (13, 3, 3, '2017-09-14 14:30:02');
INSERT INTO `sys_user_role` VALUES (16, 13, 2, '2017-10-24 14:30:04');
