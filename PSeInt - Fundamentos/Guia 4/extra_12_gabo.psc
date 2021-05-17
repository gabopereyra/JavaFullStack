Algoritmo extra_12
	Definir matriz, i, j Como Entero
	Dimension matriz(5,15)
	Escribir "A continuación se va a generar una matriz de 5x15"
	Escribir "En su marco contendrá el numero 1 y en su interior estará formada por 0"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	//Crear matriz
	para i=0 hasta 4
		para j=0 hasta 14
			Si j=0 o j=14 Entonces
				matriz(i,j) = 1
			SiNo
				si i=0 o i=4 Entonces
					matriz(i,j) = 1
				sino
					matriz(i,j) = 0
				FinSi
			FinSi
		FinPara
	FinPara
	
	//Mostrar matriz
	para i=0 hasta 4
		para j=0 hasta 14
			Escribir Sin Saltar matriz(i,j)
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo


//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos 
//y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna 
//de ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111 
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111 