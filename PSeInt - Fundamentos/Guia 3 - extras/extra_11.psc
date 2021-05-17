Algoritmo extra_11
	Definir str Como Caracter
	Escribir "Ingrese la frase a trabajar"
	Leer str
	espaciado(str)
FinAlgoritmo
SubProceso espaciado(str)
	Definir nuevo como caracter
	Definir inicio Como Entero
	Para inicio<-0 Hasta Longitud(str) Con Paso 1 Hacer
		si Subcadena(str,inicio, inicio) <> " " Entonces
			nuevo = Subcadena(str,inicio, inicio)
			nuevo = Concatenar(nuevo, " ")
			Escribir Sin Saltar nuevo
		FinSi
	Fin Para
	Escribir  ""
FinSubProceso
