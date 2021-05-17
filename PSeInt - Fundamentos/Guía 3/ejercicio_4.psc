Algoritmo ejercicio_4
	Definir frase, letra Como Caracter
	Escribir "Ingrese una frase"
	leer frase
	Escribir "Ingrese la letra a buscar"
	leer letra
	Escribir "La letra se encuentra en la frase: ", text(frase, letra), " veces"
	
FinAlgoritmo

funcion c = text(a, b)
	Definir c, i Como entero
	c=0
	i=0
	Mientras i < Longitud(a) Hacer
		Si subcadena(a, i, i) = b Entonces
			c = c+1
		FinSi
		i = i+1
	FinMientras
FinFuncion

//. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La 
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso 
//	de la función Subcadena().