-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 19, 2017 at 10:24 AM
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
-- Table structure for table `sun_product_master`
--

CREATE TABLE IF NOT EXISTS `sun_product_master` (
  `PRODUCT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ADDITIONAL_INFO` varchar(255) DEFAULT NULL,
  `CATEGORY` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `MANUFACTURER` varchar(255) DEFAULT NULL,
  `MODEL` varchar(255) DEFAULT NULL,
  `PRODUCT_NAME` varchar(255) DEFAULT NULL,
  `PRICE` decimal(19,2) DEFAULT NULL,
  `QUANTITY`, int(11) DEFAULT NULL,
  `SUB_CATEGORY` varchar(255) DEFAULT NULL,
  `PRODUCT_URL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;


INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(1, 
'N/A',
'Electronics',
'Apple',
'Put away that basic phone and be an iPhone user with the Apple 5S.
You can now browse with better speed, protect your data with the fingerprint scanner, 
and look stylish as this phone comes with the Apple signature design, 
lightweight and very comfortable to hold.', 
'iPhone 6s', 'Apple Iphone-6', '36000.00', 10, 'Mobile');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(2, 
'N/A', 
'Electronics',
'Apple',
'Put away that basic phone and be an iPhone user with the Apple 5S.
You can now browse with better speed, protect your data with the fingerprint scanner, 
and look stylish as this phone comes with the Apple signature design, 
lightweight and very comfortable to hold.', 
'iPhone 5s', 'Apple Iphone-5', '18000.00', 10, 'Mobile');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(3, 
'Lenovo Core i3 6th Gen ',
'Electronics', 
'Lenovo', 
'Lenovo Core i3 6th Gen - (4 GB/500 GB HDD/DOS) Ideapad 110 
Notebook  (15.6 inch, Black, 2.2 kg)', 
'Ideapad 110', 'Lenovo Core i3 6th Gen', '28000.00', 10, 'Laptop');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(4, 
'Apple MacBook Air Core i5 5th Gen',
'Electronics', 
 'Apple', 
 'Apple MacBook Air Core i5 5th Gen -
 (8 GB/128 GB SSD/Mac OS Sierra) A1466  (13.3 inch, SIlver, 1.35 kg)', 
 'PRO', 'MacBook', '65000.00', 10, 'Laptop');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(5, 
'HP DeskJet Ink Advantage 3835',
'Electronics', 
'HP', 
'Recommended Monthly Page Volume: 100 to 300, 
Processor Speed: 180 MHz, Automatic Paper Sensor, 
Replacement Cartridges: HP 680 Black Ink Cartridge, 
HP 680 Tri-color Ink Cartridge, HP ePrint Capability, 
Mobile Printing Capability, Maximum Memory: 512 MB DDR1, 
128 M Flash, Media Weights Supported: A4 - 60 to 90 g/m, HP Envelopes - 75 to 90 g/m; HP Cards - Upto 200 g/m, HP 10 x 15 cm Photo Paper - Upto 300 g/m, Scan File Format: pdf, bmp, jpg, gif, tif, tif, png, ', 
'HP DeskJet', 'HP', '4500.00', 10, 'Printer');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(6, 
'Nikon Coolpix L340 Point & Shoot Camera  (Black)',
'Electronics', 
'Nikon', 
'Memories worth cherishing come in all forms. From weddings to intimate moments such as welcoming a new member to the family, 
Nikon brings to you this point-and-shoot camera to capture them all. The L340 is designed to capture both wide-angle pictures such as family portraits as well as extreme close-up pictures.', 
'Coolpix L340', 'Nikon Coolpix', '25000.00', 10, 'Camera');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(7, 
'Canon Coolpix L340 Point & Shoot Camera  (Black)', 
'Electronics',
'Canon', 
'Memories worth cherishing come in all forms. From weddings to intimate moments such as welcoming a new member to the family, 
Canon brings to you this point-and-shoot camera to capture them all. The L340 is designed to capture both wide-angle pictures such as family portraits as well as extreme close-up pictures.', 
'Coolpix L340', 'Canon Coolpix', '25000.00', 10, 'Camera');


INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(8, 
'iBall Seetara B1 Home Audio Speaker ',
'Electronics', 
'iBall', 
'iBall Seetara B1 Home Audio Speaker ', 
'iBall Seetara', 'iBall', '2500.00', 10, 'Sound Device');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(9, 
'Tecnia Atom 504 Bluetooth 5.1 5.1 Home Cinema', 
'Electronics',
'Tecnia', 
'Tecnia Atom 504 Bluetooth 5.1 Channel Home Theater 
Multimedia Audio Speaker 
System comes at an affordable price and is easy to set up in your room.', 
'Tecnia Atom 504', 'Tecnia', '15000.00', 10, 'Sound Device');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(10, 
'Onida 105.66cm (42) Full HD Smart LED TV', 
'Electronics',
'Onida', 
'Onida 105.66cm (42) Full HD Smart LED TV  (42FIE, 3 x HDMI, 3 x USB)', 
'Onida 105.66cm (42) Full HD', 'HD Smart LED TV', '35000.00', 10, 'Television');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(11, 
'Onida 110.66cm (42) Full HD Smart LED TV', 
'Electronics',
'Onida', 
'Onida 110.66cm (42) Full HD Smart LED TV  (42FIE, 3 x HDMI, 3 x USB)', 
'Onida 110.66cm (42) Full HD', 'HD Smart LED TV', '56000.00', 10, 'Television');


INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(12, 
'Onida washing machine', 
'Electronics',
'Onida', 
'Are you planning on investing in a new washing machine? 
Take a look at this IFB fully automatic washing machine with a Crescent Moon drum that protects your clothes from damage. 
This washing machine features the Triadic Pulsator Cleaning Engine that ensures your clothes are thoroughly but gently cleaned with 
all the stains removed, ensuring the clothes last longer as well. It has a maximum wash load capacity of 6.5kg.', 
'Washing Machine', 'Washing Machine', '8500.00', 10, 'Washing Machine');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(13, 
'Samsung washing machine', 
'Electronics',
'Samsung', 
'Are you planning on investing in a new washing machine? 
Take a look at this IFB fully automatic washing machine with a Crescent Moon drum that protects your clothes from damage. 
This washing machine features the Triadic Pulsator Cleaning Engine that ensures your clothes are thoroughly but gently cleaned with 
all the stains removed, ensuring the clothes last longer as well. It has a maximum wash load capacity of 8.5kg.', 
'Washing Machine', ' Samsung Washing Machine', '15000.00', 10, 'Washing Machine');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(14, 
'Philips SHP1900/97 Wired Headphones',
'Electronics', 
'Philips', 
'"Want to get away from the hustle and bustle of the outside world? 
Plug in this pair of over-the-head Philips headphones and lose yourself to the transformative world of music. 
Its adjustable headbands, ear cushion designs, and lightweight design enhance comfort. 
It also offers excellent bass response and optimum sound quality."', 
'Wired Headphones', 'Philips SHP1900/97', '1500.00', 10, 'Headphones');

INSERT INTO `sun_product_master` (`PRODUCT_ID`, `ADDITIONAL_INFO`, `CATEGORY`, `MANUFACTURER`, `DESCRIPTION`, `MODEL`, `PRODUCT_NAME`, `PRICE`, `QUANTITY`, `SUB_CATEGORY`) VALUES
(15, 
'HP V152W 16 GB Pen Drive ', 
'Electronics',
'HP', 
'Handy sliding lidless design, cap-less without needing to worry losing caps. 
Light and easy to carry with built-in strap hole design. 
Offers a handy mobile storage solution to save, 
transport and share your files, photos, videos, music and more!', 
'Pen Drive', 'HP V152W', '400.00', 10, 'Pen Drive');



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
