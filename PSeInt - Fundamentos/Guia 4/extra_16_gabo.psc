Algoritmo extra_16
	Definir matrizDatos Como Entero
	Definir aux, matrizFinal Como Caracter
	Dimension matrizDatos(6,6)
	Dimension aux(6,6)
	Dimension matrizFinal(7,7)
	create(matrizDatos, 6,6) //Creacion matriz que contiene los datos numericos
	transform(matrizDatos, aux, 6,6) //convierto la matriz a texto para poder insertarla facilmente en la final
	createFinal(matrizFinal, aux, 7,7) //Creacion matriz que contiene la tabla final
	Escribir "--PRESIONE CUALQUIER TECLA PARA VER TABLA FINAL y PROD + VENDIDO--"
	Esperar Tecla
	Escribir ""
	showFinal(matrizFinal, aux, 7, 7) 
	Escribir ""
	Escribir masVendido(matrizDatos, matrizFinal, 6)
FinAlgoritmo

SubProceso create(matriz Por Referencia, row, col)
	definir i, j, sumaColumna, sumaFila Como Entero
	para i=0 hasta row-2
		Segun i Hacer
			0:
				llenado(matriz, i, col)
			1:
				llenado(matriz, i, col)
			2:
				llenado(matriz, i, col)
			3:
				llenado(matriz, i, col)
			De Otro Modo:
				llenado(matriz, i, col)
		Fin Segun
	FinPara
	//llenar total de cada linea
	para i=0 hasta row-2
		sumaFila=0
		para j=0 hasta col-2
			sumaFila = sumaFila + matriz(i,j)
		FinPara
		matriz(i, col-1) = sumaFila
	FinPara
	//llenar total de cada columna
	para j=0 hasta col-1
		sumaColumna=0
		para i=0 hasta row-2
			sumaColumna = sumaColumna + matriz(i,j)
		FinPara
		matriz(row-1, j) = sumaColumna
	FinPara
FinSubProceso

SubProceso transform(matriz, aux Por Referencia, row,col)
	definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			aux(i, j) = ConvertirATexto(matriz(i,j))
		FinPara
	FinPara
FinSubProceso

SubProceso show(matriz, row, col)
	definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir sin saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso createFinal(matrizFinal Por Referencia, aux, row,col)
	Definir i, j como entero
	i=0
	para j=0 hasta col-1
		Segun j Hacer
			0:
				matrizFinal(i,j) = "           "
			1:
				matrizFinal(i,j) = " Lunes"
			2:
				matrizFinal(i,j) = " Martes"
			3:
				matrizFinal(i,j) = " Miércoles" 
			4:
				matrizFinal(i,j) = " Jueves"
			5:
				matrizFinal(i,j) = " Viernes"
			De Otro Modo:
				matrizFinal(i,j) = " Total Prod."
		Fin Segun
	FinPara
	j=0
	para i=1 hasta row-1
		Segun i Hacer
			1:
				matrizFinal(i,j) = "Producto 1 "
			2:
				matrizFinal(i,j) = "Producto 2 "
			3:
				matrizFinal(i,j) = "Producto 3 "
			4:
				matrizFinal(i,j) = "Producto 4 "
			5:
				matrizFinal(i,j) = "Producto 5 "
			De Otro Modo:
				matrizFinal(i,j) = "Total dia  "
		Fin Segun
	FinPara
	
	para i=1 hasta 6
		para j=1 hasta 6
			matrizFinal(i,j) = Concatenar(" ",aux(i-1,j-1))
		FinPara
	FinPara
FinSubProceso

SubProceso llenado(matriz Por Referencia, i, col)
	Definir j Como Entero
	Escribir "Cargue los datos diarios para el producto ", i+1
	para j=0 hasta col-2
		Segun j Hacer
			0:
				Escribir "Día lunes: "
				Leer matriz(i, j)
			1:
				Escribir "Día martes: "
				Leer matriz(i, j)
			2:
				Escribir "Día miércoles: "
				Leer matriz(i, j)
			3:
				Escribir "Día jueves: "
				Leer matriz(i, j)
			De Otro Modo:
				Escribir "Día viernes: "
				Leer matriz(i, j)
		Fin Segun
	FinPara
FinSubProceso

SubProceso llenadoDias(matriz Por Referencia, i, col)
	Definir j Como Entero
	para j=0 hasta col-1
		Leer matriz(i, j)
	FinPara
FinSubProceso

SubProceso showFinal(matriz, matrizDos, row, col)
	definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			si i=0 Entonces
				Escribir sin saltar matriz(i,j) //Escribir los titulos
			SiNo
				si j=0
					Escribir sin saltar matriz(i,j)
				SiNo
					Escribir sin saltar dato(i, j, matriz, matrizDos)  //escribe el valor
				FinSi
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubProceso

funcion value = dato(i, j, matriz, matrizDos)
	Definir value Como Caracter
	Definir aux, aux_dos Como real
	aux = Longitud(matriz(0, j))-Longitud(matrizDos(i-1, j-1))
	si aux<0 Entonces
		value = matrizDos(i-1, j-1)
	SiNo
			matrizDos(i-1, j-1) = Concatenar(blanco(aux), matrizDos(i-1, j-1))
			value = matrizDos(i-1, j-1)
	FinSi
FinFuncion

Funcion espacio=blanco(aux)
	Definir espacio Como Caracter
	espacio=""
	Definir i Como Entero
	para i=0 hasta aux-1
		espacio=Concatenar(espacio, " ")
	FinPara
FinSubProceso

Funcion final=masVendido(matrizDatos, matrizFinal, row)
	Definir final, aux Como Caracter
	Definir i, pos, value Como Entero
	value = matrizDatos(0, row-1)
	para i=1 hasta row-2
		si matrizDatos(i, row-1) > value
			value = matrizDatos(i, row-1)
			pos = i
		FinSi
	FinPara
	aux = Concatenar("Con una cant total de: ", ConvertirATexto(value))
	final = Concatenar(aux, Concatenar(", el producto más vendido es: ", matrizFinal(pos+1, 0))) 
	//, " con una cant. de: ", matrizDatos(pos-1,0)
FinFuncion

////Una empresa de venta de productos por correo desea realizar una estadística de las 
////ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya 
////luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
////	 a. Total de ventas por cada día de la semana.
////	 b. Total de ventas de cada producto a lo largo de la semana.
////	 c. El producto más vendido en cada semana.
////	 d. El nombre, el día de la semana y la cantidad del producto más vendido.
////	 El informe final tendrá un formato como el que se muestra a continuación