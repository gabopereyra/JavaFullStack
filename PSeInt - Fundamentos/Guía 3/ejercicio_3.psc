Algoritmo ejercicio_3
	Escribir EsMultiplo()
FinAlgoritmo

Funcion mult = EsMultiplo()
	Definir a, b Como Entero
	Escribir "Ingrese el valor de a"
	Leer a
	Escribir "Ingrese el valor de b"
	Leer b
	Definir mult Como logico
	si a%b =0 Entonces
		mult = Verdadero
	FinSi
FinFuncion

//Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
//validando que el primer numero múltiplo del segundo y devuelva verdadero si el 
//	primer numero es múltiplo del segundo, sino es múltiplo que devuelva falso.