Algoritmo extra_17
	Definir contador Como Entero
	Definir num Como Real
	contador = 1
	Escribir "Ingrese un número"
	Leer num
	Escribir ""
	
	Mientras num <> redon(num) o num < 0 Hacer
		Escribir "El numero ingresado NO es entero, o es negativo, intente nuevamente"
		Leer num		
	FinMientras
	
	Mientras num/10 >= 1 Hacer
		contador = contador + 1
		num = num/10
	FinMientras
	
	Escribir "El contador es: ", contador

FinAlgoritmo