Algoritmo cilindro
	Definir radio Como Real
	Definir altura Como Real
	Definir volumen Como Real
	Escribir "Ingrese el radio del cilindro"
	Leer radio
	Si radio <= 0 Entonces
		Escribir "El radio debe ser mayor a cero"
	SiNo
		Escribir "Ingrese la altura del cilindro"
		Leer altura
		Si altura <=0  Entonces
			Escribir "La altura debe ser mayor a cero"
		SiNo
			volumen = pi*(radio^2)*altura
			Escribir "El volumen del cilindro es: ", volumen
		Fin Si
	Fin Si
	
	

FinAlgoritmo
