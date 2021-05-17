Algoritmo ejercicio_7
	Definir n como entero
	Escribir "Ingrese la cantidad de dias a calcular"
	Leer n
	temp(n)
FinAlgoritmo

SubProceso temp(n)
	Definir i, max, min Como Entero
	Para i = 1 hasta n Con Paso 1 Hacer
		Escribir "Ingrese la temperatura maxima del día ", i
		Leer max
		Escribir "Ingrese la temperatura minima del día ", i
		Leer min
		Escribir "La temperatura media del dia ", i, " es: ", (max+min)/2
		Escribir ""
	FinPara
FinSubProceso

//. Crear una procedimiento que calcule la temperatura media de un día a partir de la 
//temperatura máxima y mínima. Crear un programa principal, que utilizando un 
//procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya 
//mostrando la media de cada día. El programa pedirá el número de días que se van a 
//introducir.