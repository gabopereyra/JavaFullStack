Algoritmo extra_19
	Definir a, b Como Entero
	Escribir "Ingrese el primer valor"
	leer a
	Escribir "Ingrese el segundo valor"
	leer b
	Escribir "El MCD de ",a," y ",b," es: ",maxComunDivisor(a, b)
FinAlgoritmo
funcion mcd = maxComunDivisor(a, b)
	Mientras a<0 Hacer
		Escribir "Error en valor, ingrese un numero positivo"
		leer a
	FinMientras
	Mientras b<0 Hacer
		Escribir "Error en valor, ingrese un numero positivo"
		leer b
	FinMientras
	Definir mcd Como entero
	si a>=b y a%b=0 Entonces
		mcd = b
	SiNo
		mcd = maxComunDivisor(b, a%b)
	FinSi
FinFuncion
	