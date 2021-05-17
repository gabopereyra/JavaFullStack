Algoritmo extra_5
	Definir num Como Real
	Escribir  "Ingrese un número de 1 a 7 para saber el día"
	leer num
	Mientras num<1 || num >7 Hacer
		Escribir "El numero ingresado es incorrecto"
		Escribir "Ingrese el valor de 1 a 7"
		Leer num
	FinMientras
	Segun num Hacer
		1:
			Escribir "El dia ingresado es: LUNES"
		2:
			Escribir "El dia ingresado es: MARTES"
		3:
			Escribir "El dia ingresado es: MIÉRCOLES"
		4:
			Escribir "El dia ingresado es: JUEVES"
		5:
			Escribir "El dia ingresado es: VIERNES"
		6:
			Escribir "El dia ingresado es: SÁBADO"
		7: 
			Escribir "El dia ingresado es: DOMINGO"
	Fin Segun
FinAlgoritmo
