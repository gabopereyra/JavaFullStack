Algoritmo extra_4
	definir nombre, turno, festivo Como Caracter
	Definir horas Como real
	Escribir "Ingrese el nombre"
	leer nombre
	Escribir "Ingrese el turno (diurno/nocturno)"
	leer turno
	Escribir "Ingrese cantidad de horas"
	leer horas
	Escribir "Indique si el dia fue festivo (S/s - N/n)"
	leer festivo
	Escribir empleado(nombre, turno, horas, festivo), horas
FinAlgoritmo

funcion informe = empleado(nombre, turno, horas Por Referencia, festivo)
	Definir informe Como Caracter
	informe = ""
	Mientras Minusculas(turno) <> "diurno" y Minusculas(turno) <> "nocturno" Hacer
		Escribir "El turno ingresado es incorrecto, intente nuevamente"
		Escribir "diurno - nocturno"
		Leer turno
	FinMientras
	Mientras horas < 0 o horas>16 Hacer
		Escribir "Las horas ingresadas son inválidas, intente nuevamente"
		Escribir "Ingrese un valor entero entre 0 a 16"
		Leer horas
	FinMientras
	Mientras Minusculas(festivo) <> "s" y Minusculas(festivo) <> "n" Hacer
		Escribir "El dato ingresado es incorrecto, intente nuevamente"
		Escribir "Indique si el dia fue festivo (S/s - N/n)"
		Leer festivo
	FinMientras
	si Minusculas(festivo) = "s" Entonces
		si turno = "nocturno" Entonces
			horas = horas*(125*1.1)
		SiNo
			horas = horas*(90*1.1)
		FinSi
	SiNo
		si turno = "diurno" Entonces
			horas = horas*90
		SiNo
			horas = horas*125
		FinSi
	FinSi
	informe = nombre+" ha de recibir de paga por el dia: "
FinFuncion


//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea 
//calcular el jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y 
//		en un 15% si el turno es nocturno.
//    El programa debe solicitar la siguiente información al usuario: el nombre del 
//	 trabajador, el día de la semana, el turno (diurno o nocturno) y la cantidad de horas 
//	 trabajadas. Además, debemos preguntarle al usuario si el día de la semana (lunes, 
//	 martes, miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice 
//   una función para realizar el cálculo.