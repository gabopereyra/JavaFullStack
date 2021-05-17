Algoritmo ejercicio_8
	Definir a, b Como Entero
	Escribir "ingrese A"
	leer a
	Escribir "ingrese B"
	leer b
	division(a,b)
FinAlgoritmo
SubProceso division(num1, num2)
	definir i Como Entero
	i=0
	Mientras num1-num2 >= 0 Hacer
		num1 = num1 - num2
		i = i+1
	FinMientras
	Escribir "El cociente es igual a: ", i
	Escribir "El residuo es igual a: ", num1
FinSubProceso

//	Realizar un procedimiento que permita realizar la división entre dos números y muestre
//	el cociente y el resto utilizando el método de restas sucesivas.
//	El método de división por restas sucesivas consiste en restar el dividendo con el
//	divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y 
//	el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 – 13 = 37 una resta realizada
//		37 – 13 = 24 dos restas realizadas
//		24 – 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.