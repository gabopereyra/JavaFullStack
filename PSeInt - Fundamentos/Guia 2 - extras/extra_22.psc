Algoritmo extra_22
	Definir usuario, pc, iteraciones Como Entero
	Escribir "Ingrese un numero entre 1 y 10"
	Leer usuario
	Mientras usuario < 1 o usuario > 10 Hacer
		Escribir "El n�mero ingresado es incorrecto, intente nuevamente"
		Leer usuario
	FinMientras
	Escribir ""
	Escribir "A continuaci�n la PC elije un valor aleatorio entre 1 y 10"
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
				Escribir "El n�mero ingresado por el usuario es menor"
			SiNo
				Escribir "El n�mero ingresado por el usuario es mayor"
			FinSi
			Escribir "A continuaci�n ingrese un nuevo valor"
			Leer usuario
			Mientras usuario < 1 o usuario > 10 Hacer
				Escribir "El n�mero ingresado es incorrecto, intente nuevamente"
				Leer usuario
			FinMientras
			pc = Aleatorio(1,10)
			iteraciones = iteraciones + 1
		Hasta Que usuario = pc
		Escribir "El programa ha finalizado, realizando: ", iteraciones, " iteraciones"
	FinSi
FinAlgoritmo
//. Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a 
// continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1�) El programa elige al azar un n�mero n entre 1 y 10. 
//	2�) El usuario ingresa un n�mero x. 
//	3�) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o 
//			que el n�mero ingresado.
//			4�) Repetimos desde 2) hasta que x sea igual a n. 
//			El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu� 
//				hacer y qu� pas� hasta que adivine el n�mero. 
//				NOTA: Para generar un n�mero aleatorio entre 1 y 10 se puede utilizar la funci�n 
//						Aleatorio(limite_inferior, limite_superior) de PSeInt.