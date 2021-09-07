# CANDADO A
/*Muestre cuántas veces los jugadores lograron tener más o la misma cantidad de 
asistencias por partido, que el igual del máximo de asistencias por partido.*/
SELECT COUNT(*) as CANDADO FROM estadisticas WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);

SELECT MAX(Asistencias_por_partido) FROM estadisticas;#Consulta Aux
select * from estadisticas ORDER BY Asistencias_por_partido DESC; #Consulta Aux

/*Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición 
sea centro o esté comprendida en otras posiciones*/
Select sum(j.peso) from jugadores j inner join equipos eq on j.nombre_equipo = eq.nombre 
where j.posicion like '%C%' and eq.conferencia = 'east';

# CANDADO B
/*Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero 
de jugadores que tiene el equipo Heat.*/
SELECT COUNT(*) FROM estadisticas where Asistencias_por_partido > (SELECT COUNT(*) FROM jugadores WHERE nombre_equipo = 'Heat');

#La clave será igual al conteo de partidos jugados durante las temporadas del año 1999
SELECT COUNT(*) FROM PARTIDOS where temporada LIKE '%99%';

# CANDADO C
/*La posición del código será igual a la cantidad de jugadores que proceden de Michigan y 
forman parte de equipos de la conferencia oeste. 
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual 
a 195, y a eso le vamos a sumar 0.9945.*/

Select count(*) from jugadores j inner join equipos eq on j.nombre_equipo = eq.nombre 
where j.procedencia = 'Michigan' and eq.conferencia = 'West'; #Consulta Aux

Select count(*) from jugadores j where peso >= 195; #Consulta Aux

SELECT (((Select count(*) from jugadores j inner join equipos eq on j.nombre_equipo = eq.nombre 
where j.procedencia = 'Michigan' and eq.conferencia = 'West') / (Select count(*) from jugadores j where peso >= 195)) + 0.9945) AS Resultado;

/*Para obtener el siguiente código deberás redondear hacia abajo el resultado que se 
devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias por partido,
y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea 
central*/
#avg(e.puntos_por_partido)
create view PUNTOS as
SELECT avg(e.puntos_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo 
INNER JOIN equipos eq ON j.Nombre_equipo = eq.Nombre WHERE eq.division = 'Central';

create view ASISTENCIAS as
SELECT COUNT(e.asistencias_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo 
INNER JOIN equipos eq ON j.Nombre_equipo = eq.Nombre WHERE eq.division = 'Central';

create view ASISTENCIAS_2 as
SELECT COUNT(e.asistencias_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo 
INNER JOIN equipos eq ON j.Nombre_equipo = eq.Nombre WHERE eq.division = 'Central' and e.asistencias_por_partido > 0;

create view TAPONES as
SELECT SUM(e.tapones_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo 
INNER JOIN equipos eq ON j.Nombre_equipo = eq.Nombre WHERE eq.division = 'Central';

SELECT FLOOR((SELECT * FROM PUNTOS)+(SELECT * FROM ASISTENCIAS)+(SELECT * FROM TAPONES)) AS SUMA; #SIN WHERE PARA ASISTENCIAS
SELECT FLOOR((SELECT * FROM PUNTOS)+(SELECT * FROM ASISTENCIAS_2)+(SELECT * FROM TAPONES)) AS SUMA; #CON WHERE PARA ASISTENCIAS

# CANDADO D
/*Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. 
Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado*/
SELECT round((SELECT SUM(e.tapones_por_partido) FROM estadisticas e INNER JOIN jugadores j ON e.jugador = j.codigo 
WHERE e.temporada = '00/01' AND j.Nombre = 'Corey Maggette')) AS CANDADO;

/*Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por 
partido de todos los jugadores de procedencia argentina*/
SELECT FLOOR((SELECT SUM(e.puntos_por_partido) FROM estadisticas e 
INNER JOIN jugadores j ON e.jugador = j.codigo WHERE j.Procedencia = 'Argentina')) AS Resultado;



