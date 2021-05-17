Algoritmo ejercicio_13
	Definir malos Como Entero
	Definir buenos Como Entero
	Escribir "Ingrese la cantidad de tornillos malos"
	Leer malos
	Escribir "Ingrese la cantidad de tornillos buenos"
	Leer buenos
	Si malos > 200 y buenos < 10000 Entonces
		Escribir "Operario grado 5"
	SiNo
		Si malos < 200 y buenos < 10000 Entonces
			Escribir "Operario grado 6"
		SiNo
			Si malos > 200 y buenos > 10000 Entonces
				Escribir "Operario grado 7"
			SiNo
				Escribir "Operario grado 8"
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
