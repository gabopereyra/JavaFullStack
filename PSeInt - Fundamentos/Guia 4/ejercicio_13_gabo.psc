Algoritmo ejercicio_13
	Definir matriz, n, orden Como Entero
	Escribir "Indique tamaño de la matriz, siendo el min 3 y el maximo 10"
	Leer n
	Escribir ""
	Mientras n<3 o n>(n^2) Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer n
	FinMientras
	Dimension matriz(n,n)
	crear(matriz, n)
	esMagica(matriz, n)
FinAlgoritmo

SubProceso crear(matriz Por Referencia, n)
	Definir i, j Como Entero
	para i=0 hasta n-1
		para j=0 hasta n-1
			Escribir "Ingrese el valor para la posición [", i,",",j,"] (comprendido entre 1 y ",n^2, ")"
			Leer matriz(i,j)
			Mientras matriz(i,j)<1 o matriz(i,j)>(n^2) Hacer
				Escribir "Valor incorrecto, intente nuevamente"
				leer matriz(i,j)
			FinMientras
		FinPara
	FinPara
FinSubProceso

SubProceso esMagica(matriz, n)
	Definir orden Como Entero
	orden=((n^3)+n)/2 //valor que deben dar las sumas
	si filas(matriz, n, orden) y columnas(matriz, n, orden) y diagonales(matriz, n, orden) Entonces
		Escribir "Es mágica"
	sino
		Escribir "No es mágica"
	FinSi
FinSubProceso

funcion fila=filas(matriz, n, orden)
	Definir fila Como Logico
	Definir suma, i, j Como Entero
	fila=Verdadero
		
	i=0
	Mientras fila y i<=(n-1) Hacer
		suma = 0
		para j=0 hasta n-1
			suma = suma + matriz(i, j)
		FinPara
		i = i+1
		si suma<>orden
			fila = falso
		FinSi
	FinMientras
FinFuncion

funcion col=columnas(matriz, n, orden)
	Definir col Como Logico
	Definir suma, i, j Como Entero
	col=Verdadero
	
	j=0
	Mientras col y j<=(n-1) Hacer
		suma = 0
		para i=0 hasta n-1
			suma = suma + matriz(i, j)
		FinPara
		j = j+1
		si suma<>orden
			col = falso
		FinSi
	FinMientras	
FinFuncion

funcion dig=diagonales(matriz, n, orden)
	Definir dig Como Logico
	Definir suma, i, j Como Entero
	dig=Verdadero
	suma=0
	
	//diagonal principal
	j=0
	para i=0 hasta n-1
		suma = suma + matriz(i, j)
		j = j+1
	FinPara
	//FIN diagonal principal
	Si suma <> orden
		dig = Falso
	SiNo
		//Analizar segunda diagonal
		suma=0
		j=0
		para i=(n-1) hasta 0
			suma = suma + matriz(i, j)
			j = j+1
		FinPara
		Si suma <> orden
			dig = Falso
		FinSi
	FinSi	
FinFuncion
