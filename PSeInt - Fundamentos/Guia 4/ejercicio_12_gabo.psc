Algoritmo ejercicio_12
	Definir matriz, palabra Como Caracter
	Dimension matriz(3,3)
	Escribir "Ingrese una palabra de 9 carácteres de longitud"
	Leer palabra
	Mientras Longitud(palabra)<>9 Hacer
		Escribir "El tamaño de la palabra ingresada es distinto de 9"
		leer palabra
	FinMientras
	insertar(matriz, palabra)
	print(matriz)
	
FinAlgoritmo

SubProceso insertar(matriz Por Referencia, palabra)
	Definir x, j, cont Como Entero
	cont=0
	para x=0 hasta 2
		para j=0 hasta 2
			matriz(x, j) = Subcadena(palabra,cont, cont)
			cont=cont+1
		FinPara
	FinPara
FinSubProceso

SubProceso print(matriz)
	Definir x, j Como Entero
	para x=0 hasta 2
		para j=0 hasta 2
				Escribir Sin Saltar "[ ",matriz(x, j)," ] "
		FinPara
		Escribir ""
	FinPara
FinSubProceso


//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz. 
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B 
//		I L I 
//		D A D 
//	Nota: recordar el uso de la función Subcadena()