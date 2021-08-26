# Creacion de base de datos
CREATE DATABASE IF NOT EXISTS superheroes;

USE superheroes;

CREATE TABLE creador(
 id_creador INT NOT NULL PRIMARY KEY,
 nombre VARCHAR(20) NOT NULL
);
CREATE TABLE personajes (
 id_personaje INT NOT NULL,
 nombre_real VARCHAR(20) NOT NULL,
 personaje VARCHAR(20) NOT NULL,
 inteligencia INT NOT NULL,
 fuerza VARCHAR(10) NOT NULL,
 velocidad INT NOT NULL,
 poder INT NOT NULL,
 aparicion INT NOT NULL,
 ocupacion VARCHAR(30),
 creador_id INT NOT NULL,
 PRIMARY KEY (id_personaje),
 FOREIGN KEY (creador_id) REFERENCES creador (id_creador)
 );
 
INSERT INTO creador VALUES(1, 'Marvel');
INSERT INTO creador VALUES(2, 'DC Comics');

INSERT INTO personajes VALUES (1, 'Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Físico Nuclear', 1);
INSERT INTO personajes VALUES (2, 'Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personajes VALUES (3, 'Thor Odinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey Asgard', 1);
INSERT INTO personajes VALUES (4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personajes VALUES (5, 'Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1968, 'Oficial de inteligencia', 1);
INSERT INTO personajes VALUES (6, 'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personajes VALUES (7, 'Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotógrafo', 1);
INSERT INTO personajes VALUES (8, 'Steve Rogers', 'Capitán América', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personajes VALUES (9, 'Bobby Drake', 'Ice Man', 140, '2 mil', 64, 122, 1963, 'Contador', 1);
INSERT INTO personajes VALUES (10, 'Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Científico forense', 2);
INSERT INTO personajes VALUES (11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2);
INSERT INTO personajes VALUES (12, 'Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personajes VALUES (13, 'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa guerrera', 2);

# PUNTO A) Consulta a ambas tablas para verificar que esten completas:
SELECT * FROM creador;
SELECT * FROM personajes;

/* PUNTO B) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman. 
A continuación, realizar un listado de toda la tabla para verificar que el personaje 
haya sido actualizado */

UPDATE personajes SET aparicion = 1938 WHERE id_personaje = 12;
SELECT * FROM personajes WHERE id_personaje = 12 ;

/*PUNTO c) Eliminar registro que contiene al personaje Flash. A continuación, mostrar toda la tabla 
para verificar que el registro haya sido eliminado.*/

DELETE FROM personajes WHERE id_personaje = 10;
SELECT * FROM personajes WHERE id_personaje = 10 ; #para verificar eliminacion

/*PUNTO d) Eliminar la base de datos superhéroes*/
DROP DATABASE superheroes;
