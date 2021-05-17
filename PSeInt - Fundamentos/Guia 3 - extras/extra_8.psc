Algoritmo extra_8
	Definir num Como Entero
	Leer num
	Escribir "Ingrese un número"
	Escribir invertido(num)
FinAlgoritmo

funcion resultado = invertido(num)
	Definir numInv, aux, original como entero
	definir resultado Como Caracter
	original = num
	numInv = 0
	mientras num<>0 Hacer
		aux = num%10
		numInv = numInv*10 + aux
		num = trunc(num/10)
	FinMientras
	Si numInv = original Entonces
		Escribir "Son capicúa"
	SiNo
		Escribir "NO son capicúa"
	FinSi
FinFuncion


//. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el 
//	numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. 
//	No podemos transformar el numero a cadena para realizar el ejercicio.