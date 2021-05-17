Algoritmo extra_10
	Definir cant Como Entero
	Definir precio Como Real
	Escribir "Ingrese la cantidad de manzanas a comprar"
	Leer cant
	Mientras cant<=0 Hacer
		Escribir "El número ingresado es menor o igual a cero"
		Escribir "Ingrese la cantidad de manzanas a comprar"
		Leer cant
	FinMientras
	
	Escribir "Ingrese el precio"
	Leer precio
	Mientras precio<=0 Hacer
		Escribir "El número ingresado es menor o igual a cero"
		Escribir "Ingrese el precio"
		Leer precio
	FinMientras
	
	Si cant>10 Entonces
		Escribir "Como la cantidad a llevar es de ",cant, " se le aplica un descuento del 20%"
		Escribir "Total a pagar: $", (cant*precio)*0.8
	SiNo
		Si cant>5 Entonces
			Escribir "Como la cantidad a llevar es de ",cant, " se le aplica un descuento del 15%"
			Escribir "Total a pagar: $", (cant*precio)*0.85
		SiNo
			Si cant>5 Entonces
				Escribir "Como la cantidad a llevar es de ",cant, " se le aplica un descuento del 10%"
				Escribir "Total a pagar: $", (cant*precio)*0.9
			SiNo
				Escribir "Como la cantidad a llevar es de ",cant, " no posee descuento"
				Escribir "Total a pagar: $", (cant*precio)
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
