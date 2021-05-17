Algoritmo extra_9
	Definir m, n Como real
	Escribir "Ingrese la cantidad elementos"
	leer n
	Escribir "Ingrese el tamaño del conjunto"
	leer m
	Escribir combinatorio(n, m)
FinAlgoritmo

funcion bin = combinatorio(n, m)
	Definir bin Como real
	Mientras m<n o  n<0 o m<0 Hacer
		Escribir "Numeros invalidos"
		Escribir "Ingrese la cantidad elementos"
		leer n
		Escribir "Ingrese el tamaño del conjunto"
		leer m
	FinMientras	
	bin = factorial(m)/(factorial(n)*factorial(m-n))
FinFuncion

funcion fac = factorial(n)
	definir fac, var Como real
	fac = 1
	Si n = 0 Entonces
		fac = 1
	SiNo
		var = n
		Mientras n>0 hacer
			fac = fac*n
			n = n-1
		FinMientras
	FinSi
FinFuncion
