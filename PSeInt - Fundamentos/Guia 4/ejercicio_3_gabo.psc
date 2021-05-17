Algoritmo ejercicio_3
	Definir vector, x, n, i Como Real
	Definir existe Como logico
	existe = falso
	Escribir "Indique dimensión del vector"
	Leer n
	Dimension vector(n)
	Escribir ""
	para i=0 hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese el elemento ", i
		Leer vector(i)
	FinPara
	Escribir ""
	Escribir "Indique que número desea buscar dentro del vector"
	leer x
	Escribir ""
	para i=0 hasta n-1 Con Paso 1 Hacer
		si x=vector(i) Entonces
			Escribir "El número buscado (",x,") se ha encontrado en la posición: ", i
			existe = Verdadero
		FinSi
	FinPara
	si !existe Entonces
		Escribir "No se ha encontrado el número indicado (", x, ") dentro del arreglo."
	FinSi
FinAlgoritmo

//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usuario. 
//A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar también debe ser ingresado por el usuario). 
//El programa debe indicar la posición donde se encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben 
//imprimir todas las posiciones donde se encuentra ese valor . 
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un mensaje. 