Algoritmo extra_9
	Definir vector, dim Como Entero
	Escribir "Ingrese dimensi�n del vector"
	Leer dim
	Mientras dim<0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vector(dim)
	create(vector, dim)
	Escribir ""
	Escribir "El valor del producto de los elementos es: ", producto(vector, dim)
FinAlgoritmo

SubProceso create(vector Por Referencia, dim)
	definir i Como Entero
	para i=0 hasta dim-1
		Escribir "Ingrese el valor para la posici�n: ",i
		leer vector(i)
	FinPara
FinSubProceso

Funcion prod=producto(vector, dim)
	Definir i, prod Como Entero
	prod = 1
	para i=0 hasta dim-1
		prod = prod*vector(i)
	FinPara
	
FinFuncion


//Programe una funci�n que calcule el producto de un arreglo de n�meros enteros. Para esto imagine, por ejemplo, q
//ue para un vector V de tama�o 4, el producto de todos los valores es igual a (V[1]*V[2]*V[3]*V[4]) 