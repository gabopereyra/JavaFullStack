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

//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
//validando que el primer numero m�ltiplo del segundo y devuelva verdadero si el 
//	primer numero es m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.