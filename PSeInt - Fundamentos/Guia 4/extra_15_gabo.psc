Algoritmo extra_15
	Definir matriz, vector, producto Como Entero
	Dimension matriz(3,3)
	Dimension vector(3)
	Dimension producto(3)
	Escribir "Ingrese los datos de la matriz"
	createMatriz(matriz, 3,3)
	Escribir "Ingrese los datos del vector"
	createVec(vector, 3)
	Escribir "La matriz creada es:"
	show(matriz, 3,3)
	Escribir "El vector creado es:"
	showVec(vector, 3)
	Escribir "A continuación se realizará la multiplicación entre el vector y la matriz"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	multiplicar(matriz, vector, producto, 3)
	Escribir "El producto obtenido es: "
	showVec(producto, 3)
FinAlgoritmo

SubProceso createMatriz(matriz Por Referencia, row, col)
	Definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir "Ingrese el valor para la posición: ", i,",",j
			leer matriz(i, j)
		FinPara
	FinPara
FinSubProceso

SubProceso createVec(vector Por Referencia, dim)
	definir i Como Entero
	para i=0 hasta dim-1
		Escribir "Ingrese el valor para la posición: ", i
		leer vector(i)
	FinPara
FinSubProceso

SubProceso show(matriz, row, col)
	Definir i, j Como Entero
	para i=0 hasta row-1
		Escribir Sin Saltar "| "
		para j=0 hasta col-1
			Escribir Sin Saltar matriz(i, j), " "
		FinPara
		Escribir Sin Saltar"|"
		Escribir ""
	FinPara
FinSubProceso

SubProceso showVec(vector, dim)
	definir i Como Entero
	Escribir Sin saltar "| "
	para i=0 hasta dim-1
		Escribir Sin Saltar vector(i), " "
	FinPara
	Escribir Sin saltar "|"
	Escribir ""
FinSubProceso


SubProceso multiplicar(matriz, vector, suma Por Referencia, row)
	Definir i, j, aux_i Como entero
	j=0
	para i=0 hasta row-1
		suma(i) = 0
		para aux_i=0 hasta row-1
			suma(i) = suma(i)+(vector(aux_i)*matriz(aux_i,j))
		FinPara
		j=j+1
	FinPara
FinSubProceso


//Realizar un programa que permita visualizar el resultado del producto de una matriz de 
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden 
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de 
//cómo se realiza la multiplicación entre matrices consultar el siguiente link: 