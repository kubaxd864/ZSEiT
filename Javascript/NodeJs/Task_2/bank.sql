-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 21 Lut 2023, 21:37
-- Wersja serwera: 10.4.25-MariaDB
-- Wersja PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `bank`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `accounts`
--

CREATE TABLE `accounts` (
  `AccountID` int(3) NOT NULL,
  `AccountOwnerID` int(3) NOT NULL,
  `AccountNumber` bigint(16) NOT NULL,
  `AccountPin` int(4) NOT NULL,
  `Balance` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Zrzut danych tabeli `accounts`
--

INSERT INTO `accounts` (`AccountID`, `AccountOwnerID`, `AccountNumber`, `AccountPin`, `Balance`) VALUES
(1, 1, 1234567890123453, 1234, 1180400),
(2, 2, 9876543211334561, 3342, 2000),
(3, 3, 1234099034511231, 2137, 5500),
(4, 4, 6634232100002322, 7012, 44000),
(5, 5, 1132424576553300, 5561, 100),
(6, 6, 1232434576543345, 4110, 100000),
(7, 7, 1234507893323053, 6712, 7250),
(8, 1, 5876240472071433, 1390, 0),
(9, 1, 3170120654336724, 6913, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `clients`
--

CREATE TABLE `clients` (
  `ClientID` int(3) NOT NULL,
  `FullName` varchar(80) COLLATE utf8mb4_polish_ci NOT NULL,
  `Gender` varchar(20) COLLATE utf8mb4_polish_ci NOT NULL,
  `Age` int(3) NOT NULL,
  `Phonenumber` int(9) NOT NULL,
  `Address` varchar(40) COLLATE utf8mb4_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Zrzut danych tabeli `clients`
--

INSERT INTO `clients` (`ClientID`, `FullName`, `Gender`, `Age`, `Phonenumber`, `Address`) VALUES
(1, 'Jacek Łoś', 'Male', 25, 355456789, 'Miodowa 12 '),
(2, 'Anna Kowalska', 'Female', 23, 355234689, 'Malińska 28'),
(3, 'Paweł Jumper', 'Male', 38, 355412376, 'Raymonta 36'),
(4, 'Hanna Pawlak', 'Female', 55, 123122224, 'Akacjowa 1'),
(5, 'Łukasz Dzik', 'Male', 19, 355456789, 'Złota 10'),
(6, 'Albert Pawlak', 'Male', 57, 213643222, 'Akacjowa 1'),
(7, 'Aleksander Witkowski', 'Male', 35, 111808333, 'Kolorowa 21');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`AccountID`);

--
-- Indeksy dla tabeli `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`ClientID`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `accounts`
--
ALTER TABLE `accounts`
  MODIFY `AccountID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT dla tabeli `clients`
--
ALTER TABLE `clients`
  MODIFY `ClientID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
