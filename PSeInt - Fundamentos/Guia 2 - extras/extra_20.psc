Algoritmo extra_20
	Definir num, contador, contador_uno, contador_dos, suma_pares, suma_impares Como Entero
	contador=0
	contador_uno =0
	contador_dos =0
	suma_pares = 0
	suma_impares = 0
	Hacer 
		contador = contador+1
		Escribir "Ingrese un número"
		leer num
			Si num%2 = 0 Entonces
				contador_uno = contador_uno + 1
				suma_pares = suma_pares + num
			SiNo
				contador_dos = contador_dos + 1
				suma_impares = suma_impares + num
			Fin Si		
	Hasta Que contador = 10
	si contador_uno>0 Entonces
		Escribir "El promedio de los pares es: ", suma_pares/contador_uno 
	FinSi
	si contador_dos>0 Entonces
		Escribir "El promedio de los impares es: ", suma_impares/contador_dos 
	FinSi
FinAlgoritmo

//. Hacer un algoritmo para calcular la media de los números pares e impares, sólo se 
// ingresará diez números