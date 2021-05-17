Algoritmo extra_22
	Definir usuario, pc, iteraciones Como Entero
	Escribir "Ingrese un numero entre 1 y 10"
	Leer usuario
	Mientras usuario < 1 o usuario > 10 Hacer
		Escribir "El número ingresado es incorrecto, intente nuevamente"
		Leer usuario
	FinMientras
	Escribir ""
	Escribir "A continuación la PC elije un valor aleatorio entre 1 y 10"
	Escribir "En caso que su numero no sea igual al de la PC le seguira pidiendo numeros"
	Escribir "Presione cualquier tecla para continuar"
	Esperar Tecla
	pc = aleatorio(1, 10)
	iteraciones = 1
	si usuario = pc Entonces
		Escribir "El programa ha finalizado, realizando: ", iteracion, " iteraciones"
	SiNo
		Hacer
			si usuario < pc Entonces
				Escribir "El número ingresado por el usuario es menor"
			SiNo
				Escribir "El número ingresado por el usuario es mayor"
			FinSi
			Escribir "A continuación ingrese un nuevo valor"
			Leer usuario
			Mientras usuario < 1 o usuario > 10 Hacer
				Escribir "El número ingresado es incorrecto, intente nuevamente"
				Leer usuario
			FinMientras
			pc = Aleatorio(1,10)
			iteraciones = iteraciones + 1
		Hasta Que usuario = pc
		Escribir "El programa ha finalizado, realizando: ", iteraciones, " iteraciones"
	FinSi
FinAlgoritmo
//. Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a 
// continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1º) El programa elige al azar un número n entre 1 y 10. 
//	2º) El usuario ingresa un número x. 
//	3º) Si x no es el número exacto, el programa indica si n es más grande o más pequeño 
//			que el número ingresado.
//			4º) Repetimos desde 2) hasta que x sea igual a n. 
//			El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué 
//				hacer y qué pasó hasta que adivine el número. 
//				NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función 
//						Aleatorio(limite_inferior, limite_superior) de PSeInt.