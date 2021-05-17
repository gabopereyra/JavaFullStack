Algoritmo extra_2
	Definir mes Como Caracter
	Definir venta Como Real
	
	Escribir "Ingrese mes de compra"
	Leer mes
	Escribir "Valor de compra realizado"
	Leer venta
	Si venta <0  Entonces
		Escribir "El valor ingresado NO debe ser menor a cero"
	SiNo
		Si Minusculas(mes) = "septiembre" o Minusculas(mes) = "octubre" o Minusculas(mes) = "noviembre" Entonces
			Escribir "La venta fue de: $", venta, " El total a cobrar es: $", (venta*0.9)
		SiNo
			Escribir "La venta fue de: $", venta
		Fin Si
	Fin Si
	
	
FinAlgoritmo


// Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del 
// 10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un 
// mes y el importe de la compra. El programa debe calcular cuál es el monto total que se 
// debe cobrar al cliente e imprimirlo por pantalla. 