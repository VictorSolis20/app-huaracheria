-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: huaracheria
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apaterno` varchar(45) NOT NULL,
  `amaterno` varchar(45) NOT NULL,
  `fechaHoraRegistro` datetime NOT NULL,
  `correo` varchar(40) DEFAULT 'Ninguno',
  `telefono` varchar(15) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Pepito','Pérez','González','2023-05-07 19:19:43','pepito@gmail.com','4351238974'),(2,'Marco','Torres','Soria','2023-05-07 19:49:22','Ninguno','7569841236'),(3,'Saul','Alvarez','Cruz','2023-05-07 19:55:43','Ninguno','7895641239'),(4,'Pedro','Cruz','Torres','2023-05-07 19:57:15','Ninguno','7854123698'),(5,'Fernando','Perez','Soria','2023-05-07 19:58:34','Ninguno','4589765894'),(6,'Sonia','Cruz','Toledo','2023-05-07 20:16:10','Ninguno','7321456794'),(7,'Armando','Soria','Ruiz','2023-05-07 20:17:36','armando@gmail.com','7412365897'),(8,'Luis','Torres','Soto','2023-05-08 11:00:02','Ninguno','7894561239'),(9,'Alberto','Soria','Perez','2023-05-09 23:07:52','Ninguno','7894561258'),(10,'Marco','Soria','Perez','2023-05-10 12:58:09','marco@gmail.com','7415896478'),(11,'Delia','Cruz','Perez','2023-05-17 09:00:11','D@gmail,com','1234567899'),(12,'Andrea','Campos','Solorio','2023-06-06 15:23:33','andrea@mail.com','1234567981');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colortextura`
--

