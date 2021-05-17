Algoritmo ejercicio_2
	Definir vector, i, suma, resta, producto Como Real
	Dimension vector(10)
	suma=0
	resta=0
	producto=1
	para i=0 hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese el elemento ", i
		Leer vector(i)
		suma = suma + vector(i)
		resta = resta - vector(i)
		producto = producto * vector(i)
	FinPara	
	Escribir "La suma de los elementos es: ", suma
	Escribir "La resta de los elementos es: ", resta
	Escribir "El producto de los elementos es: ", producto
FinAlgoritmo

//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y muestre por pantalla la suma, 
//resta y multiplicación de todos los números ingresados al arreglo.