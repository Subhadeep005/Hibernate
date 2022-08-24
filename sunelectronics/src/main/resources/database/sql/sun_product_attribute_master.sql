-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 16, 2017 at 05:50 PM
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
-- Table structure for table `sun_product_attribute_master`
--

CREATE TABLE IF NOT EXISTS `sun_product_attribute_master` (
  `ATTRIBUTE_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ATTRIBUTE_NAME` varchar(255) DEFAULT NULL,
  `ATTRIBUTE_VALUE` varchar(255) DEFAULT NULL,
  `PRODUCT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ATTRIBUTE_ID`),
  KEY `FK838yytrufp8m70vve5eyo0k4f` (`PRODUCT_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sun_product_attribute_master`
--

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (1, 'Sales Package', 'Handset, Lightening Charger, Quick Start Guide, Data Cable, Headphone', 1);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (2, 'Model Number', 'A1586', 1);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (3, 'Model Name', 'iPhone 6s', 1);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (4, 'Color', 'Silver', 1);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (5, 'Internal Storage', '32 GB', 1);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (6, 'Sales Package', '1 Handset, 1 Set of EarPods, 1 Lightning to USB Cable, 1 USB Power Adapter', 2);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (7, 'Model Number', 'A1530', 2);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (8, 'Model Name', 'iPhone 5s', 2);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (9, 'Color', 'Space Grey', 2);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (10, 'Internal Storage', '16 GB', 2);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (11, 'Sales Package', 'Laptop, Battery, Power Adaptor, User Guide, Warranty Documents', 3);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (12, 'Model Number', 'Ideapad 110', 3);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (13, 'Model Name', '80UD00RWIH', 3);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (14, 'Color', 'Black', 3);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (15, 'RAM', '4 GB', 3);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (16, 'HDD Capacity', '500 GB', 3);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (17, 'Sales Package', 'MacBook Air, MagSafe 2 Power Adapter, AC Wall Plug, Power Cord, Printed Documentation', 4);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (18, 'Model Number', 'A1466', 4);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (19, 'Model Name', 'MacBook Air', 4);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (20, 'Color', 'Silver', 4);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (21, 'RAM', '4 GB', 4);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (22, 'HDD Capacity', '128 GB', 4);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (23, 'Printing Method', 'Inkjet', 5);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (24, 'Type-Multi', 'function', 5);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (25, 'Model Name', 'DeskJet Ink Advantage 3835 All-in-One', 5);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (26, 'Printing Output', 'Color', 5);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (27, 'Functions-Print', 'Copy, Scan, Fax', 5);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (28, 'Refill Type-Ink', 'Cartridge', 5);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (29, 'Sales Package', 'LR6/L40 (AA-size) alkaline batteries (x4) {sup(*)}, Lens Cap LC-CP25 (with cord), USB Cable UC-E16, ', 6);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (30, 'Type', 'Point & Shoo', 6);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (31, 'Model Name', 'Coolpix L340', 6);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (32, 'Effective Pixel', '20.2 MP', 6);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (33, 'Maximum Shutter Speed', '1/1500 sec', 6);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (34, 'Sales Package', 'Lens Cap LC-CP25 (with cord), USB Cable UC-E16, ', 7);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (35, 'Type', 'Point & Shoo', 7);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (36, 'Model Name', 'Canon Coolpix', 7);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (37, 'Effective Pixel', '25.2 MP', 7);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (38, 'Maximum Shutter Speed', '1/1500 sec', 7);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (39, 'Sales Package', 'Sub-Woofer, 2 Satellites, RCA Cable, Remote control (Battery Included) User Manual', 8);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (40, 'Model Name', 'Seetara B1', 8);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (41, 'Type', 'Home Audio Speaker', 8);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (42, 'Portable', 'No', 8);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (43, 'Bluetooth', 'No', 8);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (44, 'Memory Card Slot', 'Yes', 8);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (45, 'Brand', 'Tecnia', 9);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (46, 'Model Number', 'Atom 504 Bluetooth 5.1', 9);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (47, 'Supported Device', 'Laptop, iPhone, Gaming Console, MP3 Player, VCD Player, iPod, PC, TV', 9);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (48, 'Sales Package', '1 TV Unit, Stand, Web Cruiser Air Mouse (Rechargeable), User Manual', 10);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (49, 'Model Name', '42FIE', 10);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (50, 'Display Size', '105.66 cm (42)', 10);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (51, 'Screen Type', 'LED', 10);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (52, 'HD Technology & Resolution', 'Full HD, 1920 x 1080', 10);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (53, '3D', 'NO', 10);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (54, 'Sales Package', 'Stand, Web Cruiser Air Mouse (Rechargeable), User Manual', 11);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (55, 'Model Name', '65FIE', 11);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (56, 'Display Size', '110.66cm cm (42)', 11);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (57, 'Screen Type', 'LED', 11);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (58, 'HD Technology & Resolution', 'Full HD, 1920 x 1080', 11);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (59, 'In the Box', '1 Washing Machine, User Manual, Drain Hose, Water Inlet Pipe', 12);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (60, 'Brand', 'IFB', 12);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (61, 'Model Name', 'TL- RDW Aqua', 12);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (62, 'Type', 'Washing Machine', 12);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (63, 'Function Type', 'Fully Automatic Top Load', 12);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (64, 'Washing Capacity', '6.5 kg', 12);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (65, 'In the Box', 'Washing Machine, Drain Hose, Water Inlet Pipe', 13);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (67, 'Brand', 'Samsung', 13);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (68, 'Model Name', 'TL- RDW Aqua', 13);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (69, 'Type', 'Washing Machine', 13);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (70, 'Function Type', 'Fully Automatic Top Load', 13);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (71, 'Washing Capacity', '8.5 kg', 13);


INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (72, 'Color', 'Black', 14);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (73, 'Model Name', 'SHP1900/97', 14);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (74, 'Headphone Type', 'Over the Ear', 14);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (75, 'Inline Remote', 'NO', 14);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (76, 'Sales Package', 'Headphone', 14);

INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (77, 'Sales Package', '1 Pendrive', 15);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (78, 'Model Name', 'V152W', 15);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (79, 'Opening Mechanism', 'Standard', 15);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (80, 'Read Speed', '14 MB/s', 15);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (81, 'Write Speed', '4 MB/s', 15);
INSERT INTO `sun_product_attribute_master` (`ATTRIBUTE_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_VALUE`, `PRODUCT_ID`) VALUES (82, 'Part Number', 'HPFD152W-16', 15);


--
-- Constraints for dumped tables
--

--
-- Constraints for table `sun_product_attribute_master`
--
ALTER TABLE `sun_product_attribute_master`
  ADD CONSTRAINT `FK838yytrufp8m70vve5eyo0k4f` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `Sun_product_master` (`PRODUCT_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
