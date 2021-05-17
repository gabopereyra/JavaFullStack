Algoritmo extra_16
	Definir matrizDatos, ventasProd, ventasDiarias Como Entero
	Definir productoDiario Como Caracter
	
	Dimension matrizDatos(5,5) //serán 5 productos, en 5 días
	Dimension ventasProd(6) //para almacenar las ventas totales de los productos
	Dimension ventasDiarias(5) //para almacenar las ventas totales diarias
	Dimension productoDiario(5) //para calcular el más vendido de cada dia
	
	baseDatos(matrizDatos, 5, 5) //generar bases con los datos diarios
	ventasTotalProd(matrizDatos, ventasProd, 5, 5) //Cálculo del total de cada producto
	ventasTotalDiarias(matrizDatos, ventasDiarias, 5, 5) //Cálculo del total del dia
	diario(productoDiario, matrizDatos, 5) //Generacion vector que contiene mejor producto diario
	
	visualizar(ventasProd, ventasDiarias, productoDiario, matrizDatos)
FinAlgoritmo


SubProceso visualizar(ventasProd, ventasDiarias, productoDiario, matrizDatos)
	Escribir ""
	Escribir "Antes de continuar expanda la pantalla"
	Escribir "Esto permitirá visualizar correctamente la información"
	Escribir ""
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	Limpiar Pantalla
	Escribir ""
	matrizFinal(ventasProd, ventasDiarias, productoDiario, matrizDatos)
	Escribir "NOTA: en la última linea, la letra P, indica Producto, y la letra C, indica cantidad"
	Escribir ""
	masVendido(ventasProd, mayor(ventasProd, 5))
	Escribir ""
FinSubProceso

SubProceso masVendido(ventasProd, i)

	Segun i Hacer
		0:
			Escribir "El producto más vendido es el 1, con una cantidad de: ",ventasProd(i)
		1:
			Escribir "El producto más vendido es el 2, con una cantidad de: ",ventasProd(i)
		2:
			Escribir "El producto más vendido es el 3, con una cantidad de: ",ventasProd(i)
		3:
			Escribir "El producto más vendido es el 4, con una cantidad de: ",ventasProd(i)
		De Otro Modo:
			Escribir "El producto más vendido es el 5, con una cantidad de: ",ventasProd(i)
	Fin Segun
FinSubProceso

/// --- subprocesos para ayudar a rellenar matriz de datos ---- //
SubProceso baseDatos(matriz, row, col)
	Definir i, j Como Entero
	para i=0 hasta row-1
		producto(i)
		para j=0 hasta col-1
			dias(j)
			leer matriz(i,j)
		FinPara
	FinPara
FinSubProceso

SubProceso dias(value)
	Segun value Hacer
		0:
			Escribir "Ventas día lunes"
		1:
			Escribir "Ventas día martes"
		2:
			Escribir "Ventas día miércoles"
		3:
			Escribir "Ventas día jueves"
		De Otro Modo:
			Escribir "Ventas día viernes"
	Fin Segun
FinSubProceso

SubProceso producto(value)
	Segun value Hacer
		0:
			Escribir "Cargue datos producto_1"
		1:
			Escribir "Cargue datos producto_2"
		2:
			Escribir "Cargue datos producto_3"
		3:
			Escribir "Cargue datos producto_4"
		De Otro Modo:
			Escribir "Cargue datos producto_5"
	Fin Segun
FinSubProceso
/// --- FIN subprocesos para ayudar a rellenar matriz de datos ---- //

/// --- subprocesos para generar vectores con maximos por producto y por dia---- //
SubProceso  ventasTotalProd(matrizDatos, vector, row, col) 
	Definir i, j, suma Como Entero
	para i=0 hasta row-1
		suma=0
		para j=0 hasta col-1
			suma = suma+matrizDatos(i,j)
		FinPara
		vector(i) = suma
	FinPara
	suma=0
FinSubProceso

SubProceso ventasTotalDiarias(matrizDatos, vector, row, col)
	Definir i, j, suma Como Entero
	para i=0 hasta row-1
		suma=0
		para j=0 hasta col-1
			suma = suma+matrizDatos(j,i)
		FinPara
		vector(i) = suma
	FinPara
FinSubProceso

Funcion pos=mayor(vector, dim) //permite obtener la posición en los vectores con totales (ya sea el max diario, o el max de la semana)
	Definir max, pos,i Como Entero
	max=vector(0)
	pos=0
	para i=1 hasta dim-1
		si vector(i) > max
			max = vector(i)
			pos=i
		FinSi
	FinPara
FinFuncion

