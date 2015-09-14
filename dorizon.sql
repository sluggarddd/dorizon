/*
 Navicat Premium Data Transfer

 Source Server         : zhw_mac
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : dorizon

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 09/14/2015 21:08:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `dorizon_admin_user`
-- ----------------------------
DROP TABLE IF EXISTS `dorizon_admin_user`;
CREATE TABLE `dorizon_admin_user` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `token` varchar(32) DEFAULT NULL,
  `nickname` varchar(40) DEFAULT NULL,
  `last_login_time` bigint(13) DEFAULT NULL,
  `register_time` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `dorizon_admin_user`
-- ----------------------------
BEGIN;
INSERT INTO `dorizon_admin_user` VALUES ('zhanghaowei', '123123', '1231321', '12313@qq.com', null, '张浩威', null, '123123');
COMMIT;

-- ----------------------------
--  Table structure for `dorizon_blog`
-- ----------------------------
DROP TABLE IF EXISTS `dorizon_blog`;
CREATE TABLE `dorizon_blog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` text NOT NULL,
  `create_user` varchar(40) NOT NULL,
  `create_time` bigint(13) NOT NULL,
  `modify_user` varchar(255) NOT NULL,
  `modify_time` bigint(13) NOT NULL,
  `read_count` bigint(10) NOT NULL DEFAULT '0',
  `is_del` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `dorizon_blog_type`
-- ----------------------------
DROP TABLE IF EXISTS `dorizon_blog_type`;
CREATE TABLE `dorizon_blog_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `create_user` varchar(40) NOT NULL,
  `create_time` bigint(13) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `dorizon_blog_type`
-- ----------------------------
BEGIN;
INSERT INTO `dorizon_blog_type` VALUES ('1', 'Web开发', 'Web开发专题', 'zhanghaowei', '123123123');
COMMIT;

-- ----------------------------
--  Table structure for `dorizon_r_blog_type`
-- ----------------------------
DROP TABLE IF EXISTS `dorizon_r_blog_type`;
CREATE TABLE `dorizon_r_blog_type` (
  `blog_id` int(10) NOT NULL,
  `blog_type_id` int(10) NOT NULL,
  PRIMARY KEY (`blog_id`,`blog_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
