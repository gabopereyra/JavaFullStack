Algoritmo ejercicio_3
	Definir vector, x, n, i Como Real
	Definir existe Como logico
	existe = falso
	Escribir "Indique dimensi�n del vector"
	Leer n
	Dimension vector(n)
	Escribir ""
	para i=0 hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese el elemento ", i
		Leer vector(i)
	FinPara
	Escribir ""
	Escribir "Indique que n�mero desea buscar dentro del vector"
	leer x
	Escribir ""
	para i=0 hasta n-1 Con Paso 1 Hacer
		si x=vector(i) Entonces
			Escribir "El n�mero buscado (",x,") se ha encontrado en la posici�n: ", i
			existe = Verdadero
		FinSi
	FinPara
	si !existe Entonces
		Escribir "No se ha encontrado el n�mero indicado (", x, ") dentro del arreglo."
	FinSi
FinAlgoritmo

//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usuario. 
//A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar tambi�n debe ser ingresado por el usuario). 
//El programa debe indicar la posici�n donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben 
//imprimir todas las posiciones donde se encuentra ese valor . 
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un mensaje. 