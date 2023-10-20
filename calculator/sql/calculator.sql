/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : calculator

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 19/10/2023 11:38:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for expression
-- ----------------------------
DROP TABLE IF EXISTS `expression`;
CREATE TABLE `expression` (
  `id` int NOT NULL AUTO_INCREMENT,
  `expression` varchar(1000) DEFAULT NULL COMMENT '显示的表达式',
  `result_number` varchar(1000) DEFAULT NULL COMMENT '计算出来的结果',
  `demonstrate` varchar(1000) DEFAULT NULL COMMENT '展示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;

SET FOREIGN_KEY_CHECKS = 1;
