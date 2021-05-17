Algoritmo Ejercicio_9
	Definir string Como Caracter;
	
	Escribir 'Ingrese una palabra: '
	Leer  string;
	
	string = SubCadena(string,0,0);
	
	si string = 'A' Entonces
		Escribir 'Correcto';
	SiNo
		Escribir 'Incorrecto';
		
	FinSi
FinAlgoritmo
