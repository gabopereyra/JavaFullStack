Algoritmo extra_12
	Definir modalidad Como Entero
	Definir ventas, horas, valor_hora Como Real
	
	Escribir "Indique modalidad según los siguientes códigos"
	Escribir "1: comisión, 2: salario fijo+comisión, 3: salario fijo"
	Leer modalidad
	
	Mientras modalidad<0 | modalidad>3
		Escribir "La opción ingresada es incorrecta, intente nuevamente"
		Escribir "1: comisión, 2: salario fijo+comisión, 3: salario fijo"
		Leer modalidad
	FinMientras
	
	si modalidad = 1 Entonces
		Escribir "Ingrese el monto total de ventas"
		Leer ventas
		Mientras ventas<0
			Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
			Leer ventas
		FinMientras
		Escribir "El salario a abonar es: $", ventas*0.4
	SiNo
		si modalidad = 2 Entonces
			Escribir "Ingrese el valor por hora"
			Leer valor_hora
			Mientras valor_hora<=0
				Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
				Leer valor_hora
			FinMientras
			Escribir "Ingrese la cantidad de horas trabajadas"
			Leer horas
			Mientras horas<=0
				Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
				Leer horas
			FinMientras
			Escribir "Ingrese el monto total de ventas"
			Leer ventas
			Mientras ventas<0
				Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
				Leer ventas
			FinMientras
			Si horas <= 40 Entonces
				Escribir "El salario a abonar es: $", (horas*valor_hora)+(ventas*0.25)
			SiNo
				Escribir "El salario a abonar es: $", (40*valor_hora)+(ventas*0.25)
			FinSi	
		SiNo
			Escribir "Ingrese el valor por hora"
			Leer valor_hora
			Mientras valor_hora<=0
				Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
				Leer valor_hora
			FinMientras
			Escribir "Ingrese la cantidad de horas trabajadas"
			Leer horas
			Mientras horas<=0
				Escribir "La cantidad ingresada es incorrecta, intente nuevamente"
				Leer horas
			FinMientras
			Si horas <= 40 Entonces
				Escribir "El salario a abonar es: $", (horas*valor_hora)
			SiNo
				Escribir "El salario a abonar es: $", (40*valor_hora)+((horas-40)*valor_hora*1.5)
			FinSi	
		FinSi
	FinSi
	
FinAlgoritmo