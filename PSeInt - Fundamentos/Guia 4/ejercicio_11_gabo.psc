Algoritmo ejercicio_11
	Definir matriz, i Como Entero
	Escribir "Definir el tamaño del cuadrado"
	Leer i
	Mientras i<0 Hacer
		Escribir "El valor ingresado es menor a cero, intente nuevamente"
		Leer i
	FinMientras
	Dimension matriz(i,i)
	Escribir "A continuación se mostrará una matriz cuadrada del tamaño indicando, donde la diagonal principal contendrá solo CEROS"
	Escribir "(el algoritmo contendrá números aleatorios entre 0 y 50)"
	Escribir ""
	crear(matriz, i)
	ver(matriz, i)
FinAlgoritmo

SubProceso crear(matriz Por Referencia, i)
	Definir x, j Como Entero
	para x=0 hasta i-1
		para j=0 hasta i-1
			si x=j Entonces
				matriz(x, j) = 0
			SiNo
				matriz(x, j) = Aleatorio(0,50)
			FinSi			
		FinPara
	FinPara
FinSubProceso

SubProceso ver(matriz, i)
	Definir x, j Como Entero
	para x=0 hasta i-1
		para j=0 hasta i-1
			si matriz(x, j)<10 Entonces
				Escribir Sin Saltar "[",matriz(x, j)," ] "
			SiNo
				Escribir Sin Saltar "[",matriz(x, j),"] "
			FinSi				
			FinPara
		Escribir ""
	FinPara
FinSubProceso

//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la 
//	diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe 
//	generar otro subproceso para imprimir la matriz