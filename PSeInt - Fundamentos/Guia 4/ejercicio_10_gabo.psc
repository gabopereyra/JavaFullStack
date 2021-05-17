Algoritmo ejercicio_10
	definir matriz, i, j, fila, columna, suma Como entero
	suma=0
	
	Escribir "Defina la cantidad de filas"
	Leer fila
	Mientras fila<0 Hacer
		Escribir "El valor no puede ser menor a cero, intente nuevamente"
		Leer fila
	FinMientras
	
	Escribir "Defina la cantidad de columnas"
	Leer columna
	Mientras columna<0 Hacer
		Escribir "El valor no puede ser menor a cero, intente nuevamente"
		Leer columna
	FinMientras
	Dimension matriz(fila,columna)
	
	Escribir ""
	Escribir "A continuación se va a generar una matriz de las dimensiones definidas con valores aleatorios entre 0 y 50."
	Escribir "Toque cualquier tecla para continuar"
	Esperar Tecla
	para i=0 hasta fila-1
		para j=0 hasta columna-1
			matriz(i,j) = Aleatorio(0, 50)
 		FinPara
	FinPara
	
	Escribir ""
	Escribir "Se ha generado la siguiente matriz:"
	para i=0 hasta fila-1
		para j=0 hasta columna-1 
			Escribir Sin Saltar matriz(i,j)," "
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""
	Escribir "A continuación se va a generar la suma de todos los elementos de la matriz creada."
	Escribir "Toque cualquier tecla para continuar"
	Esperar Tecla
	para i=0 hasta fila-1
		para j=0 hasta columna-1
			suma = suma + matriz(i,j)
 		FinPara
	FinPara
	
	Escribir ""
	Escribir "La suma de los elementos es igual a ",suma
	
FinAlgoritmo


//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) 
//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos 
//otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar 
//la matriz y los resultados por pantalla. 