DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;

USE adlister_db;
DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;


CREATE TABLE IF NOT EXISTS users (
                                     id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                     username VARCHAR(50) NOT NULL,
                                     email VARCHAR(50) NOT NULL,
                                     password  VARCHAR(100) NOT NULL
);



CREATE TABLE IF NOT EXISTS ads (
                                   id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                   user_id_fk INT UNSIGNED NOT NULL,
                                   title VARCHAR(100) NOT NULL ,
                                   description TEXT NOT NULL ,
                                   FOREIGN KEY (user_id_fk) REFERENCES users(id)
);

