Algoritmo extra_10
	Definir matriz, row, col Como Entero
	Escribir "Ingrese la cantidad de filas que tendr� la matriz"
	Leer row
	Mientras row<0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer row
	FinMientras
	Escribir "Ingrese la cantidad de columnas que tendr� la matriz"
	Leer col
	Mientras col<0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer col
	FinMientras
	Dimension matriz(row, col)
	Escribir ""
	Escribir "A continuaci�n se crear� y mostar� una matriz con las dimensiones indicadas"
	Escribir "Los numeros ser�n aleatorios entre 10 y 99"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	create(matriz,row, col)
	show(matriz,row, col)
FinAlgoritmo
SubProceso create(matriz Por Referencia,row, col)
	Definir i, j como entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			matriz(i,j)=Aleatorio(10,99)
		FinPara
	FinPara
FinSubProceso

SubProceso show(matriz,row, col)
	Definir i, j como entero
	Escribir ""
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir Sin Saltar "[",matriz(i,j),"] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

//Realizar un programa que rellene de n�meros aleatorios una matriz a trav�s de un 
//subprograma y generar otro subprograma que muestre por pantalla la matriz final