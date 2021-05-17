Algoritmo extra_8
	Definir cantidad Como Entero
	Escribir "Ingrese la cantidad de llantas compradas"
	Leer cantidad
	Si cantidad > 10 Entonces
		Escribir "El monto total a pagar es: $", cantidad*2000
		Escribir "El precio unitario es: $2000"
	SiNo
		Si cantidad > 5 Entonces
			Escribir "El monto total a pagar es: $", cantidad*2500
			Escribir "El precio unitario es: $2500"
		SiNo
			Escribir "El monto total a pagar es: $", cantidad*3000
			Escribir "El precio unitario es: $3000"
		Fin Si
	Fin Si
FinAlgoritmo
