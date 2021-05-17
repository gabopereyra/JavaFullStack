Algoritmo rectangulo
	Definir base Como Real
	Definir altura Como Real
	Definir area Como Real
	Definir perimetro Como Real
	Escribir "Ingrese la base del rectangulo"
	Leer base
	Escribir "Ingrese la altura del rectangulo"
	Leer altura
	Si base <=0 o altura <=0 Entonces
		Escribir "Los valores deben ser mayores a cero"
	SiNo
		area = base*altura
		perimetro = (2*base)+(2*altura)
		Escribir "El área del rectángulo es: ", area
		Escribir "El perimetro del rectángulo es: ", perimetro
	Fin Si
FinAlgoritmo
