/*
 Navicat Premium Data Transfer

 Source Server         : gan-test
 Source Server Type    : MySQL
 Source Server Version : 80023 (8.0.23)
 Source Host           : 123.249.94.36:3306
 Source Schema         : jarvis

 Target Server Type    : MySQL
 Target Server Version : 80023 (8.0.23)
 File Encoding         : 65001

 Date: 21/03/2023 18:58:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for agv
-- ----------------------------
DROP TABLE IF EXISTS `agv`;
CREATE TABLE `agv`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'agv ID',
  `agv_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'agv编号',
  `brand` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '品牌商',
  `control_type` smallint NOT NULL DEFAULT 0 COMMENT '控制类型：0：雷达agv-PLC 1：二维码-PLC',
  `function_type` smallint NOT NULL DEFAULT 0 COMMENT '类型：0：驼背  1：叉车  ',
  `status` smallint NOT NULL DEFAULT 1 COMMENT '状态（1正常 0停用）',
  `protocol_id` bigint NOT NULL DEFAULT 0 COMMENT '控制协议id',
  `protocol_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '控制协议名称',
  `map_id` bigint NOT NULL DEFAULT 0 COMMENT '地图ID',
  `work_area_type` smallint NOT NULL DEFAULT 0 COMMENT '工作区域类型：0：出库区域   1：入库区域',
  `ip_address` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT 'ip地址',
  `port` int NOT NULL DEFAULT 0 COMMENT '端口号',
  `load_capacity` bigint NOT NULL DEFAULT 0 COMMENT '载重(g)',
  `endurance_time` bigint NOT NULL DEFAULT 0 COMMENT '续航时间(秒)',
  `max_deviation` bigint NOT NULL DEFAULT 0 COMMENT '最大定位误差(毫米)',
  `remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `revision` int NULL DEFAULT 0 COMMENT '删除标志（0代表存在 1代表删除）',
  `created_by` bigint NULL DEFAULT NULL COMMENT '创建者',
  `created_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `updated_by` bigint NULL DEFAULT NULL COMMENT '更新者',
  `updated_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 205 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'agv表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of agv
-- ----------------------------
INSERT INTO `agv` VALUES (100, 'agv001', '雷神', 0, 0, 1, 100, '', 104, 0, '192.168.110.8', 502, 0, 0, 0, NULL, 0, NULL, '2022-11-02 16:52:08', NULL, '2022-11-02 16:52:08');
INSERT INTO `agv` VALUES (200, 'agv002', '小蓝', 1, 0, 1, 200, '', 200, 1, '192.168.110.8', 502, 0, 0, 0, NULL, 0, NULL, '2022-11-03 16:52:08', NULL, NULL);

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` bigint NOT NULL,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `state` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '州',
  `country` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '国家',
  `revision` int NOT NULL COMMENT '修订版本',
  `created_by` bigint NOT NULL COMMENT '创建人ID',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `updated_by` bigint NOT NULL COMMENT '修改人ID',
  `updated_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------


