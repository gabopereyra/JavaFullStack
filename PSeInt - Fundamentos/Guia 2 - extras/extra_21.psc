Algoritmo extra_21
	Definir num, contador, inicio, suma Como Entero
	Escribir "Ingrese un n�mero"
	Leer num
	contador = 0
	inicio = 0
	suma = 0
	Mientras num < 0 Hacer
		Escribir "El n�mero ingresado es menor a cero"
		Escribir "Intente nuevamente"
		Leer num
	FinMientras
	Hacer
		contador=contador+1
		inicio = inicio + 2
		suma = inicio + suma
	Hasta Que contador=num
	Escribir "La sumatoria es: ", suma

FinAlgoritmo
// Se pide escribir un programa que calcule la suma de los N primeros n�meros pares. Es 
// decir, si ingresamos el n�mero 5 como valor de N, el algoritmo nos debe realizar la suma 
//	de los siguientes valores: 2+4+6+8+10. 