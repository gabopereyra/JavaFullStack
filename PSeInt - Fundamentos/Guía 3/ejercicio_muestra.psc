Algoritmo sin_titulo
	Definir a, b Como Real
	Escribir "Indique a"
	leer a
	Escribir "Indique b"
	leer b
	Escribir "El maximo es: " maximo(a,b)
FinAlgoritmo


Funcion resultado = maximo(a, b)
	Definir resultado Como Real
	si a>b Entonces
		resultado = a
	SiNo
		resultado = b
		
	FinSi
	
FinFuncion
	