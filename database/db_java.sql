# Autor: ❤🚀❤ Vitor de Jesus ❤🚀❤
# Data: 14/06/2023 
# Titulo: Projeto Conexao com DB

CREATE DATABASE db_java;
USE `db_java`;

CREATE TABLE CLIENTE (
idCliente int NOT NULL,
nome varchar (45) NOT NULL,
CPF int (11) NOT NULL,
endereco varchar (45) NOT NULL,
telefone int (11) NOT NULL,
PRIMARY KEY (CPF)
);

CREATE TABLE CONTA (
n_conta int (8) NOT NULL,
agencia int (4) NOT NULL,
saldo int NOT NULL,
pix varchar (50) NOT NULL,
senha varchar (200) NOT NULL,
CPF_FK int (11) NOT NULL,
CONSTRAINT FK_CPF FOREIGN KEY (CPF_FK) REFERENCES CLIENTE (CPF)
);


INSERT INTO CLIENTE (idCliente, nome, CPF, endereco, telefone) values
('1', 'DANIEL', '754845865', 'PRAIA','11956854'),
('2', 'LAURA', '784512784', 'EUA', '11956854'),
('3', 'VALERIA','968574123', 'EUROPA', '11956854');

INSERT INTO CONTA (n_conta, agencia, saldo, pix, senha, CPF_FK) values
('0001', '8888', '16745', 'meuPIX', '12345', '754845865'),
('0002', '8888', '0', 'meuPIX', '12345', '784512784'),
('0003', '8888', '16745', 'meuPIX', '12345', '968574123');