DROP TABLE IF EXISTS `colortextura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colortextura` (
  `idColorTextura` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `observaciones` varchar(60) DEFAULT 'Ninguna',
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`idColorTextura`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colortextura`
--

LOCK TABLES `colortextura` WRITE;
/*!40000 ALTER TABLE `colortextura` DISABLE KEYS */;
INSERT INTO `colortextura` VALUES (1,'Natural','Ninguna','2023-05-14'),(2,'Rojo','Ninguna','2023-05-14'),(3,'Negro','Negro con rayas rojas','2023-06-06');
/*!40000 ALTER TABLE `colortextura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallepedido`
--

DROP TABLE IF EXISTS `detallepedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepedido` (
  `idDetallePedido` int NOT NULL AUTO_INCREMENT,
  `cantidadPares` int NOT NULL,
  `modeloTejido` varchar(40) NOT NULL,
  `colorTextura` varchar(45) NOT NULL,
  `tipoMaterial` varchar(45) NOT NULL,
  `tipoSuela` varchar(45) NOT NULL,
  `numeroParHuaraches` varchar(10) NOT NULL,
  `idPedido` int NOT NULL,
  PRIMARY KEY (`idDetallePedido`),
  KEY `idPedido` (`idPedido`),
  CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedido`
--

LOCK TABLES `detallepedido` WRITE;
/*!40000 ALTER TABLE `detallepedido` DISABLE KEYS */;
INSERT INTO `detallepedido` VALUES (1,10,'Araña','Natural','Baqueta','Hule negro','29',4),(2,15,'Alacran','Natural','Baqueta','Hule negro','27',4),(3,9,'Araña','Natural','Baqueta','Hule negro','25',4),(4,5,'Araña','Natural','Baqueta','Hule negro','27',5),(5,15,'Alacran','Natural','Baqueta','Hule negro','29',5),(6,8,'Alacran','Natural','Baqueta','Hule negro','24',5),(7,12,'Araña','Natural','Baqueta','Hule negro','24',6),(8,15,'Araña','Natural','Baqueta','Hule negro','27',6),(9,4,'Alacran','Natural','Baqueta','Hule negro','24',7),(10,8,'Araña','Rojo','Baqueta','Hule negro','20',8),(11,5,'Araña','Negro','Baqueta','Hule negro','12',9),(12,23,'Araña','Natural','Baqueta','Hule negro','22',9);
/*!40000 ALTER TABLE `detallepedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domiciliocliente`
--

DROP TABLE IF EXISTS `domiciliocliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domiciliocliente` (
  `idDomicilioCliente` int NOT NULL AUTO_INCREMENT,
  `estado` varchar(30) NOT NULL,
  `municipio` varchar(30) NOT NULL,
  `colonia` varchar(30) NOT NULL,
  `calle` varchar(35) NOT NULL,
  `numeroExterior` varchar(7) NOT NULL,
  `idCliente` int NOT NULL,
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`idDomicilioCliente`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `domiciliocliente_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domiciliocliente`
--

LOCK TABLES `domiciliocliente` WRITE;
/*!40000 ALTER TABLE `domiciliocliente` DISABLE KEYS */;
INSERT INTO `domiciliocliente` VALUES (1,'Michoacán','Huetamo','Centro','Av. Madero','78',6,'2023-05-14'),(2,'Michoacán','Huetamo','Terrero','Emiliano Zapata','45',2,'2023-05-14'),(13,'Guerrero','Altamirano','Primavera','Nicolas Bravo','45',2,'2023-05-22'),(15,'Guerrero','Tlapehuala','Morelita','San Rafael','#34',11,'2023-06-06'),(16,'Guerrero','Pungarabato','Nueva','Nueva italia','#45',11,'2023-06-06'),(17,'Michoacán','huetamo','centro','benito juarez','45',12,'2023-06-06'),(18,'Guerrero','Coyuca','centro','Vicente Guerrero','33',12,'2023-06-06');
/*!40000 ALTER TABLE `domiciliocliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domiciliopersonal`
--

DROP TABLE IF EXISTS `domiciliopersonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domiciliopersonal` (
  `idDomicilio` int NOT NULL AUTO_INCREMENT,
  `estado` varchar(30) NOT NULL,
  `municipio` varchar(30) NOT NULL,
  `colonia` varchar(30) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numeroExterior` varchar(7) DEFAULT 'S/N',
  `idPersonal` int NOT NULL,
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`idDomicilio`),
  KEY `idPersonal` (`idPersonal`),
  CONSTRAINT `domiciliopersonal_ibfk_1` FOREIGN KEY (`idPersonal`) REFERENCES `personal` (`idPersonal`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domiciliopersonal`
--

LOCK TABLES `domiciliopersonal` WRITE;
/*!40000 ALTER TABLE `domiciliopersonal` DISABLE KEYS */;
INSERT INTO `domiciliopersonal` VALUES (1,'Michoacán','Huetamo','Centro','1 de mayo','25',4,'2023-05-15'),(4,'GFHFHF','HFHFH','HFHF','HGFH','HFHFHF',1,'2023-05-19'),(5,'Michoacán','Huetamo','Loma de las rosas','Porvenir','17',4,'2023-05-22');
/*!40000 ALTER TABLE `domiciliopersonal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huarachetejido`
--

DROP TABLE IF EXISTS `huarachetejido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `huarachetejido` (
  `idHuaracheTejido` int NOT NULL AUTO_INCREMENT,
  `cantidadHuarachesTejidos` int NOT NULL,
  `observaciones` varchar(70) DEFAULT 'Ninguna',
  `fechaRegistro` date NOT NULL,
  `idPersonal` int NOT NULL,
  `status` varchar(30) NOT NULL,
  `idModeloTejido` int NOT NULL,
  `totalPago` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idHuaracheTejido`),
  KEY `idPersonal` (`idPersonal`),
  KEY `idModeloTejido` (`idModeloTejido`),
  CONSTRAINT `huarachetejido_ibfk_1` FOREIGN KEY (`idPersonal`) REFERENCES `personal` (`idPersonal`),
  CONSTRAINT `huarachetejido_ibfk_2` FOREIGN KEY (`idModeloTejido`) REFERENCES `modelotejido` (`idModeloTejido`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huarachetejido`
--

LOCK TABLES `huarachetejido` WRITE;
/*!40000 ALTER TABLE `huarachetejido` DISABLE KEYS */;
INSERT INTO `huarachetejido` VALUES (3,10,'Ya fue entregado en el taller.','2023-05-21',1,'Pagado',1,260.00),(4,8,'','2023-05-22',1,'Pagado',1,208.00),(5,12,'Ya fue entregado todo.','2023-05-22',1,'Pagado',2,360.00),(6,8,'','2023-05-22',1,'Pagado',1,208.00),(7,10,'Todos los pares ya fueron pagados.','2023-05-24',1,'Pagado',1,260.00),(8,15,'','2023-05-31',1,'Pagado',1,390.00),(9,10,'','2023-05-31',1,'Pagado',1,260.00),(10,18,'Todos fueron tejidos el día de hoy.','2023-06-04',1,'Pagado',1,468.00),(11,20,'','2023-06-06',6,'Pagado',2,600.00),(12,10,'color de correa dorada','2023-06-06',6,'Pagado',1,260.00),(13,12,'Se completaron','2023-06-06',7,'Pagado',2,360.00),(14,5,'Limpios','2023-06-06',7,'Pagado',2,150.00),(15,16,'Ya se secaron todos los pares.','2023-06-07',1,'Pagado',2,480.00),(16,15,'Ya se entregaron todos en el taller.','2023-06-07',1,'Pagado',2,450.00),(17,18,'Todos se tejieron hoy.','2023-06-07',1,'Pagado',1,468.00),(18,10,'','2023-06-07',1,'Pagado',1,260.00);
/*!40000 ALTER TABLE `huarachetejido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelotejido`
--

DROP TABLE IF EXISTS `modelotejido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modelotejido` (
  `idModeloTejido` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `observaciones` varchar(80) DEFAULT 'Ninguna',
  `fechaRegistro` date NOT NULL,
  `precioParHuarache` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idModeloTejido`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelotejido`
--

LOCK TABLES `modelotejido` WRITE;
/*!40000 ALTER TABLE `modelotejido` DISABLE KEYS */;
INSERT INTO `modelotejido` VALUES (1,'Araña','Tejido tradicional','2023-05-12',26.00),(2,'Alacran','Modelo de tejido usado para huaraches de mujer.','2023-05-13',30.00);
/*!40000 ALTER TABLE `modelotejido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagopersonal`
--

DROP TABLE IF EXISTS `pagopersonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagopersonal` (
  `idPagoPersonal` int NOT NULL AUTO_INCREMENT,
  `montoTotalTejido` decimal(10,2) NOT NULL,
  `montoTotalPrestamos` decimal(10,2) NOT NULL,
  `montoTotalSueldo` decimal(10,2) NOT NULL,
  `fechaRegistro` date NOT NULL,
  `idPersonal` int NOT NULL,
  PRIMARY KEY (`idPagoPersonal`),
  KEY `idPersonal` (`idPersonal`),
  CONSTRAINT `pagopersonal_ibfk_1` FOREIGN KEY (`idPersonal`) REFERENCES `personal` (`idPersonal`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagopersonal`
--

LOCK TABLES `pagopersonal` WRITE;
/*!40000 ALTER TABLE `pagopersonal` DISABLE KEYS */;
INSERT INTO `pagopersonal` VALUES (1,828.00,330.00,498.00,'2023-05-28',1),(2,390.00,0.00,390.00,'2023-05-31',1),(3,260.00,0.00,260.00,'2023-05-31',1),(4,728.00,600.00,128.00,'2023-06-04',1),(5,860.00,400.00,460.00,'2023-06-06',6),(6,510.00,200.00,310.00,'2023-06-06',7),(7,1398.00,0.00,1398.00,'2023-06-07',1),(8,260.00,0.00,260.00,'2023-06-07',1);
/*!40000 ALTER TABLE `pagopersonal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `fechaRegistro` date NOT NULL,
  `horaRegistro` time NOT NULL,
  `idCliente` int NOT NULL,
  `idDomicilioCliente` int NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `idDomicilioCliente` (`idDomicilioCliente`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idDomicilioCliente`) REFERENCES `domiciliocliente` (`idDomicilioCliente`),
  CONSTRAINT `pedido_ibfk_6` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (4,'2023-05-29','04:09:46',2,13),(5,'2023-05-29','04:13:18',6,1),(6,'2023-05-29','15:36:50',2,2),(7,'2023-06-06','13:02:57',11,16),(8,'2023-06-06','13:04:05',11,15),(9,'2023-06-06','15:36:01',12,17);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personal` (
  `idPersonal` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apaterno` varchar(45) NOT NULL,
  `amaterno` varchar(45) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `fechaRegistro` date NOT NULL,
  `usuario` varchar(10) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `status` varchar(15) NOT NULL DEFAULT 'Inactivo',
  PRIMARY KEY (`idPersonal`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES (1,'Pepito','Pérez','Gonzalez','4789564782','pepito@gmail.com','2023-05-10','pepito14','perez14','Activo'),(2,'Luis','Torres','Soria','7894561238','','2023-05-10','','','Activo'),(3,'Marco','Gomez','Herrera','7418529637','','2023-05-10','','','Activo'),(4,'Juan','Perez','Garcia','7458962589','','2023-05-10','','','Activo'),(5,'José','Gómez','Saucedo','7412589637','','2023-05-10','','','Inactivo'),(6,'Jhon','Peralta','Diaz','0987654321','jo@gmail.com','2023-06-06','Jhon','12','Activo'),(7,'Mariela','Magaña','Gutiérrez','4251290045','mariela@mail.com','2023-06-06','mariela','12345','Activo'),(8,'Pedro','Torres','Soria','478965123','jk@gmail.com','2023-06-07','','','Activo');
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamopersonal`
--

DROP TABLE IF EXISTS `prestamopersonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamopersonal` (
  `idPrestamo` int NOT NULL AUTO_INCREMENT,
  `montoPrestamo` decimal(10,2) NOT NULL,
  `fechaRegistro` date NOT NULL,
  `idPersonal` int NOT NULL,
  `status` varchar(15) NOT NULL DEFAULT 'Pendiente',
  PRIMARY KEY (`idPrestamo`),
  KEY `idPersonal` (`idPersonal`),
  CONSTRAINT `prestamopersonal_ibfk_1` FOREIGN KEY (`idPersonal`) REFERENCES `personal` (`idPersonal`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamopersonal`
--

LOCK TABLES `prestamopersonal` WRITE;
/*!40000 ALTER TABLE `prestamopersonal` DISABLE KEYS */;
INSERT INTO `prestamopersonal` VALUES (1,180.00,'2023-05-23',1,'Pagado'),(2,300.00,'2023-05-23',1,'Rechazado'),(3,150.00,'2023-05-23',1,'Pagado'),(4,200.00,'2023-05-31',1,'Rechazado'),(5,500.00,'2023-06-04',1,'Pagado'),(6,50.00,'2023-06-04',1,'Pagado'),(7,50.00,'2023-06-04',1,'Pagado'),(8,50.00,'2023-06-04',1,'Rechazado'),(9,400.00,'2023-06-06',6,'Pagado'),(10,100.00,'2023-06-06',6,'Rechazado'),(11,200.00,'2023-06-06',7,'Pagado'),(12,200.00,'2023-06-07',1,'Rechazado'),(13,30.00,'2023-06-07',1,'Rechazado');
/*!40000 ALTER TABLE `prestamopersonal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipomaterial`
--

DROP TABLE IF EXISTS `tipomaterial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipomaterial` (
  `idTipoMaterial` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `observaciones` varchar(60) DEFAULT 'Ninguna',
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`idTipoMaterial`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipomaterial`
--

LOCK TABLES `tipomaterial` WRITE;
/*!40000 ALTER TABLE `tipomaterial` DISABLE KEYS */;
INSERT INTO `tipomaterial` VALUES (1,'Baqueta','Piel curtida de vaca.','2023-05-14');
/*!40000 ALTER TABLE `tipomaterial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposuela`
--

DROP TABLE IF EXISTS `tiposuela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiposuela` (
  `idTipoSuela` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `observaciones` varchar(60) DEFAULT 'Ninguna',
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`idTipoSuela`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposuela`
--

LOCK TABLES `tiposuela` WRITE;
/*!40000 ALTER TABLE `tiposuela` DISABLE KEYS */;
INSERT INTO `tiposuela` VALUES (1,'Hule negro','Es un hule de orilla de llanta.','2023-05-14');
/*!40000 ALTER TABLE `tiposuela` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-07 23:52:43
