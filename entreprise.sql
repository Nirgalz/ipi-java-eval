
DROP TABLE IF EXISTS `Entreprise`;
CREATE TABLE `Entreprise` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2504 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `Employe`;
CREATE TABLE `Employe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dateEmbauche` date DEFAULT NULL,
  `tempsPartiel` tinyint(1) DEFAULT '0',
  `matricule` varchar(6) DEFAULT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `sexe` enum('M','F') DEFAULT 'M',
  `salaire` decimal(9,2) DEFAULT NULL,
  `entreprise_id` bigint(20),
  PRIMARY KEY (`id`),
  UNIQUE KEY `matricule_unique` (`matricule`),
  KEY `idx_dateEmbauche` (`dateEmbauche`),
  CONSTRAINT `entreprise_employe_fk` FOREIGN KEY (`entreprise_id`) REFERENCES `Entreprise` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2504 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `Commercial`;
CREATE TABLE `Commercial` (
  `id` bigint(20) NOT NULL,
  `caAnnuel` decimal(10,2) DEFAULT '0.00',
  `performance` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  CONSTRAINT `commercial_employe_fk` FOREIGN KEY (`id`) REFERENCES `Employe` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `Manager`;
CREATE TABLE `Manager` (
  `id` bigint(20) NOT NULL,
  `performance` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `manager_employe_fk` FOREIGN KEY (`id`) REFERENCES `Employe` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `Technicien`;
CREATE TABLE `Technicien` (
  `id` bigint(20) NOT NULL,
  `grade` int(11) DEFAULT '1',
  `manager_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `technicien_manager_fk` (`manager_id`),
  CONSTRAINT `technicien_employe_fk` FOREIGN KEY (`id`) REFERENCES `Employe` (`id`) ON DELETE CASCADE,
  CONSTRAINT `technicien_manager_fk` FOREIGN KEY (`manager_id`) REFERENCES `Manager` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

