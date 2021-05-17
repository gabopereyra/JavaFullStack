Algoritmo extra_16
	Definir n Como Entero
	Escribir "Ingrese hasta que valor PAR desea calcular la suma de los pares"
	leer n
	Escribir par(n)
FinAlgoritmo

funcion suma = par(n)
	Definir suma como entero
	Si n%2 <> 0 Entonces
		Escribir "El número ingresado es incorrecto"
		suma = n
	SiNo
		suma = 0
		si n > 0 Entonces
			suma = n + par(n-2)
		FinSi
	FinSi
FinFuncion



//definir suma Como Entero
//suma = 0
//si n <> 0 Entonces
//	suma = n + sumar(n-1)
//FinSi


//Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2. 
//Chequear que si N es impar se muestre un mensaje de error.