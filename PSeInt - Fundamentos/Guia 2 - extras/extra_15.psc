Algoritmo extra_15
	Definir num, var Como Real
	Escribir "Ingrese un n�mero decimal"
	Leer num
	
	Mientras num = redon(num) Hacer
	Escribir "El numero ingresado NO es decimal, intente nuevamente"
	Leer num		
	FinMientras
	
	Escribir "Ingrese un numero cualquiera"
	Leer var
	Mientras var > num Hacer
		Escribir "El valor ingresado es mayor al n�mero decimal"
		Escribir "Ingrese un nuevo n�mero"
		Leer var
	FinMientras
	
	Escribir "El numero original es: ", num
	Escribir "El n�mero que detuvo el programa es: ", var
FinAlgoritmo