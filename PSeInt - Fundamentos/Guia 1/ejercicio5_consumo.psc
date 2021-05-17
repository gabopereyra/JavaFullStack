Algoritmo consumo
	Definir combustible Como Real
	Definir distancia Como Real
	Definir consumo_ Como Real
	Escribir "Ingrese los litros de combustible"
	Leer combustible
	Si combustible < 0 Entonces
		Escribir "El combustible NO puede ser menor a cero"
	SiNo
		Escribir "Ingrese distancia recorrida (en Km)"
		Leer distancia
		Si distancia < 0 Entonces
			Escribir "La distancia NO puede ser menor a cero"
		SiNo
			consumo_ = distancia/combustible;
			Escribir "El consumo fue de: ", consumo_, " km/litro"
			Si consumo_ > 12 Entonces
				Escribir "Excelente rendimiento!"
			SiNo
				Si consumo_ >= 8 Entonces
					Escribir "Creo deberías ir pensado como economizar...."
				SiNo
					Escribir "Efectivamente tenes que agregarle GNC."
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo