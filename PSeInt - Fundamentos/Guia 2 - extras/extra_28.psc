Algoritmo extra_28
	//El que funciona bien
	Definir suma, total Como Real
	Definir num, var Como Entero
	Escribir "Ingrese un número mayor a cero"
	Leer num
	suma = 0
	Mientras num<=0 
		Escribir "Valor inválido, ingrese un valor mayor a cero"
		leer num
	FinMientras
	var=num
	Mientras var > 0
		total=1
		num = var
		Mientras num > 0
			total = total*num
			num = num-1
		FinMientras
		suma = suma + (1/total)
		var=var-1
	FinMientras
	Escribir "La sumatoria es: " suma+1
FinAlgoritmo
