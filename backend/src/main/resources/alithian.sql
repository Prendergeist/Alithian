/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : alithian

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 23/05/2023 20:28:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_article
-- ----------------------------
DROP TABLE IF EXISTS `tb_article`;
CREATE TABLE `tb_article`  (
  `id` varchar(32) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `article` longtext CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL,
  `url` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `uid` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_article
-- ----------------------------
INSERT INTO `tb_article` VALUES ('1660976050555785217', 'Link policy', '1849777592@qq.om', '', '646ca81b8e7f14a15ea5e1da.jpg', '646b6dd08e7fa26ffe2e6d5d');
INSERT INTO `tb_article` VALUES ('1660976316252360705', 'Link policy', '1849777592@qq.com', 'last name in the bio. Links to your personal website or other social media are permitted. Please also include a current profile picture for your author bio. Thank you for reading and agreeing to conform to our guidelines. We are looking forward to reading and publishing your work. ', '646ca8418e7f14a15ea5e1dc.jpg', '646b6dd08e7fa26ffe2e6d5d');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` varchar(32) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1660630750262738945', 'xxxxx', 'xxxxxxxx');
INSERT INTO `tb_user` VALUES ('646b6dd08e7fa26ffe2e6d5d', '1849777592@qq.com', '1849777592@qq.com');
INSERT INTO `tb_user` VALUES ('646ca8818e7f14a15ea5e1dd', '1849777593@qq.com', '1849777593@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
