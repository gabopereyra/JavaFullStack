Algoritmo extra_9
	Definir year Como Entero;
	Escribir 'Ingresar un a�o: ';
	Leer year;
	
	si year % 4 = 0 Entonces
		si year % 100 = 0 Entonces
			si year % 400 = 0 Entonces
				Escribir 'El a�o ', year, ' es bisiesto';
			SiNo
				Escribir 'El a�o ', year, ' NO es bisiesto';
			FinSi
		SiNo
			Escribir 'El a�o ', year, ' es bisiesto';
		FinSi
		
	SiNo
		Escribir 'El a�o ', year, ' NO es bisiesto';
	FinSi
FinAlgoritmo


//. Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto 
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible 
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta 
//	bisiesto. Nota: recuerde la funci�n mod de PSeInt