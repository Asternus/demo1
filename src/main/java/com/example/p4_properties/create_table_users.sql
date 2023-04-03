CREATE TABLE users
(
    id       int PRIMARY KEY DEFAULT nextval('users'),
    email    varchar(255) NOT NULL,
    password varchar(50)  NOT NULL
);

INSERT INTO users(id, email, password)
VALUES (1, 'admin@mail.com', 'admin'),
       (2, 'user@mail.com', 'user')
