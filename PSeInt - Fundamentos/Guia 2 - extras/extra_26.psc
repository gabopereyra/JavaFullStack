Algoritmo extra_26
	Definir num, i Como Entero
	Escribir "Ingrese un número"
	Leer num
	si num <= 0 Entonces
		Escribir "El número ingresado es menor o igual a cero, reinice el programa"
	SiNo
		Mientras num>0 Hacer
			Para i=num hasta 1 Con Paso -1 Hacer
				Escribir Sin Saltar "*"
			FinPara
			Escribir ""
			num = num-1
		FinMientras
		
	FinSi
FinAlgoritmo
//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera 
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se 
//deberá mostrar: