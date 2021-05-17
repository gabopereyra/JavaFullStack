Algoritmo extra_9
	Definir year Como Entero;
	Escribir 'Ingresar un año: ';
	Leer year;
	
	si year % 4 = 0 Entonces
		si year % 100 = 0 Entonces
			si year % 400 = 0 Entonces
				Escribir 'El año ', year, ' es bisiesto';
			SiNo
				Escribir 'El año ', year, ' NO es bisiesto';
			FinSi
		SiNo
			Escribir 'El año ', year, ' es bisiesto';
		FinSi
		
	SiNo
		Escribir 'El año ', year, ' NO es bisiesto';
	FinSi
FinAlgoritmo


//. Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto 
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible 
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta 
//	bisiesto. Nota: recuerde la función mod de PSeInt