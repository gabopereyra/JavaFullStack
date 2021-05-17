Algoritmo precio
	Definir precio_uno Como Real
	Definir precio_dos Como Real
	Definir variacion Como Real
	Escribir "Ingrese el precio al inicio del año"
	Leer precio_uno
	Escribir "Ingrese el precio al final del año"
	Leer precio_dos
	variacion = 100*((precio_dos-precio_uno)/precio_uno)
	Escribir "La variación de precio es del: ", variacion," %"
	Si variacion < 0 Entonces
		Escribir "El producto bajo de precio"	
		SiNo
			Si variacion <= 15 Entonces
				Escribir "El producto subio de precio moderadamente"	
			SiNo
				Escribir "El producto subio de precio ABUSIVAMENTE"
			Fin Si			
	Fin Si
FinAlgoritmo
