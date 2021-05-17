Algoritmo ejercicio_22
	Definir cantidad, i Como entero
	Definir string Como Caracter
	Escribir "Indique tamaño del cuadrado"
	Leer cantidad
	string = ""
	
	// este bloque genera la primera línea
	Para i<-1 Hasta cantidad Hacer
	Escribir Sin Saltar "*"
	Fin Para
	
	//Salto de línea
	Escribir "" 
	
	//Este bloque genera las filas internas
	Para i<-1 Hasta (cantidad-2) Hacer
		string = string+" "
	Fin Para
	
	Para i = 1 Hasta cantidad-2 Hacer
		Escribir concatenar("*", concatenar(string, "*"))
	FinPara
	
	// este bloque genera la segunda línea
	Para i<-1 Hasta cantidad Hacer
		Escribir Sin Saltar "*"
	Fin Para
	
	//Salto de línea
	Escribir ""
 	
FinAlgoritmo


//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree 
// un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del 
// cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
	//	* * * * 
	//  *     * 
	//	*     * 
	//   * * * *
	// Nota: Recordar el uso del escribir sin saltar en Pseint.