SubProceso diario(productoDiario, matrizDatos, dim) //me genera un vector con los datos del mas vendido segun el dia
	Definir i,j, max, pos Como Entero
	para j=0 hasta dim-1
		max = matrizDatos(0, j)
		pos=0 //basado en la fila
		para i=1 hasta dim-1
			si matrizDatos(i, j)>max Entonces
				max = matrizDatos(i, j)
				pos = i
			FinSi
		FinPara
		Segun pos Hacer
			0:
				productoDiario(j) = Concatenar("P: 1 - C: ", ConvertirATexto(max))
			1:
				productoDiario(j) = Concatenar("P: 2 - C: ", ConvertirATexto(max))
			2:
				productoDiario(j) = Concatenar("P: 3 - C: ", ConvertirATexto(max))
			3:	
				productoDiario(j) = Concatenar("P: 4 - C: ", ConvertirATexto(max))
			De Otro Modo:
				productoDiario(j) = Concatenar("P: 5 - C: ", ConvertirATexto(max))
		Fin Segun
	FinPara
FinSubProceso
/// --- FIN Subprocesos para generar vectores con maximos por producto y por dia---- //

///auxiliares para matriz FinAlgoritmo
SubProceso vectorAuxCol(col)
	Definir i Como Entero
	para i=0 hasta 7
		Segun i Hacer
			0:
				col(i) = " ---------- "
			1:
				col(i) = " Producto 1 "
			2:
				col(i) = " Producto 2 "
			3:
				col(i) = " Producto 3 "
			4:
				col(i) = " Producto 4 "
			5:
				col(i) = " Producto 5 "
			6:
				col(i) = " Total día  "
			De Otro Modo:
				col(i) = " + Vendido  "
		Fin Segun
	FinPara
FinSubProceso

SubProceso vectorAuxFila(fila)
	Definir i Como Entero
	para i=0 hasta 5
		Segun i Hacer
			0:
				fila(i) = "     Lunes      "
			1:
				fila(i) = "     Martes     "
			2:
				fila(i) = "   Miércoles    "
			3:
				fila(i) = "     Jueves     "
			4:
				fila(i) = "     Viernes    "
			De Otro Modo:
				fila(i) = "  Total x Prod. "
		Fin Segun
	FinPara
FinSubProceso
///fin auxiliares

///matrizfinal
SubProceso matrizFinal(ventasProd, ventasDiarias, productoDiario, matrizDatos)
	Definir i, j Como Entero
	Definir matriz, auxCol, auxFila Como Caracter
	Dimension matriz(8,7)
	Dimension auxCol(8)
	Dimension auxFila(6)
	
	vectorAuxCol(auxCol)
	vectorAuxFila(auxFila)
	
	//genera columna de datos:
	para i=0 hasta 7
			matriz(i, 0) = auxCol(i)
	FinPara
	//genera fila de titulos:
	para j=1 hasta 6
		matriz(0, j) = auxFila(j-1)
	FinPara
	//asignar valores en ultima fila (totales):
	para i=1 hasta 7
		si i=7 o i=6 Entonces
			matriz(i, 6) = " -------------- "
		SiNo
			matriz(i,6)=blanco(ConvertirATexto(ventasProd(i-1)))
		FinSi
	FinPara
	//asignar valores en fila totales de diario
	para j=1 hasta 5
		
		matriz(6,j)=blanco(ConvertirATexto(ventasDiarias(j-1)))

	FinPara
	//asignar valores con mejor diario
	para j=1 hasta 6
		si j=6 Entonces
			matriz(7, j) = " -------------- "
		SiNo
			matriz(7,j)=blanco(productoDiario(j-1))
		FinSi
	FinPara
	//asignacion valores intermedios
	para i=1 hasta 5
		para j=1 hasta 5
			matriz(i,j)=blanco(ConvertirATexto(matrizDatos(i-1, j-1)))
		FinPara
	FinPara
	showMatriz(matriz, 8, 7)
FinSubProceso

SubProceso showMatriz(matriz, row, col)
	Definir i, j Como Entero
	para i=0 hasta row-1
		para j=0 hasta col-1
			Escribir Sin Saltar "|", matriz(i,j),"| "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

///fin matriz

///auxiliar para poder dar formato centrado
Funcion final=blanco(value)
	Definir final, aux_dos, aux_tres Como Caracter
	Definir aux, i Como Entero
	final=""
	aux_dos = ""
	aux_tres = ""
	aux = 14-Longitud(value)
	si aux%2 = 0 Entonces
		para i=0 hasta aux/2
			aux_dos = Concatenar(aux_dos," ")
		FinPara
		final=Concatenar(aux_dos, Concatenar(value,aux_dos))
	SiNo
		para i=0 hasta (aux-1)/2
			aux_dos = Concatenar(aux_dos," ")
		FinPara
		para i=0 hasta (aux+1)/2
			aux_tres = Concatenar(aux_tres," ")
		FinPara
		final=Concatenar(aux_dos, Concatenar(value,aux_tres))
	FinSi
FinFuncion
///FIN auxiliar para poder dar formato centrado
	