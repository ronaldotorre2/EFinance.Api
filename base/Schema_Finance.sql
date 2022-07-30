/****************************************************************
 * Project:.....: Projeto Finance	                            *
 * Title:.......: Script criar esquema 		                 	*
 * Author.......: Ronaldo Torre                                 *
 * Reference....: Release 1.0.0                                 *
 *--------------------------------------------------------------*
  **************************************************************/ 

-- Banco de dados
-- ----------------------------------------------------------------
Drop database if exists Finance;

-- Criar banco de dados
Create database if not exists Finance DEFAULT CHARACTER SET utf8;

Use Finance;


-- Módulo Pessoa
-- --------------------------------------------------------------------

--- Pessoa 
Create table Person
(
	id		 				integer      	not null auto_increment,
	typeId 					integer 		not null,
	name					varchar(75)		not null,
	socialName				varchar(150)	null,
	birthDate				date			null,
	hometownCountry			integer 		null,
    hometownState			integer 		null,
    hometownCity			varchar(10) 	null,
	gender 					varchar(1)		null,
    image					varchar(100) 	null,
	document1				varchar(25)		not null,
	document2 				varchar(25)		null,
	document3 				varchar(25)		null,
	active                  bit 			not null DEFAULT 1,
	createdAt               timestamp     	not null ,
	updatedAt				timestamp     	null,
	constraint Pk_Person primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


Create table PersonFiliation
(
	id		 				integer      	not null auto_increment,
	personId				integer 		not null,
	name					varchar(75)		not null,
	document1				varchar(25)		not null,
	document2 				varchar(25)		null,
	active                  bit 			not null DEFAULT 1,
	createdAt               timestamp     	not null ,
	updatedAt				timestamp     	null,
	constraint Pk_PersonFiliation primary key(id),
	constraint Fk_PersonFiliation_Person foreign key(personId) references Person(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- Módulo Usuario
-- --------------------------------------------------------------------


Create table UserProfile
(
	id		 				integer      	not null auto_increment,
	name					varchar(100)	not null,
	initial 				varchar(5)		not null,
	description				text			null,
	active                  bit 			not null DEFAULT 1,
    createdAt               timestamp     	not null,
	updatedAt				timestamp     	null,
	Constraint Pk_UserProfile primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--- Usuário
Create table Users
(
	id		 				integer      	not null auto_increment,
	name					varchar(100)	not null,
	login 					varchar(15)		not null,
	image 					varchar(100)	null,
	password				varchar(255)	not null,
	remember				varchar(50) 	null,
	mail					varchar(255)	null,
	userProfileId 			integer 		not null,
	personId				integer			null,
	active                  bit 			not null DEFAULT 1,
	createdAt               timestamp     	not null,
	updatedAt				timestamp     	null,
	constraint Pk_Users primary key(id),
	constraint Fk_UserProfile_User foreign key(userProfileId) references UserProfile(id),
	constraint Fk_Person_User foreign key(personId) references Person(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;