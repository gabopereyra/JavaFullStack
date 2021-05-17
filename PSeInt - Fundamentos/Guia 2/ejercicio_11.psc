Algoritmo ejercicio_11
	Definir ans Como Caracter
	Definir numUno Como Entero
	Definir numDos Como Entero
	Definir resultado Como Real
	Escribir "Ingrese los números a operar, tenga en cuenta que el orden puede afectar las operaciones"
	Leer numUno
	Leer numDos
	
	Escribir "Ingrese que tipo de operacion desea realizar"
	Escribir "Para sumar escriba S ó s, para restar R ó r, para multiplicar M ó m, para dividir D ó d"
	Leer ans
	Segun ans Hacer
		"S", "s":
			resultado = numDos + numUno
			Escribir "El resultado es: ", resultado;
		"R", "r":
			resultado = numUno-numDos
			Escribir "El resultado es: ", resultado;
		"M", "m":
			resultado = numDos*numUno
			Escribir "El resultado es: ", resultado;
			"D", "d":	
				resultado = numUno/numDos
				Escribir "El resultado es: ", resultado;
		De Otro Modo:
			Escribir "la operacion elegida es incorrecta"
	Fin Segun
FinAlgoritmo