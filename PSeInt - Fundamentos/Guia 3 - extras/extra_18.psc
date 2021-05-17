Algoritmo extra_18
	Definir n Como Entero
	Escribir "Ingrese que valor de la serie de Fibonacci desea obtener"
	Leer n
	Escribir fibonacci(n)
FinAlgoritmo

Funcion value = fibonacci(n)
	Definir value Como Entero
	si n = 0 o n = 1
		value = n
	SiNo
		value = fibonacci(n-1)+fibonacci(n-2)
	FinSi
FinFuncion

