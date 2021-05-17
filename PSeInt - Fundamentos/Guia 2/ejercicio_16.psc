Algoritmo ejercicio_16
	Definir num, suma, contador Como Entero
	Escribir "Ingrese el número"
	Leer num
	suma = 0
	contador = 0
	Mientras num<>-1 Hacer
		si num >=0 Entonces
			suma = suma + num
			Escribir "Ingrese un nuevo número"
			Leer num
			contador=contador+1
		SiNo
			Escribir "El valor ingresado es inválido, intente nuevamente"
			Leer num
		FinSi
	FinMientras
	Escribir "Se ingresó un -1, se finaliza ejecución"
	Escribir "El promedio de los de los numeros es: ", suma/contador
	
FinAlgoritmo
