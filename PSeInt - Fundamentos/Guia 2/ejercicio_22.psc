Algoritmo ejercicio_22
	Definir cantidad, i Como entero
	Definir string Como Caracter
	Escribir "Indique tama�o del cuadrado"
	Leer cantidad
	string = ""
	
	// este bloque genera la primera l�nea
	Para i<-1 Hasta cantidad Hacer
	Escribir Sin Saltar "*"
	Fin Para
	
	//Salto de l�nea
	Escribir "" 
	
	//Este bloque genera las filas internas
	Para i<-1 Hasta (cantidad-2) Hacer
		string = string+" "
	Fin Para
	
	Para i = 1 Hasta cantidad-2 Hacer
		Escribir concatenar("*", concatenar(string, "*"))
	FinPara
	
	// este bloque genera la segunda l�nea
	Para i<-1 Hasta cantidad Hacer
		Escribir Sin Saltar "*"
	Fin Para
	
	//Salto de l�nea
	Escribir ""
 	
FinAlgoritmo


//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree 
// un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del 
// cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	//	* * * * 
	//  *     * 
	//	*     * 
	//   * * * *
	// Nota: Recordar el uso del escribir sin saltar en Pseint.