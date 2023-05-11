-- schema.sql
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS news;
DROP TABLE IF EXISTS Product;
DROP TABLE IF EXISTS Article;
CREATE TABLE users (

                       email VARCHAR(255),
                       password VARCHAR(255),
                        PRIMARY KEY (email)

);

CREATE TABLE news (
                      id INT ,
                      title VARCHAR(255),
                      content TEXT,
                      publish_time DATETIME,
                      author VARCHAR(255),
                      category VARCHAR(255),
                      PRIMARY KEY (id)
) ;
CREATE TABLE Article (
                         id INT,
                         title VARCHAR(45) NOT NULL,
                         content TEXT NOT NULL,
                         author VARCHAR(45) NOT NULL,
                         date DATE NOT NULL,
                         type VARCHAR(45) NOT NULL,
                         PRIMARY KEY (id)
);
CREATE TABLE Product (
                         id INT,
                         name VARCHAR(255) NOT NULL,
                         description TEXT NOT NULL,
                         price DECIMAL(10,2) NOT NULL,
                         image VARCHAR(255) NOT NULL,
                         category VARCHAR(255) NOT NULL,
                         tag VARCHAR(255),
                         PRIMARY KEY (id)
);


