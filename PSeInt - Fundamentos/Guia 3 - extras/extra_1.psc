Algoritmo extra_1
	Definir n Como Entero
	Escribir "Ingrese un n�mero"
	Leer n
	Escribir "La suma es: ", sumar(n)
FinAlgoritmo

Funcion suma = sumar(n)
	Definir suma, i Como entero
	suma = 0
	i = 1
	Mientras i < n Hacer
		si n%i = 0 Entonces
			suma = suma + i
		FinSi
		i = i+1
	FinMientras
FinFuncion

//Realizar una funci�n que calcule y retorne la suma de todos los divisores del n�mero n 
//distintos de n. El valor de n debe ser ingresado por el usuario.