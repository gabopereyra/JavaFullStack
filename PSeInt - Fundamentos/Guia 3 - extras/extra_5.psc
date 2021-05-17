Algoritmo extra_5
	Definir n Como Entero
	Escribir "Ingrese un número de 2 ó más cifras"
	Leer n
	Escribir sumar(n)
FinAlgoritmo

funcion suma = sumar(n)
	Definir suma Como Entero
	Mientras Longitud(ConvertirATexto(n))<>2 Hacer
		Escribir "El número ingresado es incorrecto, intente nuevamente"
		Leer n
	FinMientras
	suma = trunc(n/10) + n%10
	Escribir "La suma de los digitos es: "
FinFuncion

//Realizar una función que calcule la suma de los dígitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en 
//		el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.