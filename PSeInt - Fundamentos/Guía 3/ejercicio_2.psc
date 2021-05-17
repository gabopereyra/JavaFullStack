Algoritmo ejercicio_2
	Definir a Como Entero
	Escribir "Ingrese un valor entero"
	leer a
	si !par(a) entonces
		Escribir "El valor ingresado: ", a, ", es par"
	SiNo
		Escribir "El valor ingresado: ", a, ", es impar" 
	FinSi
	
FinAlgoritmo

funcion resultado = par(a)
	Definir resultado Como Logico
	si a%2<>0 Entonces
		resultado = Verdadero
	FinSi
FinFuncion

//Realizar una función que valide si un numero es impar o no. Si es impar la función debe 
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe 
//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.