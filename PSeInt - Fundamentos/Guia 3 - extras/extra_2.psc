Algoritmo extra_2
	Definir str Como Caracter
	Escribir "Ingrese un numero, NO DECIMAL"
	leer str
	Escribir text(str)
FinAlgoritmo

funcion num = text(str)
	Definir num Como entero
	si Longitud(str) > 3 Entonces
		Escribir "El dato no es un numero entero numero, o tiene m�s de tres digitos"
	SiNo
		Escribir "Se ha convertido la cadena a numeros"
		num = ConvertirANumero(str)
	FinSi
FinFuncion

//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como 
//numero entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner 
//	n�meros con decimales