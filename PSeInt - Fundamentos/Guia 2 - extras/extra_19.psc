Algoritmo extra_19
	Definir num, total Como Entero
	Definir respuesta Como Caracter
	Escribir "Ingrese un n�mero positivo"
	Leer num
	Mientras num < 0 Hacer
		Escribir ""
		Escribir "El n�mero ingresado es negativo"
		Escribir "Ingrese un nuevo n�mero"
		Leer num
	FinMientras
	total = num
	Escribir "Desea introducir otro n�mero"
	Escribir "SI: s/S - NO: n/N"
	Leer respuesta
	Si Minusculas(respuesta)="n" Entonces
		Escribir "La sumatoria es: ", total
	SiNo
		Hacer
			Escribir "Introduzca otro n�mero"
			Leer num
			total = total + num
			Escribir "Desea introducir otro n�mero"
			Escribir "SI: s/S - NO: n/N"
			Leer respuesta
		Hasta Que Minusculas(respuesta)="n"
		Escribir "La sumatoria es: ", total
	Fin Si
FinAlgoritmo