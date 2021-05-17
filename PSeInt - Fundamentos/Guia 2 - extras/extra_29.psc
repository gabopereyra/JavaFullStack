Algoritmo extra_29
	definir centros, num, anterior, posterior, i, j Como Entero
	centros = 0
	num = 2
	Mientras centros < 4
		
		anterior = 0
		para i=1 hasta num-1 Con Paso 1 Hacer
			anterior = anterior + i
		FinPara
		
		j = num +1 
		
		posterior = 0
		Mientras anterior > posterior Hacer
			posterior = posterior + j
			j = j + 1
		FinMientras
		
		si anterior = posterior Entonces
			centros = centros + 1
			Escribir "Centro núm hallado: ", num
		FinSi		
		
		num = num+1
	FinMientras

FinAlgoritmo
