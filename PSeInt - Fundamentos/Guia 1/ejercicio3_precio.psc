Algoritmo promedio
	Definir precio_uno Como Real
	Definir precio_dos Como Real
	Definir precio_tres Como Real
	Definir promedio_ Como Real
	Escribir "Ingrese el primer precio"
	Leer precio_uno
	Escribir "Ingrese el segundo precio"
	Leer precio_dos
	Escribir "Ingrese el tercer precio"
	Leer precio_tres
	Si precio_uno<=0 o precio_dos<=0 o precio_tres <= 0 Entonces
		Escribir "Todos los valores deben ser mayores a cero"
	SiNo
		promedio_ = (precio_uno+precio_dos+precio_tres)/3
		Escribir "El valor promedio es: $", promedio_
	Fin Si
	FinAlgoritmo
