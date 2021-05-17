Algoritmo Ejercicio_8
	Definir nota_1, nota_2, nota_3 Como Entero;
	Definir bool Como Logico;
	
	Escribir 'Ingresar 3 notas: ';
	Leer nota_1, nota_2, nota_3;
	
	bool = (nota_1 > 10 o nota_1 < 1) | (nota_2 > 10 o nota_2 < 1) | (nota_3 > 10 o nota_3 < 1)
	
	si bool = Falso Entonces
		Escribir  'Notas Correctas';
	SiNo
		Escribir  'Notas Incorrectas';
	FinSi
FinAlgoritmo
