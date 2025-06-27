CREATE DATABASE IF NOT EXISTS laptopdb;
USE laptopdb;

CREATE TABLE brand (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(255) NOT NULL
);

CREATE TABLE laptop (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(255),
                        cpu VARCHAR(255),
                        ram VARCHAR(255),
                        price BIGINT,
                        brand_id BIGINT,
                        FOREIGN KEY (brand_id) REFERENCES brand(id)
);

CREATE TABLE user (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      username VARCHAR(255) UNIQUE,
                      password VARCHAR(255),
                      role VARCHAR(50)
);