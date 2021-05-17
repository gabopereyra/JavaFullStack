Algoritmo Prueba
	
	Definir radio Como Real
	Definir superficie Como Real
	Definir circunferencia Como Real
	Escribir "Ingrese el radio"
	Leer radio
	Si radio <= 0 Entonces
		Escribir "El radio debe ser mayor a cero"
	SiNo
		Escribir "El radio ingresado fue: ", radio
		superficie = pi*(radio^2)
		circunferencia = 2*radio*pi
		
		Escribir "La superficie es: ",superficie
		Escribir "La circunferencia es: ",circunferencia
	Fin Si

	
FinAlgoritmo
