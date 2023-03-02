-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 01 Mar 2023, 19:14
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
-- Baza danych: `to_do_database`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `to_do`
--

CREATE TABLE `to_do` (
  `id` int(3) NOT NULL,
  `title` varchar(100) COLLATE utf8mb4_polish_ci NOT NULL,
  `description` text COLLATE utf8mb4_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_polish_ci;

--
-- Zrzut danych tabeli `to_do`
--

INSERT INTO `to_do` (`id`, `title`, `description`) VALUES
(1, 'Zadanie 1', 'Pozamiatać'),
(2, 'Zadanie 2', 'Umyć Auto'),
(3, 'Zadanie 3', 'Wynieść Kartony'),
(4, 'Zadanie 4', 'Zrobić Obiad'),
(5, 'Zadanie 5', 'Posprzątać w Garażu'),
(6, 'Zadanie 6', 'Odkurzyć Dom'),
(7, 'Zadanie 7', 'Zrobić Zadanie ze Szkoły');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `to_do`
--
ALTER TABLE `to_do`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `to_do`
--
ALTER TABLE `to_do`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
