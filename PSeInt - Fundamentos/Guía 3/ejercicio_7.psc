Algoritmo ejercicio_7
	Definir n como entero
	Escribir "Ingrese la cantidad de dias a calcular"
	Leer n
	temp(n)
FinAlgoritmo

SubProceso temp(n)
	Definir i, max, min Como Entero
	Para i = 1 hasta n Con Paso 1 Hacer
		Escribir "Ingrese la temperatura maxima del d�a ", i
		Leer max
		Escribir "Ingrese la temperatura minima del d�a ", i
		Leer min
		Escribir "La temperatura media del dia ", i, " es: ", (max+min)/2
		Escribir ""
	FinPara
FinSubProceso

//. Crear una procedimiento que calcule la temperatura media de un d�a a partir de la 
//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un 
//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya 
//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a 
//introducir.