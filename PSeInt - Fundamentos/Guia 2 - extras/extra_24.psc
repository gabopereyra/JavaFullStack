Algoritmo extra_24
	Definir n, suma, i, siguiente Como Entero
	Escribir "El programa realizará la suma de los numeros naturales"
	Escribir "Indique hasta que numero desea que se realice la suma"
	Leer n
	suma = 0
	siguiente = 0
	Mientras n<0 Hacer
		Escribir "El numero ingresado es menor o igual a cero"
		Escribir "Ingrese un nuevo número"
		Leer n
	FinMientras
	para i=1 hasta n Con Paso 1 Hacer
		siguiente = siguiente + 1
		suma = suma + siguiente
	FinPara
	Escribir "La suma es: ", suma
FinAlgoritmo
