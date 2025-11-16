CREATE TABLE patient (
     id BIGSERIAL PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     cpf VARCHAR(14) NOT NULL UNIQUE,
     phone_number VARCHAR(15) NOT NULL,
     email VARCHAR(255) NOT NULL,
     born_date DATE,
     gender CHAR(1) CHECK (gender IN ('M','F')),
     address VARCHAR(100)
);
