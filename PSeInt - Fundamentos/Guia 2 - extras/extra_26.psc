Algoritmo extra_26
	Definir num, i Como Entero
	Escribir "Ingrese un n�mero"
	Leer num
	si num <= 0 Entonces
		Escribir "El n�mero ingresado es menor o igual a cero, reinice el programa"
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
//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera 
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se 
//deber� mostrar: