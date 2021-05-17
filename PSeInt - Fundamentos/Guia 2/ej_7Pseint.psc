Algoritmo Ejercicio_7
	Definir string, ex, int Como Caracter;
	
	Escribir  'Ingrese una frase de 4 caracteres: ';
	Leer  string;
	ex = Concatenar(string, '!');
	int = Concatenar(string, '?');
	si Longitud(string) = 4 Entonces
		Escribir  ex;
	SiNo
		Escribir int;
	FinSi
FinAlgoritmo
