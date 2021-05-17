Algoritmo ejercicio_8_b
	division()
FinAlgoritmo

SubProceso division()
	Definir a, b, i Como Entero
	Escribir "ingrese A"
	leer a
	Escribir "ingrese B"
	leer b
	i=0
	Mientras a-b >= 0 Hacer
		a = a - b
		i = i+1
	FinMientras
	Escribir "El cociente es igual a: ", i
	Escribir "El residuo es igual a: ", a
FinSubProceso
