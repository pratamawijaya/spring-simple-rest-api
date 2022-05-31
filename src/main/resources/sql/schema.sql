CREATE TABLE IF NOT EXISTS customer (
        id int not null AUTO_INCREMENT PRIMARY KEY,
        first_name varchar(100),
        last_name varchar(100),
        email varchar(20)
);