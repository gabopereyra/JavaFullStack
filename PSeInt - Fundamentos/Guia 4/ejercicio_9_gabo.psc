Algoritmo ejercicio_9
	definir matriz, i, j, min, max, num Como Real
	Definir existe Como Logico
	existe=Falso
	
	Dimension matriz(5,5)
	
	Escribir "Defina los valores entre los cuales se creará el vector aleatorio"
	Escribir ""
	Escribir "Ingrese valor mínino"
	leer min
	Escribir "Ingrese valor máximo"
	leer max
	Mientras max < min Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer max
	FinMientras
	
	para i=0 hasta 4
		para j=0 hasta 4
			matriz(i,j) = Aleatorio(min, max)
 		FinPara
	FinPara
	
	Escribir ""
	Escribir "Ingrese el valor a buscar"
	leer num
	
	para i=0 hasta 4
		para j=0 hasta 4
			SI num=matriz(i,j) Entonces
				Escribir "El número indicado se ha encontrado en la posición [", i, ",",j, "]"
				existe = Verdadero
			FinSi
 		FinPara
	FinPara
	Si !existe
		Escribir "El número indicado (", num, ") no se ha encontrado dentro de la matriz"
	FinSi
FinAlgoritmo


//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por 
//el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las 
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. 
//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje