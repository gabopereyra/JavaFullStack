Algoritmo EdadUsuario
	Definir edad Como Real
	Escribir "Ingrese edad"
	Leer edad
	Si edad < 0 Entonces
		Escribir "La edad no puede ser menor a cero"
	SiNo
		Si edad >= 18 Entonces
			Escribir "Es mayor de edad"
		SiNo
			Escribir "Es menor de edad"
		Fin Si
	Fin Si	
FinAlgoritmo