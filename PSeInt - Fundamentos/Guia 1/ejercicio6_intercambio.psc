Algoritmo intercambio
	Definir num_uno Como Entero
	Definir num_dos Como Entero
	Definir num_tres Como Entero //Auxiliar
	Escribir "Ingrese el primer valor"
	Leer num_uno
	Escribir "Ingrese el segundo valor"
	Leer num_dos
	
	num_tres = num_uno
	num_uno = num_dos
	num_dos = num_tres
	Escribir "El valor original ingresado fue ",num_tres, " y ahora es ", num_uno
	Escribir "El valor original ingresado fue ",num_uno, " y ahora es ", num_tres
	
FinAlgoritmo
