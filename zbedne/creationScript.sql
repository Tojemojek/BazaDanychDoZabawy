-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema jspDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema jspDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jspDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_polish_ci ;
USE `jspDB` ;

-- -----------------------------------------------------
-- Table `jspDB`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jspDB`.`customer` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `surname` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jspDB`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jspDB`.`product` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `category` VARCHAR(100) NOT NULL,
  `price` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jspDB`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jspDB`.`order` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `ordered_date` DATETIME NOT NULL,
  `customer_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `fk_customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `jspDB`.`customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jspDB`.`order_has_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jspDB`.`order_has_product` (
  `order_id` INT UNSIGNED NOT NULL,
  `product_id` INT UNSIGNED NOT NULL,
  `quantity` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`order_id`, `product_id`),
  INDEX `fk_product_id_idx` (`product_id` ASC),
  CONSTRAINT `fk_order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `jspDB`.`order` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `jspDB`.`product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
