-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'construction'),(2,'It indus'),(3,'techinal'),(4,'admin');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jhi_user`
--

DROP TABLE IF EXISTS `jhi_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jhi_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `password_hash` varchar(60) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `image_url` varchar(256) DEFAULT NULL,
  `activated` bit(1) NOT NULL,
  `lang_key` varchar(6) DEFAULT NULL,
  `activation_key` varchar(20) DEFAULT NULL,
  `reset_key` varchar(20) DEFAULT NULL,
  `created_by` varchar(50) NOT NULL,
  `created_date` timestamp NOT NULL,
  `reset_date` timestamp NULL DEFAULT NULL,
  `last_modified_by` varchar(50) DEFAULT NULL,
  `last_modified_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_user_login` (`login`),
  UNIQUE KEY `idx_user_login` (`login`),
  UNIQUE KEY `ux_user_email` (`email`),
  UNIQUE KEY `idx_user_email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jhi_user`
--

LOCK TABLES `jhi_user` WRITE;
/*!40000 ALTER TABLE `jhi_user` DISABLE KEYS */;
INSERT INTO `jhi_user` VALUES (1,'system','$2a$10$mE.qmcV0mFU5NcKh73TZx.z4ueI/.bDWbj0T1BYyqP481kGGarKLG','System','System','system@localhost','','','en',NULL,NULL,'system','2018-05-10 16:10:46',NULL,'system',NULL),(2,'anonymoususer','$2a$10$j8S5d7Sr7.8VTOYNviDPOeWX8KcYILUVJBsYV83Y5NtECayypx9lO','Anonymous','User','anonymous@localhost','','','en',NULL,NULL,'system','2018-05-10 16:10:46',NULL,'system',NULL),(3,'admin','$2a$10$gSAhZrxMllrbgj/kkK9UceBPpChGWJA7SYIb1Mqo.n5aNLq1/oRrC','Administrator','Administrator','admin@localhost','','','en',NULL,NULL,'system','2018-05-10 16:10:46',NULL,'system',NULL),(4,'user','$2a$10$1/9CW.T52x.VaUPTzcfIWerqPDzwWset7f4YkYlUERCaDY5u.EX4O','User','User','user@localhost','','','en',NULL,NULL,'system','2018-05-10 16:10:46',NULL,'user','2018-05-20 13:33:52'),(5,'test','$2a$10$aZgLKsUiIfB4DMKYguie3uv5dg94v71i3aINlsOvql6dezCavl3.i','test','test','qwerty@UI',NULL,'','en',NULL,'66632201865040695939','admin','2018-05-13 16:33:02','2018-05-20 10:44:13','anonymousUser','2018-05-20 10:44:13'),(9,'1231231234','$2a$10$n6.D1HsCYebHm70qNeD9ZezbJI2YTgHeucFv9t56p5IY4mI/wx5O6','qwe','qwe','qwe@q',NULL,'','en',NULL,NULL,'admin','2018-05-21 22:12:11','2018-05-26 11:44:17','admin','2018-05-26 11:44:17'),(11,'9585515863','$2a$10$NoL7gb9JRjSeoyzy8/xBbe.VP3lMZQqPS/mIfZ.ud/1S8KhvWYeN6','Prabhu','Prabhu','prabhu@h',NULL,'','en',NULL,NULL,'admin','2018-06-03 17:13:06','2018-06-03 17:13:06','admin','2018-06-03 17:13:06'),(13,'1234567890','$2a$10$7aOX0CNptz6qTV3n./kJI.0Q7fH7Qq3lG7V.yduoP6ATMv/QaGH9K','General Expense','Expense','Expense@general.com',NULL,'','en',NULL,NULL,'admin','2018-06-09 13:17:17','2018-06-09 13:17:17','admin','2018-06-09 13:17:17'),(14,'7010028023','$2a$10$KFxo41yhY.DinDtRfdLvYeMJUWz8JFIMAtHQJbepumdZ0Q/l19oJC','Prabhu Jio','Working','prabhu@gmail.com',NULL,'','en',NULL,NULL,'admin','2018-06-09 20:35:42','2018-06-09 20:35:42','admin','2018-06-09 20:35:42'),(18,'9842736966','$2a$10$Ke5Fpu7Iaq37NG9uzkn25Owxl/frJHy0j2W8gbiU2u4aJ/Qzkzkvi','Ramesh','test','gohulaprabhu17@gmail.com',NULL,'','en',NULL,'69685411605773538048','admin','2018-06-14 23:20:58','2018-06-14 23:22:11','anonymousUser','2018-06-14 23:22:11');
/*!40000 ALTER TABLE `jhi_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_extra`
--

DROP TABLE IF EXISTS `user_extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_extra` (
  `accountno` varchar(255) DEFAULT NULL,
  `address_line1` varchar(255) DEFAULT NULL,
  `address_line2` varchar(255) DEFAULT NULL,
  `atype` varchar(255) DEFAULT NULL,
  `bank` varchar(255) DEFAULT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `cphone` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `ifsc` varchar(255) DEFAULT NULL,
  `pincode` int(11) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  `project_id` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `blocation` varchar(255) DEFAULT NULL,
  `cash` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKqjto87up2kqxyyxybka6e88p5` (`project_id`),
  KEY `FKe8sfpqgyifuj2hptxe1pr04op` (`type_id`),
  CONSTRAINT `FKe8sfpqgyifuj2hptxe1pr04op` FOREIGN KEY (`type_id`) REFERENCES `user_type` (`id`),
  CONSTRAINT `FKj6o22j2hl0suca5i7f77olhro` FOREIGN KEY (`user_id`) REFERENCES `jhi_user` (`id`),
  CONSTRAINT `FKqjto87up2kqxyyxybka6e88p5` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_extra`
--

LOCK TABLES `user_extra` WRITE;
/*!40000 ALTER TABLE `user_extra` DISABLE KEYS */;
INSERT INTO `user_extra` VALUES (NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,4,4,NULL,0),(', quis nostrud exercitation ulla',' pariatur. Excepteur sint','ia deserunt mollit anim id est laborum.Lorem ipsum ','m dolore eu fugiat nulla pariatur. Excepteur sint occaecat c','rum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ',' officia deserunt','ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliqu','te velit esse cillum dolore eu fugia','didunt ut labore et dolore magna ','icia deserunt mollit anim id es','ed do eiusmod tempor incididunt ut labore et dolore magna ali',807901952,'t, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consec',3,3,1,'nsequat. Duis aute irure dolor in reprehenderit in voluptate vel',-683692032),('r. Excepteur sint occaecat cupidatat non p','pariatur. Excepteur sint occaecat cup','lore eu fugiat nulla pariatur. Excepteur sint occaecat cu','piscing elit, sed do eiusmod tempor incididunt u','nisi ut aliquip ex ea commodo consequat. Duis aute i','culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur a',' consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliq','t cupidatat non proident, sunt in culpa qui officia deserunt mollit ','cia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, co','a commodo consequat. Duis aute irur','em ipsum dolor sit am',1078952704,'or incididunt ut labor',4,4,4,'oris nisi ut aliquip ex ea commodo consequat. Duis',-1774767104),('12321332','addressline','qwe','Saving','Karnataka','Erode','qwe','qwe','1231231234','qwe','KAR0089898',123123,'qwe',9,2,3,'bangalore',100),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,11,2,3,NULL,100),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,13,4,4,NULL,120),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,14,2,3,NULL,90),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,18,1,1,NULL,NULL);
/*!40000 ALTER TABLE `user_extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spent`
--

DROP TABLE IF EXISTS `spent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `spent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `created_date` datetime NOT NULL,
  `date` datetime DEFAULT NULL,
  `spent` int(11) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `from_user_user_id` bigint(20) DEFAULT NULL,
  `to_user_user_id` bigint(20) DEFAULT NULL,
  `by_user_user_id` bigint(20) DEFAULT NULL,
  `from_current_balance` int(11) NOT NULL,
  `from_previous_balance` int(11) NOT NULL,
  `to_current_balance` int(11) NOT NULL,
  `to_previous_balance` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdihopibhqepcmxm3xb6xht1no` (`from_user_user_id`),
  KEY `FKc8y7erf968gtl6u702rqtrg4f` (`to_user_user_id`),
  KEY `FK5yhsrlhdjxmqwvp2kf6m36547` (`by_user_user_id`),
  CONSTRAINT `FK5yhsrlhdjxmqwvp2kf6m36547` FOREIGN KEY (`by_user_user_id`) REFERENCES `user_extra` (`user_id`),
  CONSTRAINT `FKc8y7erf968gtl6u702rqtrg4f` FOREIGN KEY (`to_user_user_id`) REFERENCES `user_extra` (`user_id`),
  CONSTRAINT `FKdihopibhqepcmxm3xb6xht1no` FOREIGN KEY (`from_user_user_id`) REFERENCES `user_extra` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spent`
--

LOCK TABLES `spent` WRITE;
/*!40000 ALTER TABLE `spent` DISABLE KEYS */;
INSERT INTO `spent` VALUES (1,'unaccount','2018-06-06 20:33:43','2018-06-05 05:30:00',0,'CREDIT',1,1,1,0,0,0,0),(2,'General','2018-06-09 18:29:58','2018-06-09 05:30:00',0,'CREDIT',1,1,1,0,0,0,0),(26,'General Expenses','2018-06-12 22:56:02','2018-06-12 22:56:02',10,'CREDIT',11,13,11,90,100,110,100),(27,'test','2018-06-12 22:58:15','2018-06-12 05:30:00',20,'CREDIT',11,14,11,70,90,120,100),(28,'test','2018-06-13 19:16:10','2018-06-13 05:30:00',50,'CREDIT',11,14,NULL,20,0,220,0),(29,'test','2018-06-13 19:34:01','2018-06-13 05:30:00',50,'CREDIT',11,14,3,50,0,150,0),(30,'test','2018-06-13 19:36:11','2018-06-13 05:30:00',50,'DEBIT',11,14,3,100,50,100,150),(31,'General Expenses','2018-06-13 20:00:52','2018-06-13 20:00:52',10,'CREDIT',14,13,14,90,100,120,110);
/*!40000 ALTER TABLE `spent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt_type`
--

DROP TABLE IF EXISTS `receipt_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receipt_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt_type`
--

LOCK TABLES `receipt_type` WRITE;
/*!40000 ALTER TABLE `receipt_type` DISABLE KEYS */;
INSERT INTO `receipt_type` VALUES (1,'Tea');
/*!40000 ALTER TABLE `receipt_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expense`
--

DROP TABLE IF EXISTS `expense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expense` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cost` int(11) NOT NULL,
  `created_date` datetime NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `spent_id_id` bigint(20) DEFAULT NULL,
  `type_id` bigint(20) DEFAULT NULL,
  `user_extra_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKminytt5enbnag9utw0j8mj7sm` (`spent_id_id`),
  KEY `FK5w8u1ec8p7979bbed1hqgeiqj` (`type_id`),
  KEY `FK9c35v2u2us8l6ag3ub8n5m6j7` (`user_extra_user_id`),
  CONSTRAINT `FK5w8u1ec8p7979bbed1hqgeiqj` FOREIGN KEY (`type_id`) REFERENCES `receipt_type` (`id`),
  CONSTRAINT `FK9c35v2u2us8l6ag3ub8n5m6j7` FOREIGN KEY (`user_extra_user_id`) REFERENCES `user_extra` (`user_id`),
  CONSTRAINT `FKminytt5enbnag9utw0j8mj7sm` FOREIGN KEY (`spent_id_id`) REFERENCES `spent` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expense`
--

LOCK TABLES `expense` WRITE;
/*!40000 ALTER TABLE `expense` DISABLE KEYS */;
INSERT INTO `expense` VALUES (21,10,'2018-06-12 22:56:00',NULL,26,1,11),(22,10,'2018-06-13 20:00:49',NULL,31,1,14);
/*!40000 ALTER TABLE `expense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'Bank'),(2,'salesman'),(3,'developer'),(4,'admin');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jhi_user_authority`
--

DROP TABLE IF EXISTS `jhi_user_authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jhi_user_authority` (
  `user_id` bigint(20) NOT NULL,
  `authority_name` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`,`authority_name`),
  KEY `fk_authority_name` (`authority_name`),
  CONSTRAINT `fk_authority_name` FOREIGN KEY (`authority_name`) REFERENCES `jhi_authority` (`name`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `jhi_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jhi_user_authority`
--

LOCK TABLES `jhi_user_authority` WRITE;
/*!40000 ALTER TABLE `jhi_user_authority` DISABLE KEYS */;
INSERT INTO `jhi_user_authority` VALUES (1,'ROLE_ADMIN'),(3,'ROLE_ADMIN'),(1,'ROLE_USER'),(3,'ROLE_USER'),(5,'ROLE_USER'),(4,'USER'),(9,'USER'),(11,'USER'),(13,'USER'),(14,'USER'),(18,'USER');
/*!40000 ALTER TABLE `jhi_user_authority` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-15  5:13:33
