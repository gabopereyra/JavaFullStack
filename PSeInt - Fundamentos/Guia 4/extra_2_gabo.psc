Algoritmo extra_2
	Definir vec, dim Como Entero
	Escribir "Defina la dimensión del vector"
	Leer dim
	Mientras dim<=0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vec(dim)
	Escribir ""
	create(vec, dim)
	show(vec, dim)
	prom(vec, dim)
FinAlgoritmo

SubProceso create(vector Por Referencia, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir "Ingrese el elemento para la posición ", i
		Leer vector(i)
	FinPara
FinSubProceso

SubProceso show(vector, dim)
	Definir i Como Entero
	Escribir ""
	Escribir "El vector es el siguiente:"
	para i=0 hasta dim-1
		Escribir Sin Saltar "[",vector(i),"] "
	FinPara
	Escribir ""
	Escribir ""
FinSubProceso

SubProceso prom(vector, dim)
	Definir i, suma Como entero
	suma=0
	para i=0 hasta dim-1
		suma = suma + vector(i)
	FinPara
	Escribir "La suma de los elementos es igual a ", suma,"."
	Escribir "El valor promedio de los elementos es igual a ", suma/dim,"."
	
FinSubProceso


//
//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.