Algoritmo extra_13
	Definir mat_uno, mat_dos, dim, matProd Como Entero
	Dimension mat_uno(3,3)
	Dimension mat_dos(3,3)
	Dimension matProd(3,3)
	Escribir "A continuación se crearán y mostrarán dos matrices aleatorias de 3x3"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	create(mat_uno,3,3)
	create(mat_dos,3,3)
	show(mat_uno,3,3)
	show(mat_dos,3,3)
	Escribir "A continuación se realiza el producto entre ambas (matrizUno x matrizDos)"
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	multiplicar(mat_uno, mat_dos, matProd, 3, 3)
	show(matProd,3,3)
	
FinAlgoritmo



SubProceso 	create(mat Por Referencia,row,col)
	Definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			mat(i,j) = Aleatorio(0,20)
		FinPara
	FinPara
FinSubProceso

SubProceso 	show(mat,row,col)
	Definir i, j Como Entero
	
	para i=0 hasta row-1
		Escribir Sin Saltar "| "
		para j=0 hasta col-1
			Escribir sin saltar mat(i,j)," "
		FinPara
		Escribir Sin Saltar "|"
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso


SubProceso multiplicar(mat_uno, mat_dos, producto Por Referencia, row, col)
	Definir i, j, aux_i Como entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			producto(i,j) = 0
			para aux_i=0 hasta col-1
				producto(i,j) = producto(i,j)+(mat_uno(i,aux_i)*mat_dos(aux_i,j))
			FinPara			
		FinPara
	FinPara
FinSubProceso

//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. 
//Inicialice las matrices para evitar el ingreso de datos por teclado. 