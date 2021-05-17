Algoritmo ejercicio_10
	Definir n Como Entero
	Escribir "Ingrese la cantidad de números a sumar"
	Leer n
	Escribir sumar(n)
FinAlgoritmo

Funcion suma = sumar(n)
	definir suma Como Entero
	suma = 0
	si n <> 0 Entonces
		suma = n + sumar(n-1)
	FinSi
FinFuncion

//private static int Sumatorio(int iNumero){
//if (iNumero==0)
//return 0;
//else
//return iNumero + Sumatorio(iNumero-1);
//}