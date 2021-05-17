Algoritmo extra_11
	Definir matriz, matriz_t, row, col Como Entero
	Escribir "Ingrese la cantidad de filas que tendrá la matriz"
	Leer row
	Mientras row<0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer row
	FinMientras
	Escribir "Ingrese la cantidad de columnas que tendrá la matriz"
	Leer col
	Mientras col<0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer col
	FinMientras
	Dimension matriz(row, col)
	Dimension matriz_t(col, row)
	create(matriz, row, col)
	Escribir "La matriz ingresada es: "
	show(matriz, row, col)
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	Escribir "La matriz traspuesta es: "
	trasponer(matriz, matriz_t, col, row)
	show(matriz_t, col, row)	
FinAlgoritmo

SubProceso create(matriz Por Referencia, row, col)
	definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir "Ingrese el valor para la posición: ",i,",", j
			leer matriz(i, j)
		FinPara
	FinPara
FinSubProceso

SubProceso trasponer(matriz, matriz_t por referencia, row, col)
	Definir i, j Como Entero
	para i=0 hasta col-1
		para j=0 hasta row-1
			matriz_t(j,i) = matriz(i, j)
		FinPara
	FinPara	
FinSubProceso

SubProceso show(matriz,row, col)
	Definir i, j como entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir Sin Saltar "[",matriz(i,j),"] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla con 
//números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no conoces lo que es una traspuesta, 
//mirar el siguiente link: Matriz Traspuesta 