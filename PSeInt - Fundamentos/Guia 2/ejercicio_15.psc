Algoritmo ejercicio_15
	Definir limite Como Entero
	Definir value Como Entero
	Definir contador Como Entero
	Definir iteracion Como Entero
	contador=0
	iteracion=0
	Escribir "Ingrese valor limite"
	Leer limite
	Mientras contador < limite Hacer
		Escribir "Ingrese un valor entero"
		Leer value
		contador = contador + value
		iteracion= iteracion + 1
	Fin Mientras
	Escribir "El valor limite fue de: ", limite
	Escribir "Las iteraciones realizadas fueron: ", iteracion
FinAlgoritmo
