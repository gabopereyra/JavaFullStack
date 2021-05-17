Algoritmo extra_25
	Definir str Como Caracter
	Definir nuevo como caracter
	Definir inicio Como Entero
	
	Escribir "Ingrese texto"
	Leer str
	
	Para inicio<-Longitud(str) Hasta 0 Con Paso -1 Hacer
		nuevo = Subcadena(str,inicio, inicio)
		nuevo = Concatenar(nuevo, " ")
		Escribir Sin Saltar nuevo
	Fin Para
	Escribir  ""
	
FinAlgoritmo
//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo 
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola, 
//		deberemos mostrar a l o H.
