Algoritmo ejercicio_5
	definir num Como entero
	Escribir "Ingrese un numero"
	Leer num
	si primo(num)
		Escribir "Es primo"
	sino
		Escribir "NO es primo"
	FinSi
FinAlgoritmo

funcion resultado = primo(n)
	Definir resultado Como Logico
	Definir c, i Como entero
	c = 0
	Para i=1 Hasta n Con Paso 1 Hacer
		si n%i=0 Entonces
			c = c+1
		FinSi
	Fin Para
	si c=2 Entonces
		resultado = Verdadero
	FinSi
FinFuncion






//. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el 
//	numero es primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� 
//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.