Algoritmo extra_5
	Definir n Como Entero
	Escribir "Ingrese un n�mero de 2 � m�s cifras"
	Leer n
	Escribir sumar(n)
FinAlgoritmo

funcion suma = sumar(n)
	Definir suma Como Entero
	Mientras Longitud(ConvertirATexto(n))<>2 Hacer
		Escribir "El n�mero ingresado es incorrecto, intente nuevamente"
		Leer n
	FinMientras
	suma = trunc(n/10) + n%10
	Escribir "La suma de los digitos es: "
FinFuncion

//Realizar una funci�n que calcule la suma de los d�gitos de un numero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en 
//		el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.