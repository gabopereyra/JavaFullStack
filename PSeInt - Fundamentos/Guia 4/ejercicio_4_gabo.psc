Algoritmo ejercicio_4
	Definir vector, n, i Como Real
	Escribir "Indique dimensión del vector"
	Leer n
	Dimension vector(n)
	Escribir ""
	para i=0 hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese el elemento ", i
		Leer vector(i)
	FinPara
	Escribir maximo(vector, n)
FinAlgoritmo

funcion max = maximo(vector, n)
	Definir max, i, posicion Como Real
	max=0
	para i=0 hasta n-1
		si vector(i)>max Entonces
			max = vector(i)
			posicion = i
		FinSi
	FinPara
	Escribir "El mayor elemento se encuentra en la posición ",posicion," y su valor es: "
FinFuncion

//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el 
//valor más grande del vector