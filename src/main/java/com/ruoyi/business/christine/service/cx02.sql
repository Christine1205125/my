/*
 Navicat Premium Dump SQL

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80300 (8.3.0)
 Source Host           : localhost:3307
 Source Schema         : ruoyi

 Target Server Type    : MySQL
 Target Server Version : 80300 (8.3.0)
 File Encoding         : 65001

 Date: 10/11/2024 17:19:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cx02
-- ----------------------------
DROP TABLE IF EXISTS `cx02`;
CREATE TABLE `cx02`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `position` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地理位置（经纬度，以逗号分隔）',
  `userid` bigint NULL DEFAULT NULL COMMENT '创建人ID',
  `jcdwmc` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '检测单位名称',
  `jlbh` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '记录编号',
  `gcmc` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工程名称',
  `htd` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '合同段',
  `sgdw` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '施工单位',
  `jldw` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '监理单位',
  `gcbw_yt` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工程部位/用途',
  `ypxx` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '样品信息',
  `syjcrq` date NULL DEFAULT NULL COMMENT '试验检测日期',
  `sytj` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '试验条件',
  `jcyj` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '检测依据',
  `pdyj` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '判定依据',
  `zyyqsbmcjbh` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主要仪器设备名称及编号',
  `qydd` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '取样地点',
  `qyrq` date NULL DEFAULT NULL COMMENT '取样日期',
  `dbsl` float NULL DEFAULT NULL COMMENT '代表数量',
  `jlcd` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '集料产地',
  `pzgg` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '品种规格',
  `m1_rlthblbzzl` float NULL DEFAULT NULL COMMENT '容量筒和玻璃板总质量(g)（试验1）',
  `m1_2_rlthblbzzl` float NULL DEFAULT NULL COMMENT '容量筒和玻璃板总质量(g)（试验2）',
  `m3_rltblbhszzl` float NULL DEFAULT NULL COMMENT '容量筒、玻璃板和水总质量(g)（试验1）',
  `m3_2_rltblbhszzl` float NULL DEFAULT NULL COMMENT '容量筒、玻璃板和水总质量(g)（试验2）',
  `v1_rltrjdz` float NULL DEFAULT NULL COMMENT '容量筒容积单值（ml）（试验1）',
  `v2_rltrjdz` float NULL DEFAULT NULL COMMENT '容量筒容积单值（ml）（试验2）',
  `v_pjz1` float NULL DEFAULT NULL COMMENT '容量筒容积平均值（ml）（试验1）',
  `v_pjz2` float NULL DEFAULT NULL COMMENT '容量筒容积平均值（ml）（试验1）',
  `pT` float NULL DEFAULT NULL COMMENT '试验温度T时水的密度',
  `psha` float NULL DEFAULT NULL COMMENT '砂的表观密度(g/cm3)',
  `mo` float NULL DEFAULT NULL COMMENT '容量筒质量(g)',
  `m2_rlthdjsdzzl` float NULL DEFAULT NULL COMMENT '容量筒和堆积砂的总质量(g)（试验1）',
  `m2_2_rlthdjsdzzl` float NULL DEFAULT NULL COMMENT '容量筒和堆积砂的总质量(g)（试验2）',
  `p1_djmddz` float NULL DEFAULT NULL COMMENT '堆积密度(g/cm3)单值（试验1）',
  `p2_djmddz` float NULL DEFAULT NULL COMMENT '堆积密度(g/cm3)单值（试验2）',
  `p_pjz1` float NULL DEFAULT NULL COMMENT '堆积密度(g/cm3)平均值（试验1）',
  `p_pjz2` float NULL DEFAULT NULL COMMENT '堆积密度(g/cm3)平均值（试验2）',
  `k` float NULL DEFAULT NULL COMMENT '堆积空隙率（%）',
  `p4_rlthjzsdzzl` float NULL DEFAULT NULL COMMENT '容量筒和紧装砂的总质量(g)（试验1）',
  `p4_2_rlthjzsdzzl` float NULL DEFAULT NULL COMMENT '容量筒和紧装砂的总质量(g)（试验2）',
  `y1_jzmddz` float NULL DEFAULT NULL COMMENT '紧装密度(g/cm3)单值（试验1）',
  `y2_jzmddz` float NULL DEFAULT NULL COMMENT '紧装密度(g/cm3)单值（试验2）',
  `y_pjz1` float NULL DEFAULT NULL COMMENT '紧装密度(g/cm3)平均值（试验1）',
  `y_pjz2` float NULL DEFAULT NULL COMMENT '紧装密度(g/cm3)平均值（试验2）',
  `t` float NULL DEFAULT NULL COMMENT '紧装空隙率（%）',
  `fjsm` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '附加声明',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '测试数据库表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of cx02
-- ----------------------------
INSERT INTO `cx02` VALUES (3, '2024-11-07 14:47:35', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (4, '2024-11-07 14:55:56', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (5, '2024-11-07 14:57:15', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (6, '2024-11-07 15:00:07', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (7, '2024-11-07 15:05:26', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (8, '2024-11-07 15:09:01', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (9, '2024-11-07 15:10:08', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (10, '2024-11-07 15:15:53', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (11, '2024-11-07 15:16:06', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (12, '2024-11-07 15:18:54', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (13, '2024-11-07 15:21:27', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (14, '2024-11-07 15:23:04', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (15, '2024-11-07 15:25:27', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (16, '2024-11-07 15:26:04', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (17, '2024-11-07 15:27:42', '11111,2222', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `cx02` VALUES (18, '2024-11-08 10:41:04', 'est aliqua do', -1760592942, 'cupidatat exercitatio', 'nulla aute fugiat', 'quis ullamco sunt offici', 'exercitation aliqua', 'Ut consectetur veniam ea', 'labore deserunt', 'est in Lo', 'nost', '2022-01-06', 'sunt est ', 'elit laboris adipisicing', 'sed sint Excepteur tempor non', 'dolor pariatur ', 'ipsum', '1980-11-28', 13, 'amet eiu', 'esse sed elit do', 71, 41, 10, 64, 80, 91, 79, 72, NULL, 20, 43, 10, 39, 48, 38, 90, 90, 25, 24, 93, 33, 15, 93, 24, 37, 'Lorem anim in');
INSERT INTO `cx02` VALUES (19, '2024-10-30 10:02:03', 'pariatur', 117397703, 'aute ullamco Excepteur exercitation non', 'aliqua consectetur officia fu', 'eiusmod est par', 'sit labore laborum', 'dolor est ea', 'laborum minim nisi occaecat', 'labore e', 'cillum', '1972-06-18', 'elit', 'laboris minim tempor', 'pariatur tempor', 'cupidatat aliquip veniam', 'et in a', '1958-12-23', 83, 'exercitation dolore', 'anim culpa ma', 51, 16, 42, 56, 61, 40, 83, 59, NULL, 93, 37, 26, 82, 76, 21, 22, 51, 78, 84, 69, 63, 19, 30, 59, 19, 'sit est proident voluptate');
INSERT INTO `cx02` VALUES (20, '2024-10-30 10:02:03', 'pariatur', 117397703, 'aute ullamco Excepteur exercitation non', 'aliqua consectetur officia fu', 'eiusmod est par', 'sit labore laborum', 'dolor est ea', 'laborum minim nisi occaecat', 'labore e', 'cillum', '1972-06-18', 'elit', 'laboris minim tempor', 'pariatur tempor', 'cupidatat aliquip veniam', 'et in a', '1958-12-23', 83, 'exercitation dolore', 'anim culpa ma', 51, 16, 42, 56, 61, 40, 83, 59, NULL, 93, 37, 26, 82, 76, 21, 22, 51, 78, 84, 69, 63, 19, 30, 59, 19, 'sit est proident voluptate');

SET FOREIGN_KEY_CHECKS = 1;
