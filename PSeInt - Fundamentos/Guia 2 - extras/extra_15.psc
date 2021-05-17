Algoritmo extra_15
	Definir num, var Como Real
	Escribir "Ingrese un número decimal"
	Leer num
	
	Mientras num = redon(num) Hacer
	Escribir "El numero ingresado NO es decimal, intente nuevamente"
	Leer num		
	FinMientras
	
	Escribir "Ingrese un numero cualquiera"
	Leer var
	Mientras var > num Hacer
		Escribir "El valor ingresado es mayor al número decimal"
		Escribir "Ingrese un nuevo número"
		Leer var
	FinMientras
	
	Escribir "El numero original es: ", num
	Escribir "El número que detuvo el programa es: ", var
FinAlgoritmo