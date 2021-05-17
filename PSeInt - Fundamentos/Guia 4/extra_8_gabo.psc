Algoritmo extra_8
	Definir vector, dim Como Entero
	Escribir "Ingrese la dimensión del vector"
	Leer dim
	mientras dim<=0 Hacer
		Escribir "La dimensión ingresada es incorrecta, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vector(dim)
	completar(vector, dim)
	show(vector, dim)
	Escribir "La sumatorio de los elementos es igual a: ",sumar(vector, dim)
FinAlgoritmo

SubProceso completar(vector Por Referencia, dim)
	definir i como entero
	Escribir ""
	para i=0 hasta dim-1
		Escribir "Ingrese el valor para la posición: ", i
		Leer vector(i)
	FinPara
FinSubProceso


SubProceso show(vector, dim)
	definir i como entero
	Escribir ""
	Escribir "El vector creado es el siguiente:"
	Escribir Sin Saltar "[ " 
	para i=0 hasta dim-1
		Escribir Sin Saltar vector(i)," "
	FinPara
	Escribir "]"
	Escribir ""
FinSubProceso

Funcion suma = sumar(vector, dim)
	definir suma Como Entero
	suma = 0
	si dim <> 0 Entonces
		suma = vector(dim-1) + sumar(vector, dim-1)
	FinSi
FinFuncion

//
//Programe una función recursiva que calcule la suma de un arreglo de números enteros.
