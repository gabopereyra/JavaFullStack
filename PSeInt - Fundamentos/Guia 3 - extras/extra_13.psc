Algoritmo extra_13
	Definir n Como Entero
	Escribir "Indique escalones que tendrá la escalera"
	Leer n
	escalera(n)
FinAlgoritmo

SubProceso escalera(n)
	Definir i, aux Como Entero
	para i=1 hasta n con paso 1 Hacer
		aux=1
		Mientras aux <= i hacer
			Escribir Sin Saltar aux
			aux = aux + 1
		FinMientras
		Escribir ""
	FinPara	
FinSubProceso
	