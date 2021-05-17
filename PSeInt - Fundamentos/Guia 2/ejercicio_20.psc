Algoritmo ejercicio_20
	Definir str Como Caracter
	Definir nuevo como caracter
	Definir inicio Como Entero

	Escribir "Ingrese texto"
	Leer str

	Para inicio<-0 Hasta Longitud(str) Con Paso 1 Hacer
		nuevo = Subcadena(str,inicio, inicio)
		nuevo = Concatenar(nuevo, " ")
		Escribir Sin Saltar nuevo
	Fin Para
	Escribir  ""
FinAlgoritmo
