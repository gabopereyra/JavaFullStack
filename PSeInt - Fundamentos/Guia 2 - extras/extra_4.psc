Algoritmo extra_4
	//GABO GABO GABO
	Definir horas, combustible Como Real
	Escribir "Ingrese la cantidad de horas"
	Leer horas
	
	Mientras horas<0
		Escribir "La cantidad de horas ingresadas es menor a cero"
		Escribir "Ingrese la cantidad de horas"
		Leer horas		
	FinMientras
	
	si horas < 2 Entonces
		Escribir "El total a pagar es de: $400"
	SiNo
		Escribir "Ingrese combustible consumido"
		Leer combustible
		Mientras combustible<0
			Escribir "La cantidad de combustible ingresadas es menor a cero"
			Escribir "Ingrese la cantidad de combustible"
			Leer combustible
		FinMientras		
		Escribir "El total a pagar es: $", 400+(combustible*40)+((horas-2)*60)*5.2
	FinSi
	
FinAlgoritmo