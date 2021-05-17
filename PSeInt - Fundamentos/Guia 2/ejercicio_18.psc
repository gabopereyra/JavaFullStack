Algoritmo ejercicio_18
	Definir num Como Entero
	Definir max Como Entero
	Definir min Como Entero
	Definir contador Como Entero
	Definir iteracion Como Entero
	
	contador = 0
	iteracion = 0

	Escribir "ingrese un número (si es 0 detiene el programa)"
	Leer num
	max = num;
	min = num;
	Si num = 0 Entonces
		Escribir "El numero inicial fue CERO"
	SiNo
		Hacer
			contador = contador + num
			iteracion = iteracion + 1
			Si num > max Entonces
				max = num;
			SiNo
				Si num < min Entonces
					min = num;
				Fin Si
			Fin Si
			Escribir "ingrese un número (si es 0 detiene el programa)"
			Leer num			
		Hasta Que num = 0
		Escribir "el promedio es: ", (contador/iteracion)
		Escribir "el max es: ", max
		Escribir "el min es: ", min
	Fin Si

FinAlgoritmo


// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
// todos ellos.