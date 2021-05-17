Algoritmo extra_1
	Definir suma, nota Como Real
	Escribir "ingrese nota 1"
	Leer nota
	suma = nota
	Escribir "ingrese nota 2"
	Leer nota
	suma = suma+nota
	Escribir "ingrese nota 3"
	Leer nota
	suma = suma+nota
	si (suma/3)<7 Entonces
		Escribir "DESprobado!!, promedio: ", (suma/3)
	SiNo
		Escribir "Aprobado, promedio: ", (suma/3)
	FinSi
FinAlgoritmo
