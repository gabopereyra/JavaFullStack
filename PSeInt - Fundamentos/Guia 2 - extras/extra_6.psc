Algoritmo extra_6
	Definir day, month, year Como entero
	Definir mes Como Caracter
	
	Escribir "Todos los valores a ingresar deben ser númericos"
	Escribir "Ingrese el día"
	leer day
		Mientras day<0 | day>30 Hacer
		Escribir "El dia ingresado es incorrecto"
		Escribir "Ingrese nuevamente el día"
		Leer day
	FinMientras
	
	Escribir "Ingrese el mes"
	leer month
	Mientras month<0 | month>12 Hacer
		Escribir "El mes ingresado es incorrecto"
		Escribir "Ingrese nuevamente el mes"
		Leer month
	FinMientras
	Segun month Hacer
		1:
			mes = "enero"
		2:
			mes = "febrero"
		3:
			mes = "marzo"
		4:
			mes = "abril"
		5:
			mes = "mayo"
		6:
			mes = "junio"
		7:
			mes = "julio"
		8:
			mes = "agosto"
		9:
			mes = "septiembre"
		10:
			mes = "octubre"
		11:
			mes = "noviembre"
		De Otro Modo:
			mes = "diciembre"
	Fin Segun
	
	Escribir "Ingrese el año"
	leer year
	Mientras year<0 Hacer
		Escribir "El año ingresado es incorrecto"
		Escribir "Ingrese nuevamente el año"
		Leer year
	FinMientras
	Escribir day, " de ", mes, " de ", year
FinAlgoritmo
