Algoritmo extra_19
	Definir num, total Como Entero
	Definir respuesta Como Caracter
	Escribir "Ingrese un número positivo"
	Leer num
	Mientras num < 0 Hacer
		Escribir ""
		Escribir "El número ingresado es negativo"
		Escribir "Ingrese un nuevo número"
		Leer num
	FinMientras
	total = num
	Escribir "Desea introducir otro número"
	Escribir "SI: s/S - NO: n/N"
	Leer respuesta
	Si Minusculas(respuesta)="n" Entonces
		Escribir "La sumatoria es: ", total
	SiNo
		Hacer
			Escribir "Introduzca otro número"
			Leer num
			total = total + num
			Escribir "Desea introducir otro número"
			Escribir "SI: s/S - NO: n/N"
			Leer respuesta
		Hasta Que Minusculas(respuesta)="n"
		Escribir "La sumatoria es: ", total
	Fin Si
FinAlgoritmo