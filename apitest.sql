-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.19 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for apitest
CREATE DATABASE IF NOT EXISTS `apitest` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `apitest`;

-- Dumping structure for table apitest.api_hit_details_tbl
CREATE TABLE IF NOT EXISTS `api_hit_details_tbl` (
  `id` int NOT NULL AUTO_INCREMENT,
  `api_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `api_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hit_date` date NOT NULL,
  `hit_count` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table apitest.api_hit_details_tbl: ~0 rows (approximately)
/*!40000 ALTER TABLE `api_hit_details_tbl` DISABLE KEYS */;
INSERT INTO `api_hit_details_tbl` (`id`, `api_key`, `api_url`, `hit_date`, `hit_count`) VALUES
	(121, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(122, 'asmtestkey', 'apitest1', '2020-08-19', 0),
	(123, 'asmtestkey', 'apitest1', '2020-08-19', 0),
	(124, 'asmtestkey', 'apitest1', '2020-08-19', 0),
	(125, 'asmtestkey', 'apitest1', '2020-08-19', 0),
	(126, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(127, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(128, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(129, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(130, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(131, 'asmtestkey', 'apitest1', '2020-08-18', 0),
	(132, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(133, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(134, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(135, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(136, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(137, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(138, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(139, 'asmtestkey1', 'apitest1', '2020-08-18', 0),
	(140, 'asmtestkey1', 'apitest2', '2020-08-18', 0),
	(141, 'asmtestkey1', 'apitest2', '2020-08-18', 0),
	(142, 'asmtestkey1', 'apitest2', '2020-08-18', 0),
	(143, 'asmtestkey1', 'apitest2', '2020-08-18', 0),
	(144, 'asmtestkey1', 'apitest2', '2020-08-18', 0),
	(145, 'asmtestkey1', 'apitest3', '2020-08-18', 0),
	(146, 'asmtestkey3', 'apitest3', '2020-08-18', 0),
	(147, 'asmtestkey3', 'apitest3', '2020-08-18', 0),
	(148, 'asmtestkey3', 'apitest3', '2020-08-20', 0),
	(149, 'asmtestkey3', 'apitest3', '2020-08-18', 0),
	(150, 'asmtestkey3', 'apitest3', '2020-08-18', 0),
	(151, 'asmtestkey3', 'apitest3', '2020-08-18', 0),
	(152, 'asmtestkey4', 'apitest4', '2020-08-18', 0),
	(153, 'asmtestkey4', 'apitest4', '2020-08-18', 0),
	(154, 'asmtestkey4', 'apitest4', '2020-08-18', 0),
	(155, 'asmtestkey5', 'apitest5', '2020-08-18', 0);
/*!40000 ALTER TABLE `api_hit_details_tbl` ENABLE KEYS */;

-- Dumping structure for table apitest.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table apitest.hibernate_sequence: 1 rows
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(156);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
