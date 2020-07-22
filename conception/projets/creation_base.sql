#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

create database refuge;
use refuge;

#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: race
#------------------------------------------------------------

CREATE TABLE race(
        idRace  Int  Auto_increment  NOT NULL ,
        nomRace Varchar (100) NOT NULL
	,CONSTRAINT race_PK PRIMARY KEY (idRace)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: caracteristiques
#------------------------------------------------------------

CREATE TABLE caracteristiques(
        idCaracteristiques    Int  Auto_increment  NOT NULL ,
        labelCaracteristiques Varchar (100) NOT NULL
	,CONSTRAINT caracteristiques_PK PRIMARY KEY (idCaracteristiques)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: avoir
#------------------------------------------------------------

CREATE TABLE avoir(
        idRace             Int NOT NULL ,
        idCaracteristiques Int NOT NULL
	,CONSTRAINT avoir_PK PRIMARY KEY (idRace,idCaracteristiques)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: chien
#------------------------------------------------------------

CREATE TABLE chien(
        puceChien     Int NOT NULL ,
        nomChien      Varchar (50) NOT NULL ,
        couleurChien  Varchar (10) NOT NULL ,
        ageChien      Smallint NOT NULL ,
        idRace        Int NOT NULL ,
        idUtilisateur Int NOT NULL
	,CONSTRAINT chien_PK PRIMARY KEY (puceChien)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: compte
#------------------------------------------------------------

CREATE TABLE compte(
        loginCompte    Varchar (100) NOT NULL ,
        passwordCompte Varchar (200) NOT NULL ,
        idUtilisateur  Int NOT NULL
	,CONSTRAINT compte_PK PRIMARY KEY (loginCompte)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: utilisateur
#------------------------------------------------------------

CREATE TABLE utilisateur(
        idUtilisateur     Int  Auto_increment  NOT NULL ,
        nomUtilisateur    Varchar (50) NOT NULL ,
        prenomUtilisateur Varchar (50) NOT NULL ,
        mailUtilisateur   Varchar (100) NOT NULL ,
        loginCompte       Varchar (100) NOT NULL
	,CONSTRAINT utilisateur_PK PRIMARY KEY (idUtilisateur)
)ENGINE=InnoDB;




ALTER TABLE avoir
	ADD CONSTRAINT avoir_race0_FK
	FOREIGN KEY (idRace)
	REFERENCES race(idRace);

ALTER TABLE avoir
	ADD CONSTRAINT avoir_caracteristiques1_FK
	FOREIGN KEY (idCaracteristiques)
	REFERENCES caracteristiques(idCaracteristiques);

ALTER TABLE chien
	ADD CONSTRAINT chien_race0_FK
	FOREIGN KEY (idRace)
	REFERENCES race(idRace);

ALTER TABLE chien
	ADD CONSTRAINT chien_utilisateur1_FK
	FOREIGN KEY (idUtilisateur)
	REFERENCES utilisateur(idUtilisateur);

ALTER TABLE compte
	ADD CONSTRAINT compte_utilisateur0_FK
	FOREIGN KEY (idUtilisateur)
	REFERENCES utilisateur(idUtilisateur);

ALTER TABLE compte 
	ADD CONSTRAINT compte_utilisateur0_AK 
	UNIQUE (idUtilisateur);

ALTER TABLE utilisateur
	ADD CONSTRAINT utilisateur_compte0_FK
	FOREIGN KEY (loginCompte)
	REFERENCES compte(loginCompte);

ALTER TABLE utilisateur 
	ADD CONSTRAINT utilisateur_compte0_AK 
	UNIQUE (loginCompte);
