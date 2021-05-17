Algoritmo Ejercicio_10
	Definir string Como Caracter;
	
	Escribir 'Ingrese una palabra: '
	Leer  string;
	
	si SubCadena(string,0,0) = SubCadena(string,Longitud(string)-1,Longitud(string)-1) Entonces
		Escribir 'Correcto';
	SiNo
		Escribir 'Incorrecto';
	FinSi
	
FinAlgoritmo