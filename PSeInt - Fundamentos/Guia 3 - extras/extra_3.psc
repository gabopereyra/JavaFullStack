Algoritmo sin_titulo
	Definir user, pass Como Caracter
	Escribir "Usuario:"
	Leer user
	Escribir "Contraseña:"
	Leer pass
	si Login(user, pass) Entonces
		Escribir "Bienvenido/a"
	SiNo
		Escribir "Lo sentimos..."
	FinSi
FinAlgoritmo

funcion result = Login(user, pass)
	Definir result Como Logico
	Definir intento Como Entero
	intento = 1
	result = Falso
	si user = "user" y pass = "hola" Entonces
		result = Verdadero
	SiNo		
		Hacer 
			intento = intento + 1
			Escribir "ingrese nuevamente los datos"
			Escribir "ingrese usuario:"
			Leer user
			Escribir "ingrese contraseña:"
			Leer pass
		Hasta Que intento > 3 o (user =="user" y pass == "hola")
		Si intento >3 Entonces
			Escribir "Se agotaron los intentos"
		SiNo
			result = Verdadero
		Fin Si
	FinSi
	
	si result = Verdadero Entonces
		Escribir "Utilizó ", intento, " intento/s para ingresar"
	FinSi
	
FinFuncion