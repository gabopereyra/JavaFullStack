Algoritmo extra_7
	Definir n Como Entero
	Escribir "Ingrese que término desea saber de fibonacci"
	leer n
	Escribir fibonacci(n)
FinAlgoritmo

Funcion fibo = fibonacci(n)
	Definir fibo, aux_uno, aux_dos, i Como entero
	si n<=1 Entonces
		fibo = 1
	SiNo
		aux_uno = 0
		aux_dos = 1
		Para i=1 hasta n-1 Con Paso 1 Hacer
			fibo = aux_uno + aux_dos
			aux_uno = aux_dos
			aux_dos = fibo
		FinPara
	FinSi
FinFuncion