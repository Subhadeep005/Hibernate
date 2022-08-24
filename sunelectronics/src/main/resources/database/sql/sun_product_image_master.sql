-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 19, 2017 at 10:35 AM
-- Server version: 5.7.11-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sunelectronics_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `sun_product_image_master`
--

CREATE TABLE IF NOT EXISTS `sun_product_image_master` (
  `IMAGE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `IMAGE_NAME` varchar(255) DEFAULT NULL,
  `PRODUCT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`IMAGE_ID`),
  UNIQUE KEY `UK_7lb6ecbpwghym1i83mo51bhtr` (`IMAGE_NAME`),
  KEY `FKohymhd22m90xvsebqnp2jeakr` (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `sun_product_image_master`
--

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (1, '1_1.jpg', 1);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (2, '1_2.jpg', 1);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (3, '1_3.jpg', 1);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (4, '1_4.jpg', 1);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (5, '1_5.jpg', 1);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (6, '2_1.jpg', 2);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (7, '2_2.jpg', 2);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (8, '2_3.jpg', 2);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (9, '2_4.jpg', 2);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (10,'2_5.jpg', 2);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (11, '3_1.jpg', 3);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (12, '3_2.jpg', 3);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (13, '3_3.jpg', 3);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (14, '3_4.jpg', 3);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (15, '3_5.jpg', 3);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (16, '4_1.jpg', 4);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (17, '4_2.jpg', 4);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (18, '4_3.jpg', 4);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (19, '4_4.jpg', 4);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (20, '4_5.jpg', 4);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (21, '5_1.jpg', 5);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (22, '5_2.jpg', 5);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (23, '5_3.jpg', 5);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (24, '5_4.jpg', 5);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (25, '5_5.jpg', 5);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (26, '6_1.jpg', 6);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (27, '6_2.jpg', 6);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (28, '6_3.jpg', 6);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (29, '6_4.jpg', 6);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (30, '6_5.jpg', 6);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (31, '7_1.jpg', 7);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (32, '7_2.jpg', 7);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (33, '7_3.jpg', 7);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (34, '7_4.jpg', 7);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (35, '7_5.jpg', 7);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (36, '8_1.jpg', 8);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (37, '8_2.jpg', 8);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (38, '8_3.jpg', 8);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (39, '8_4.jpg', 8);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (40, '8_5.jpg', 8);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (41, '9_1.jpg', 9);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (42, '9_2.jpg', 9);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (43, '9_3.jpg', 9);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (44, '9_4.jpg', 9);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (45, '9_5.jpg', 9);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (46, '10_1.jpg', 10);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (47, '10_2.jpg', 10);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (48, '10_3.jpg', 10);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (49, '10_4.jpg', 10);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (50, '10_5.jpg', 10);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (51, '11_1.jpg', 11);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (52, '11_2.jpg', 11);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (53, '11_3.jpg', 11);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (54, '11_4.jpg', 11);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (55, '11_5.jpg', 11);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (56, '12_1.jpg', 12);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (57, '12_2.jpg', 12);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (58, '12_3.jpg', 12);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (59, '12_4.jpg', 12);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (60, '12_5.jpg', 12);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (61, '13_1.jpg', 13);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (62, '13_2.jpg', 13);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (63, '13_3.jpg', 13);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (64, '13_4.jpg', 13);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (65, '13_5.jpg', 13);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (66, '14_1.jpg', 14);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (67, '14_2.jpg', 14);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (68, '14_3.jpg', 14);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (69, '14_4.jpg', 14);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (70, '14_5.jpg', 14);

INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (71, '15_1.jpg', 15);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (72, '15_2.jpg', 15);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (73, '15_3.jpg', 15);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (74, '15_4.jpg', 15);
INSERT INTO `sun_product_image_master` (`IMAGE_ID`, `IMAGE_NAME`, `PRODUCT_ID`) VALUES (75, '15_5.jpg', 15);


--
-- Constraints for dumped tables
--

--
-- Constraints for table `sun_product_image_master`
--
ALTER TABLE `sun_product_image_master`
  ADD CONSTRAINT `FKohymhd22m90xvsebqnp2jeakr` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `sun_product_master` (`PRODUCT_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
