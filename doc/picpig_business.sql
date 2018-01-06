/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50715
 Source Host           : localhost:3306
 Source Schema         : picpig

 Target Server Type    : MySQL
 Target Server Version : 50715
 File Encoding         : 65001

 Date: 06/01/2018 23:14:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for c_album
-- ----------------------------
DROP TABLE IF EXISTS `c_album`;
CREATE TABLE `c_album`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `album_cover` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `album_type` int(11) DEFAULT NULL COMMENT '类型：公开、好友可见、个人可见',
  `album_state` int(11) DEFAULT NULL COMMENT '状态：正常、删除',
  `photo_num` int(11) DEFAULT NULL COMMENT '照片数量',
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '相册表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for c_attachment
-- ----------------------------
DROP TABLE IF EXISTS `c_attachment`;
CREATE TABLE `c_attachment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `attachment_subffix` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '后缀',
  `attachment_size` bigint(20) DEFAULT NULL COMMENT '大小',
  `attachment_type` int(11) DEFAULT NULL COMMENT '类型',
  `attachment_path` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '相对地址',
  `temp_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '存储名称',
  `attachment_state` int(11) DEFAULT NULL COMMENT '状态',
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 516 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '附件表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for c_attachment_relation
-- ----------------------------
DROP TABLE IF EXISTS `c_attachment_relation`;
CREATE TABLE `c_attachment_relation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attachment_id` int(11) NOT NULL,
  `relation_type` int(11) DEFAULT NULL COMMENT '资源类型',
  `relation_table` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '关联表',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createBy` int(11) DEFAULT NULL,
  `createTime` datetime(0) DEFAULT NULL,
  `updateBy` int(11) DEFAULT NULL,
  `updateTime` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for c_focus
-- ----------------------------
DROP TABLE IF EXISTS `c_focus`;
CREATE TABLE `c_focus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `focus_user_id` int(11) NOT NULL,
  `focus_type` int(11) NOT NULL COMMENT '类型：单向，互相',
  `focus_state` int(11) NOT NULL,
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 212 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '关注表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for c_photo
-- ----------------------------
DROP TABLE IF EXISTS `c_photo`;
CREATE TABLE `c_photo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `album_id` int(11) DEFAULT NULL COMMENT '相册',
  `photo_path` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '相册路径',
  `photo_type` int(11) DEFAULT NULL,
  `photo_state` int(11) DEFAULT NULL,
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 369 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '相册表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_comment
-- ----------------------------
DROP TABLE IF EXISTS `m_comment`;
CREATE TABLE `m_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) DEFAULT NULL,
  `relation_id` int(11) DEFAULT NULL COMMENT '关联id',
  `content` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评论内容',
  `comment_time` datetime(0) DEFAULT NULL,
  `comment_type` int(11) DEFAULT NULL COMMENT '类型：动态评论、相册评论、照片评论',
  `comment_state` int(11) DEFAULT NULL COMMENT '状态：',
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT ='评论' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_feed
-- ----------------------------
DROP TABLE IF EXISTS `m_feed`;
CREATE TABLE `m_feed`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `feed_content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容',
  `feed_img` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片',
  `feed_time` datetime(0) DEFAULT NULL COMMENT '发布时间',
  `feed_type` int(11) DEFAULT NULL COMMENT '类型：系统、用户',
  `feed_state` int(11) DEFAULT NULL COMMENT '状态所有人可见，自己可见，朋友可见，',
  `create_time` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `create_by` int(11) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 118 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT='动态' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_feed_summary
-- ----------------------------
DROP TABLE IF EXISTS `m_feed_summary`;
CREATE TABLE `m_feed_summary`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `source_id` int(11) DEFAULT NULL,
  `up_vote` int(11) DEFAULT 0 COMMENT '赞',
  `down_vote` int(11) DEFAULT 0 COMMENT '踩',
  `comment_count` int(11) DEFAULT 0 COMMENT '评论次数',
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 118 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_visit
-- ----------------------------
DROP TABLE IF EXISTS `m_visit`;
CREATE TABLE `m_visit`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户',
  `visited_user_id` int(11) DEFAULT NULL COMMENT '被访问者',
  `visit_time` datetime(0) DEFAULT NULL COMMENT '访问时间',
  `visit_type` int(1) DEFAULT NULL COMMENT '类型1:空间访问2:相册3:照片',
  `visit_source_id` int(11) DEFAULT NULL COMMENT '访问资源id',
  `visit_state` int(11) NOT NULL DEFAULT 0 COMMENT '状态0:正常1:隐藏',
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 928 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT ='访问记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for s_staff
-- ----------------------------
DROP TABLE IF EXISTS `s_staff`;
CREATE TABLE `s_staff`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '真实姓名',
  `staff_head` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `staff_sex` int(11) DEFAULT NULL COMMENT '性别1：男2：女',
  `staff_birthday` datetime(0) DEFAULT NULL COMMENT '出生年月',
  `xingzuo` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '星座',
  `country` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '国家',
  `year_earn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '年收入',
  `marriage_state` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '婚姻状况',
  `create_by` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `deleted_tag` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 194 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '个人中心' ROW_FORMAT = Dynamic;