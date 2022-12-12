-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2022 at 01:53 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_restaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_menu`
--

CREATE TABLE `tb_menu` (
  `NoMeja` varchar(2) DEFAULT NULL,
  `SushiTunaRoll` varchar(250) NOT NULL,
  `SushiSalmonRoll` varchar(250) NOT NULL,
  `SushiCaliforniaRoll` varchar(250) NOT NULL,
  `SweetPotatoRoll` varchar(250) NOT NULL,
  `SushiCrabRoll` varchar(250) NOT NULL,
  `OcaTea` varchar(250) NOT NULL,
  `OrangeJuice` varchar(250) NOT NULL,
  `SweetTea` varchar(250) NOT NULL,
  `Cappucino` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_menu`
--

INSERT INTO `tb_menu` (`NoMeja`, `SushiTunaRoll`, `SushiSalmonRoll`, `SushiCaliforniaRoll`, `SweetPotatoRoll`, `SushiCrabRoll`, `OcaTea`, `OrangeJuice`, `SweetTea`, `Cappucino`) VALUES
('2', 'null', 'null', 'Sushi California Roll=2', 'Sweet Potato Roll=2', 'Sushi Crab Roll=2', 'null', 'null', 'Sweet Tea=2', 'Cappucino=2'),
('4', 'null', 'Sushi Salmon Roll=3', 'Sushi California Roll=2', 'null', 'Sushi Crab Roll=2', 'null', 'null', 'Sweet Tea=2', 'Cappucino=2'),
('3', 'Sushi Tuna Roll=2', 'Sushi Salmon Roll=2', 'null', 'null', 'null', 'null', 'null', 'Sweet Tea=2', 'null'),
('5', 'Sushi Tuna Roll=1', 'Sushi Salmon Roll=2', 'Sushi California Roll=1', 'null', 'null', 'null', 'Orange Juice=1', 'Sweet Tea=2', 'null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_menu`
--
ALTER TABLE `tb_menu`
  ADD UNIQUE KEY `NoMeja` (`NoMeja`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
