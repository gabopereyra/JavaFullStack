Algoritmo extra_16
	Definir nombre Como Caracter
	Definir nota Como Entero
	Definir final Como Real
	final = 0
	Escribir "Ingrese nombre del alumno"
	Leer nombre
	Escribir ""
	
	Mientras nombre <> "" Hacer
		Escribir "A continuaci�n se ingresar�n las notas del alumno: ", nombre
		Escribir "Ingrese nota parte pr�ctica"
		Leer nota
		Mientras nota<1 || nota>10 Hacer
			Escribir "La nota ingresada es incorrecta, intente nuevamente"
			Leer nota
		FinMientras
		final = (nota*0.1)
		Escribir "Ingrese nota parte problemas"
		Leer nota
		Mientras nota<1 | nota>10 Hacer
			Escribir "La nota ingresada es incorrecta, intente nuevamente"
			Leer nota
		FinMientras
		final = final + (nota*0.5)
		Escribir "Ingrese nota parte te�rica"
		Leer nota
		Mientras nota<1 | nota>10 Hacer
			Escribir "La nota ingresada es incorrecta, intente nuevamente"
			Leer nota
		FinMientras
		final = final + (nota*.4)
		Escribir "La nota final del alumno ", nombre, " es: ", final
		Escribir ""
		Escribir "Apriete cualquier tecla para continuar"
		Esperar Tecla
		Limpiar Pantalla
		Escribir "Ingrese el nombre de otro alumno"
		Leer nombre
	FinMientras
	Escribir "El nombre indicado est� vac�o, se detiene el programa"
	
FinAlgoritmo

//. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas
//	vale el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres
//	notas obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los
//	datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben
//	estar comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el
//		promedio y se mostrar� un mensaje de error.