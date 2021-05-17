Algoritmo extra_18
	Definir user, pass Como Entero
	
	Escribir "Ingrese el usuario"
	leer user
	Escribir "Ingrese el password"
	leer pass
	Escribir ""
	
	Si user <> 1024 o pass <> 4567 Entonces
		Escribir "Usuario o contraseña incorrectas"
		Hacer
			Escribir "Usuario o contraseña incorrectas"
			Escribir "Ingrese el usuario"
			leer user
			Escribir "Ingrese el password"
			leer pass
			Escribir ""
		Hasta Que user = 1024 y pass = 4567
		Escribir ""
		Escribir "Bienvenido user ", user	
	Sino
		Escribir "Bienvenido user ", user	
	FinSi


FinAlgoritmo

