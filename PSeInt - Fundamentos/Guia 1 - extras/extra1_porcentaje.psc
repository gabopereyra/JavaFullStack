Algoritmo porcentual
	Definir m Como Entero
	Definir f Como Entero
	Definir porcentaje_m Como Real
	Definir porcentaje_f Como Real
	Escribir "Ingrese la cantidad de ni�os"
	Leer m
	Escribir "Ingrese la cantidad de ni�as"
	Leer f
	Si m < 0 o f <0 Entonces
		Escribir "Los valores no pueden ser menores a cero"
	SiNo
		porcentaje_m = 100*(m/(m+f))
		porcentaje_f = 100*(f/(m+f))
		Escribir "El % de ni�os es : ", porcentaje_m," %"
		Escribir "El % de ni�as es : ", porcentaje_f," %"
	Fin Si
FinAlgoritmo
