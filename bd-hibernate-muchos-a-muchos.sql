-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bd-hibernate-muchos-a-muchos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd-hibernate-muchos-a-muchos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd-hibernate-muchos-a-muchos` DEFAULT CHARACTER SET latin1 ;
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
USE `bd-hibernate-muchos-a-muchos` ;

-- -----------------------------------------------------
-- Table `bd-hibernate-muchos-a-muchos`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-hibernate-muchos-a-muchos`.`cliente` (
  `idCliente` INT(11) NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `dni` INT NOT NULL,
  `fechaDeNacimiento` DATE NULL DEFAULT NULL,
  `baja` BIT(1) NULL DEFAULT b'0',
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd-hibernate-muchos-a-muchos`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-hibernate-muchos-a-muchos`.`evento` (
  `idEvento` INT(11) NOT NULL AUTO_INCREMENT,
  `evento` VARCHAR(45) NOT NULL,
  `fecha` DATE NOT NULL,
  `hora` TIME NULL DEFAULT NULL,
  PRIMARY KEY (`idEvento`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd-hibernate-muchos-a-muchos`.`eventoxcliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd-hibernate-muchos-a-muchos`.`eventoxcliente` (
  `idEvento` INT(11) NOT NULL,
  `idCliente` INT(11) NOT NULL,
  PRIMARY KEY (`idEvento`, `idCliente`),
  INDEX `fk_evento_has_cliente_cliente1_idx` (`idCliente` ASC) VISIBLE,
  INDEX `fk_evento_has_cliente_evento1_idx` (`idEvento` ASC) VISIBLE,
  CONSTRAINT `fk_evento_has_cliente_cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bd-hibernate-muchos-a-muchos`.`cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_evento_has_cliente_evento1`
    FOREIGN KEY (`idEvento`)
    REFERENCES `bd-hibernate-muchos-a-muchos`.`evento` (`idEvento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;