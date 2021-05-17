Algoritmo clima
	Definir respuesta Como Caracter
	Escribir "¿Como está el clima el día de hoy?"
	Escribir "Indique una de las siguientes opciones: soleado, nublado, lloviendo"
	Leer respuesta
	Si respuesta = "soleado" o respuesta = "nublado" o respuesta = "lloviendo" Entonces
		Escribir "El dia de hoy está ", respuesta
	SiNo
		Escribir "La opción ingresada no es válida"
	Fin Si
	
FinAlgoritmo
