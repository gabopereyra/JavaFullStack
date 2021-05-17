Algoritmo extra_23
	Definir dos, tres, inicio, cont_dos, cont_tres,i, multiplo Como Entero
	cont_dos = 0
	cont_tres = 0
	Escribir "El programa mostrará la cantidad de multiplos de 2 y de 3 que existen en el rango de 0 a 100"
	Escribir "Oprima cualquier tecla para continuar"
	Esperar Tecla
	para i=1 hasta 100 Con Paso 1 Hacer
		si i%2 = 0 Entonces
			cont_dos = cont_dos + 1
		FinSi
		si i%3 = 0 Entonces
			cont_tres = cont_tres + 1
		FinSi
	FinPara
	Escribir "Existen ", cont_dos, " multiplos de 2"
	Escribir "Existen ", cont_tres, " multiplos de 3"
FinAlgoritmo

// Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 
//3 comprendidos entre 1 y 100. 