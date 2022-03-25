-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP DATABASE IF EXISTS mydb;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`PetShop`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PetShop` (
  `CNPJ` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `qtdFuncs` INT NOT NULL,
  PRIMARY KEY (`CNPJ`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Veterinario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Veterinario` (
  `CRMVvet` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `especialidade` VARCHAR(45) NOT NULL,
  `CNPJPetShop` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CRMVvet`),
  INDEX `fk_Veterinario_PetShop_idx` (`CNPJPetShop` ASC) VISIBLE,
  CONSTRAINT `fk_Veterinario_PetShop`
    FOREIGN KEY (`CNPJPetShop`)
    REFERENCES `mydb`.`PetShop` (`CNPJ`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Atendente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Atendente` (
  `cpf` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `CNPJPetShop` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cpf`),
  INDEX `fk_Atendente_PetShop1_idx` (`CNPJPetShop` ASC) VISIBLE,
  CONSTRAINT `fk_Atendente_PetShop1`
    FOREIGN KEY (`CNPJPetShop`)
    REFERENCES `mydb`.`PetShop` (`CNPJ`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Auxiliar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Auxiliar` (
  `cpf` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `especialidade` VARCHAR(45) NOT NULL,
  `CNPJPetShop` VARCHAR(45) NOT NULL,
  `CRMVVet` VARCHAR(45),
  PRIMARY KEY (`cpf`),
  INDEX `fk_Auxiliar_PetShop1_idx` (`CNPJPetShop` ASC) VISIBLE,
  INDEX `fk_Auxiliar_Veterinario1_idx` (`CRMVVet` ASC) VISIBLE,
  CONSTRAINT `fk_Auxiliar_PetShop1`
    FOREIGN KEY (`CNPJPetShop`)
    REFERENCES `mydb`.`PetShop` (`CNPJ`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Auxiliar_Veterinario1`
    FOREIGN KEY (`CRMVVet`)
    REFERENCES `mydb`.`Veterinario` (`CRMVvet`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DonoAnimal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`DonoAnimal` (
  `cpf` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cpf`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Animal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Animal` (
  `idAnimal` INT NOT NULL auto_increment,
  `nome` VARCHAR(45) NOT NULL,
  `especie` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  `peso` DECIMAL(5,2) NOT NULL,
  `vacinado` TINYINT NOT NULL,
  `CPFDono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAnimal`),
  INDEX `fk_Animal_DonoAnimal1_idx` (`CPFDono` ASC) VISIBLE,
  CONSTRAINT `fk_Animal_DonoAnimal1`
    FOREIGN KEY (`CPFDono`)
    REFERENCES `mydb`.`DonoAnimal` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Consulta` (
  `idConsulta` INT NOT NULL auto_increment,
  `cpfAtendente` VARCHAR(45),
  `CRMVvet` VARCHAR(45),
  `idAnimal` INT NOT NULL,
  `cpfDono` VARCHAR(45) NOT NULL,
  `Valor` DECIMAL(6,2) NOT NULL,
  `data` varchar(45) NOT NULL,
  `horario` varchar (45) NOT NULL,
  PRIMARY KEY (`idConsulta`),
  INDEX `fk_Consulta_Atendente1_idx` (`cpfAtendente` ASC) VISIBLE,
  INDEX `fk_Consulta_Veterinario1_idx` (`CRMVvet` ASC) VISIBLE,
  INDEX `fk_Consulta_Animal1_idx` (`idAnimal` ASC) VISIBLE,
  INDEX `fk_Consulta_DonoAnimal1_idx` (`cpfDono` ASC) VISIBLE,
  CONSTRAINT `fk_Consulta_Atendente1`
    FOREIGN KEY (`cpfAtendente`)
    REFERENCES `mydb`.`Atendente` (`cpf`)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Consulta_Veterinario1`
    FOREIGN KEY (`CRMVvet`)
    REFERENCES `mydb`.`Veterinario` (`CRMVvet`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Consulta_Animal1`
    FOREIGN KEY (`idAnimal`)
    REFERENCES `mydb`.`Animal` (`idAnimal`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Consulta_DonoAnimal1`
    FOREIGN KEY (`cpfDono`)
    REFERENCES `mydb`.`DonoAnimal` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Banho`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Banho` (
  `cpfDono` VARCHAR(45) NOT NULL,
  `cpfAuxiliar` VARCHAR(45) NOT NULL,
  `idAnimal` INT NOT NULL,
  `Valor` DECIMAL(5,2) NOT NULL,
  `data` varchar(45) NOT NULL,
  `horario` varchar (45) NOT NULL,
  PRIMARY KEY (`cpfAuxiliar`, `idAnimal`),
  INDEX `fk_Auxiliar_has_Animal_Animal1_idx` (`idAnimal` ASC) VISIBLE,
  INDEX `fk_Auxiliar_has_Animal_Auxiliar1_idx` (`cpfAuxiliar` ASC) VISIBLE,
  INDEX `fk_Auxiliar_has_Animal_DonoAnimal1_idx` (`cpfDono` ASC) VISIBLE,
  CONSTRAINT `fk_Auxiliar_has_Animal_Auxiliar1`
    FOREIGN KEY (`cpfAuxiliar`)
    REFERENCES `mydb`.`Auxiliar` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Auxiliar_has_Animal_Animal1`
    FOREIGN KEY (`idAnimal`)
    REFERENCES `mydb`.`Animal` (`idAnimal`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Auxiliar_has_Animal_DonoAnimal1`
    FOREIGN KEY (`cpfDono`)
    REFERENCES `mydb`.`DonoAnimal` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)  
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;