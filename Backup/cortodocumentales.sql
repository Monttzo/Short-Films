-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-09-2021 a las 11:10:52
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cortodocumentales`
--
CREATE DATABASE IF NOT EXISTS `cortodocumentales` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cortodocumentales`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director`
--

DROP TABLE IF EXISTS `director`;
CREATE TABLE IF NOT EXISTS `director` (
  `idDirector` int(11) NOT NULL AUTO_INCREMENT,
  `nombreDirector` varchar(25) NOT NULL,
  `apellidoDirector` varchar(25) NOT NULL,
  `nacionalidadDirector` varchar(20) NOT NULL,
  PRIMARY KEY (`nombreDirector`),
  UNIQUE KEY `idDirector` (`idDirector`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `director`:
--

--
-- Volcado de datos para la tabla `director`
--

INSERT INTO `director` VALUES
(4, 'Carol', 'Dysinger', 'Estadounidense'),
(3, 'Daan', 'Bol', 'Neerlandes'),
(5, 'Rayka', 'Zehtabchi', 'Inrani'),
(2, 'Robin', 'Petré', 'Frances'),
(1, 'Zofia', 'Kowalewska', 'Polaca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documental`
--

DROP TABLE IF EXISTS `documental`;
CREATE TABLE IF NOT EXISTS `documental` (
  `tituloDocumental` varchar(100) NOT NULL,
  `añoDocumental` int(11) NOT NULL,
  `nombreDirectorFk` varchar(25) NOT NULL,
  `paisDocumental` varchar(25) NOT NULL,
  PRIMARY KEY (`tituloDocumental`),
  KEY `Fk_nombreDirectorFk` (`nombreDirectorFk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `documental`:
--   `nombreDirectorFk`
--       `director` -> `nombreDirector`
--

--
-- Volcado de datos para la tabla `documental`
--

INSERT INTO `documental` VALUES
('Close Ties', 2016, 'Zofia', 'Polonia'),
('Learning to Skateboard in a Warzone', 2019, 'Carol', 'Gran Bretaña'),
('Period. End of Sentence', 2020, 'Rayka', 'India'),
('Pulse', 2017, 'Robin', 'Hungría'),
('Rocknrollers', 2018, 'Daan', 'Paises Bajos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transmision`
--

DROP TABLE IF EXISTS `transmision`;
CREATE TABLE IF NOT EXISTS `transmision` (
  `idTransmision` int(11) NOT NULL AUTO_INCREMENT,
  `aliasUsuarioFK` varchar(25) NOT NULL,
  `tituloDocumentalFK` varchar(100) NOT NULL,
  `fechaTransmision` datetime NOT NULL,
  PRIMARY KEY (`idTransmision`),
  KEY `FK_aliasUsuarioFK` (`aliasUsuarioFK`),
  KEY `FK_tituloDocumentalFK` (`tituloDocumentalFK`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `transmision`:
--   `aliasUsuarioFK`
--       `usuario` -> `Alias`
--   `tituloDocumentalFK`
--       `documental` -> `tituloDocumental`
--

--
-- Volcado de datos para la tabla `transmision`
--

INSERT INTO `transmision` VALUES
(1, 'lucky', 'Close Ties', '2018-10-25 20:00:00'),
(2, 'lucky', 'Pulse', '2019-03-15 18:30:00'),
(3, 'lucky', 'Rocknrollers', '2019-05-20 20:30:00'),
(4, 'malopez', 'Close Ties', '2018-05-20 20:30:00'),
(5, 'malopez', 'Rocknrollers', '2020-01-20 20:30:00'),
(6, 'diva', 'Period. End of Sentence', '2019-05-20 20:30:00'),
(7, 'diva', 'Rocknrollers', '2018-06-22 21:30:00'),
(8, 'diva', 'Learning to Skateboard in a Warzone', '2020-03-17 15:30:20'),
(9, 'dreamer', 'Learning to Skateboard in a Warzone', '2020-03-17 15:30:20'),
(10, 'dreamer', 'Pulse', '2020-04-10 18:30:20'),
(11, 'ninja', 'Close Ties', '2020-02-17 20:30:20'),
(12, 'ninja', 'Rocknrollers', '2020-02-10 16:30:20'),
(13, 'ninja', 'Pulse', '2020-03-27 18:30:20'),
(14, 'rose', 'Rocknrollers', '2020-03-20 21:30:20'),
(15, 'green', 'Period. End of Sentence', '2020-01-10 17:30:20'),
(17, 'green', 'Close Ties', '2020-03-17 18:30:20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `Alias` varchar(25) NOT NULL,
  `nombreUsuario` varchar(25) NOT NULL,
  `apellidoUsuario` varchar(25) NOT NULL,
  `emailUsuario` varchar(50) NOT NULL,
  `contactoUsuario` bigint(10) NOT NULL,
  `claveUsuario` varchar(25) NOT NULL,
  `fechaRUsuario` date NOT NULL,
  PRIMARY KEY (`Alias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `usuario`:
--

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` VALUES
('diva', 'Ana', 'Diaz', 'divaAna@gmail.com', 3191126003, 'diva', '2021-08-29'),
('dreamer', 'Luis', 'Rojas', 'dreamerLuis@gmail.com', 3043314281, 'dreamer', '2021-08-29'),
('green', 'Jorge', 'Rodriguez', 'greenJorge@gmail.com', 3076234631, 'green', '2021-08-29'),
('lucky', 'Pedro', 'Perez', 'luckypedro@gmail.com', 3018765436, 'lucky', '2021-08-29'),
('malopez', 'Maria', 'Lopez', 'malopaez@gmail.com', 3201681072, 'malopaez', '2021-08-29'),
('neon', 'Nelson', 'Ruiz', 'neonNelson@gmail.com', 3015288498, 'neon', '2021-08-29'),
('ninja', 'Andres', 'Cruz', 'ninjaAndres@gmail.com', 3115678432, 'ninja', '2021-08-29'),
('rose', 'Claudia', 'Mendez', 'roseClaudia@gmail.com', 3117254609, 'rose', '2021-08-29');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `documental`
--
ALTER TABLE `documental`
  ADD CONSTRAINT `Fk_nombreDirectorFk` FOREIGN KEY (`nombreDirectorFk`) REFERENCES `director` (`nombreDirector`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `transmision`
--
ALTER TABLE `transmision`
  ADD CONSTRAINT `FK_aliasUsuarioFK` FOREIGN KEY (`aliasUsuarioFK`) REFERENCES `usuario` (`Alias`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_tituloDocumentalFK` FOREIGN KEY (`tituloDocumentalFK`) REFERENCES `documental` (`tituloDocumental`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
