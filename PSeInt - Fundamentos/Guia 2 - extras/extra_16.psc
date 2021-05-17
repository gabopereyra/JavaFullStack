Algoritmo extra_16
	Definir nombre Como Caracter
	Definir nota Como Entero
	Definir final Como Real
	final = 0
	Escribir "Ingrese nombre del alumno"
	Leer nombre
	Escribir ""
	
	Mientras nombre <> "" Hacer
		Escribir "A continuación se ingresarán las notas del alumno: ", nombre
		Escribir "Ingrese nota parte práctica"
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
		Escribir "Ingrese nota parte teórica"
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
	Escribir "El nombre indicado está vacío, se detiene el programa"
	
FinAlgoritmo

//. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
//	vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
//	notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
//	datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
//	estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
//		promedio y se mostrará un mensaje de error.