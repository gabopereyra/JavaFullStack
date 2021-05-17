Algoritmo extra_15
	Definir str Como Caracter
	Escribir "Ingrese frase"
	Leer str
	vocales(str)
FinAlgoritmo

SubProceso vocales(str)
	Definir x,a ,e, i, oo, u Como Entero
	Definir aux Como Caracter
	aux=""
	a = 0
	e = 0
	i=0
	oo=0
	u=0
	para x=0 hasta Longitud(str)-1 Con Paso 1 Hacer
		Segun Minusculas(Subcadena(str, x, x)) Hacer
			"a":
				a = a+1
				si a = 1 Entonces
					aux=Concatenar(aux, "a")					
				FinSi
			"e":
				e = e+1
				si e = 1 Entonces
					aux=Concatenar(aux, "e")					
				FinSi
			"i":
				i = i+1
				si i = 1 Entonces
					aux=Concatenar(aux, "i")					
				FinSi
			"o":
				oo = oo+1
				si oo = 1 Entonces
					aux=Concatenar(aux, "o")					
				FinSi
				
			"u":
				u = u+1
				si u = 1 Entonces
					aux=Concatenar(aux, "u")					
				FinSi
			De Otro Modo:
				aux=Concatenar(aux, Subcadena(str, x, x))
		Fin Segun		
	FinPara
	Escribir aux
FinSubProceso



//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las 
//vocales repetidas. Al final el procedimiento mostrará la frase final.