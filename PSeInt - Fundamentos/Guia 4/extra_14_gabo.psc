Algoritmo sin_titulo
	Definir matriz Como Entero
	Definir n,i,j Como Entero 
	Escribir "Ingrese la cantidad de filas que tendrá la matriz"
	Leer n //definir filas
	mientras n<1 hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		leer n
	FinMientras
	Dimension matriz(n, 3)
	create(matriz, n)
	
	Escribir "A continuación se mostrará la matriz final conforme los datos cargados"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	show(matriz, n)
FinAlgoritmo

SubProceso create(matriz Por Referencia, n)
	Definir i, j Como Entero
	para i=0 hasta n-1
		para j=0 hasta 1
			Escribir "Ingresar valor ", i, ",",j
			leer matriz(i, j)
		FinPara
		matriz(i, 2) = matriz(i, 0)+matriz(i, 1)
	FinPara
FinSubProceso

SubProceso show(matriz, n)
	Definir i, j Como Entero
	Escribir ""
	para i=0 hasta n-1
		Escribir Sin Saltar "| "
		para j=0 hasta 2
			Escribir Sin Saltar matriz(i, j), " "
		FinPara
		Escribir Sin Saltar"|"
		Escribir ""
	FinPara
FinSubProceso


//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. 
//Las dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 
//3 columna se deberá almacenar el resultado de sumar el número de la primera y segunda columna. 
//Mostrar la matriz de la siguiente forma: 
//	
//	3 + 5 = 8
//	4 + 3 = 7 
//1 + 4 = 5 