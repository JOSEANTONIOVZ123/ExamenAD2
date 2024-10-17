FROM ubuntu:latest
LABEL authors="jose"

CREATE DATABASE peliculas;
USE peliculas;

CREATE TABLE Pelicula (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    genero VARCHAR(100) NOT NULL,
    año YEAR NOT NULL
);

INSERT INTO Pelicula (titulo, genero, año) VALUES
('El Padrino', 'Drama', 1972),
('El Caballero Oscuro', 'Acción', 2008),


ENTRYPOINT ["top", "-b"]