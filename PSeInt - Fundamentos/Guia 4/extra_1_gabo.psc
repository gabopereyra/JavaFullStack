Algoritmo extra_1
	Definir vecUno, vecDos,i Como Entero
	Dimension vecUno(5)
	Dimension vecDos(5)
	Escribir "A continuación se crearán y mostrarán dos vectores compuestos por valores aleatorios entre 0 y 50 con una dimensión igual a 5"
	Escribir ""
	Escribir "--Presione cualquier tecla para continuar--"
	Esperar Tecla
	Escribir ""
	create(vecUno, vecDos, 5)
	show(vecUno, 5)
	show(vecDos, 5)
FinAlgoritmo

SubProceso create(vector Por Referencia, vector_dos Por Referencia, dim)
	Definir i Como Entero
	Para i=0 hasta dim-1 hacer
		vector(i) = Aleatorio(0, 50)
		vector_dos(i) = Aleatorio(0, 50)
	FinPara
	Escribir "Se generaron los vectores."
	Escribir ""
FinSubProceso


SubProceso show(vector, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir Sin Saltar "[",vector(i),"] "
	FinPara
	Escribir ""
FinSubProceso


//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
//y los muestre por pantalla.