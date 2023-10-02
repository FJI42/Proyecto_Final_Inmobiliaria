-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2023 a las 16:41:14
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
-- Base de datos: ` inmobiliaria_pf`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratoalquiler`
--

CREATE TABLE `contratoalquiler` (
  `ID_Contrato` int(11) NOT NULL,
  `Inquilino` int(11) NOT NULL,
  `Fecha_Final` datetime NOT NULL,
  `Fecha_Inicio` datetime NOT NULL,
  `Fecha_Realizacion` datetime NOT NULL,
  `Marca` varchar(50) NOT NULL,
  `Propiedad` int(11) NOT NULL,
  `Vendedor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `ID_Inquilino` int(11) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `DNI` int(8) NOT NULL,
  `Detalles` varchar(100) NOT NULL,
  `Tipo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad inmueble`
--

CREATE TABLE `propiedad inmueble` (
  `ID_Local` int(11) NOT NULL,
  `Accesibilidad` varchar(50) NOT NULL,
  `Caracteristicas` varchar(100) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Dueño` int(11) NOT NULL,
  `EstadoLocal` varchar(50) NOT NULL,
  `Forma` varchar(100) NOT NULL,
  `Ocupante` int(11) NOT NULL,
  `PrecioTazado` float NOT NULL,
  `SuperficieMin` int(11) NOT NULL,
  `TipoLocal` varchar(50) NOT NULL,
  `Zona` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `ID_Propietario` int(11) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `DNI` int(8) NOT NULL,
  `Domicilio` varchar(100) NOT NULL,
  `Telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  ADD PRIMARY KEY (`ID_Contrato`),
  ADD UNIQUE KEY `Inquilino` (`Inquilino`,`Propiedad`),
  ADD KEY `Propiedad` (`Propiedad`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`ID_Inquilino`);

--
-- Indices de la tabla `propiedad inmueble`
--
ALTER TABLE `propiedad inmueble`
  ADD PRIMARY KEY (`ID_Local`),
  ADD UNIQUE KEY `Ocupante` (`Ocupante`),
  ADD UNIQUE KEY `Dueño` (`Dueño`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`ID_Propietario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  MODIFY `ID_Contrato` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `ID_Inquilino` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `propiedad inmueble`
--
ALTER TABLE `propiedad inmueble`
  MODIFY `ID_Local` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `ID_Propietario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  ADD CONSTRAINT `contratoalquiler_ibfk_1` FOREIGN KEY (`Inquilino`) REFERENCES `inquilino` (`ID_Inquilino`),
  ADD CONSTRAINT `contratoalquiler_ibfk_2` FOREIGN KEY (`Propiedad`) REFERENCES `propiedad inmueble` (`ID_Local`);

--
-- Filtros para la tabla `propiedad inmueble`
--
ALTER TABLE `propiedad inmueble`
  ADD CONSTRAINT `propiedad inmueble_ibfk_1` FOREIGN KEY (`Ocupante`) REFERENCES `inquilino` (`ID_Inquilino`),
  ADD CONSTRAINT `propiedad inmueble_ibfk_2` FOREIGN KEY (`Dueño`) REFERENCES `propietario` (`ID_Propietario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
