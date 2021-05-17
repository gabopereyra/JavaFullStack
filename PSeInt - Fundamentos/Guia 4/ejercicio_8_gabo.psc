Algoritmo ejercicio_8
	definir matriz, i, j Como Real
	Dimension matriz(3,3)
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir "Ingrese el elemento ", i, " ", j
			Leer matriz(i,j)
		FinPara
	FinPara
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir Sin Saltar matriz(i,j)," "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo

//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el 
//usuario y los muestre por pantalla