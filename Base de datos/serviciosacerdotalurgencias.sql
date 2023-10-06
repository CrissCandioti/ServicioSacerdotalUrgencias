-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:22:21
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `serviciosacerdotalurgencias`
--
CREATE DATABASE IF NOT EXISTS `serviciosacerdotalurgencias` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `serviciosacerdotalurgencias`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto`
--

CREATE TABLE `contacto` (
  `idContacto` int(11) NOT NULL,
  `apellido` varchar(150) DEFAULT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `telefono` varchar(150) DEFAULT NULL,
  `parentesco` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contacto`
--

INSERT INTO `contacto` (`idContacto`, `apellido`, `nombre`, `telefono`, `parentesco`) VALUES
(2, 'SHOBERTO', 'CARLITOX', '0342', 'CONYUGE'),
(3, 'GISELA', 'LAMBET', '321', 'HIJA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermo`
--

CREATE TABLE `enfermo` (
  `idEnfermo` int(11) NOT NULL,
  `apellido` varchar(150) DEFAULT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `estadoCivil` varchar(150) DEFAULT NULL,
  `estadoConciencia` varchar(150) DEFAULT NULL,
  `domicilio` varchar(150) DEFAULT NULL,
  `sanatorio` varchar(150) DEFAULT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `idContacto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `enfermo`
--

INSERT INTO `enfermo` (`idEnfermo`, `apellido`, `nombre`, `edad`, `estadoCivil`, `estadoConciencia`, `domicilio`, `sanatorio`, `descripcion`, `idContacto`) VALUES
(2, 'SHAUL', 'SHOBERTO', 50, 'Soltero', 'Inconciente', 'Caferatta 9753', 'Iturraspe', 'Neumonia', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `guardia`
--

CREATE TABLE `guardia` (
  `idGuardia` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `idVocal` int(11) DEFAULT NULL,
  `idTelefonista` int(11) DEFAULT NULL,
  `idChofer` int(11) DEFAULT NULL,
  `idAcompañante` int(11) DEFAULT NULL,
  `idSacerdote` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `guardia`
--

INSERT INTO `guardia` (`idGuardia`, `fecha`, `idVocal`, `idTelefonista`, `idChofer`, `idAcompañante`, `idSacerdote`) VALUES
(1, '2023-10-04', 4, 4, 4, 4, 1),
(2, '2023-10-05', 4, 8, 4, 7, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `guardian`
--

CREATE TABLE `guardian` (
  `idGuardian` int(11) NOT NULL,
  `dni` varchar(150) NOT NULL,
  `apellido` varchar(150) DEFAULT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `telefono` varchar(150) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `estadoCivil` varchar(150) DEFAULT NULL,
  `rol` varchar(150) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `guardian`
--

INSERT INTO `guardian` (`idGuardian`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `fechaNacimiento`, `estadoCivil`, `rol`, `estado`) VALUES
(4, '3315', 'Paola', 'GUER', 'JR 9753', '3312', '2023-10-02', 'Soltero', 'Conductor', 0),
(7, '1234566', 'SHOBERTO', 'CARLITOX', 'LAS HERAS', '3312', '2023-10-02', 'CASADO', 'CONDUCTOR', 1),
(8, '2222222', 'CAND', 'CAND', 'CASDS', '1', '2023-10-03', 'casado', 'Telefonista', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `fechaPedido` date DEFAULT NULL,
  `idGuardia` int(11) DEFAULT NULL,
  `idEnfermo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `fechaPedido`, `idGuardia`, `idEnfermo`) VALUES
(2, '2023-10-04', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sacerdote`
--

CREATE TABLE `sacerdote` (
  `idSacerdote` int(11) NOT NULL,
  `dni` varchar(150) DEFAULT NULL,
  `apellido` varchar(150) DEFAULT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `telefono` varchar(150) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sacerdote`
--

INSERT INTO `sacerdote` (`idSacerdote`, `dni`, `apellido`, `nombre`, `telefono`, `fechaNacimiento`, `estado`) VALUES
(1, '1234567', 'Merlo', 'paco', '2', '2023-10-02', 0),
(5, '1234543', 'GWEN', 'STACY', '0342', '2023-10-03', 0),
(7, '1111111', 'RAUL', 'PEREZ', '1', '2023-10-03', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contacto`
--
ALTER TABLE `contacto`
  ADD PRIMARY KEY (`idContacto`);

--
-- Indices de la tabla `enfermo`
--
ALTER TABLE `enfermo`
  ADD PRIMARY KEY (`idEnfermo`),
  ADD KEY `idContacto` (`idContacto`);

--
-- Indices de la tabla `guardia`
--
ALTER TABLE `guardia`
  ADD PRIMARY KEY (`idGuardia`),
  ADD KEY `idVocal` (`idVocal`),
  ADD KEY `idTelefonista` (`idTelefonista`),
  ADD KEY `idChofer` (`idChofer`),
  ADD KEY `idAcompañante` (`idAcompañante`),
  ADD KEY `idSacerdote` (`idSacerdote`);

--
-- Indices de la tabla `guardian`
--
ALTER TABLE `guardian`
  ADD PRIMARY KEY (`idGuardian`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idGuardia` (`idGuardia`),
  ADD KEY `idEnfermo` (`idEnfermo`);

--
-- Indices de la tabla `sacerdote`
--
ALTER TABLE `sacerdote`
  ADD PRIMARY KEY (`idSacerdote`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contacto`
--
ALTER TABLE `contacto`
  MODIFY `idContacto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `enfermo`
--
ALTER TABLE `enfermo`
  MODIFY `idEnfermo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `guardia`
--
ALTER TABLE `guardia`
  MODIFY `idGuardia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `guardian`
--
ALTER TABLE `guardian`
  MODIFY `idGuardian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sacerdote`
--
ALTER TABLE `sacerdote`
  MODIFY `idSacerdote` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `enfermo`
--
ALTER TABLE `enfermo`
  ADD CONSTRAINT `enfermo_ibfk_1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`);

--
-- Filtros para la tabla `guardia`
--
ALTER TABLE `guardia`
  ADD CONSTRAINT `guardia_ibfk_1` FOREIGN KEY (`idVocal`) REFERENCES `guardian` (`idGuardian`),
  ADD CONSTRAINT `guardia_ibfk_2` FOREIGN KEY (`idTelefonista`) REFERENCES `guardian` (`idGuardian`),
  ADD CONSTRAINT `guardia_ibfk_3` FOREIGN KEY (`idChofer`) REFERENCES `guardian` (`idGuardian`),
  ADD CONSTRAINT `guardia_ibfk_4` FOREIGN KEY (`idAcompañante`) REFERENCES `guardian` (`idGuardian`),
  ADD CONSTRAINT `guardia_ibfk_5` FOREIGN KEY (`idSacerdote`) REFERENCES `sacerdote` (`idSacerdote`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idGuardia`) REFERENCES `guardia` (`idGuardia`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idEnfermo`) REFERENCES `enfermo` (`idEnfermo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
