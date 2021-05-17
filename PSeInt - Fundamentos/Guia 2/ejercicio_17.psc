Algoritmo ejercicio_17
	Definir pass Como Caracter
	Definir intento Como Entero
	intento = 0
	Escribir "Ingrese contraseña"
	Leer pass
	Si pass = "eureka" Entonces
		Escribir "Bienvenido"
	SiNo
		Hacer 
			intento = intento + 1
			Escribir "ingrese nuevamente la contraseña"
			Leer pass
		Hasta Que intento >= 2 o pass == "eureka"
		Si intento >=2 Entonces
			Escribir "Se agotaron los intentos"
			SiNo
			Escribir "Bienvenido"
		Fin Si
	Fin Si
	
FinAlgoritmo
