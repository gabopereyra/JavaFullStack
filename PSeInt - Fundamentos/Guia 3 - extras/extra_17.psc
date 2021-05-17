Algoritmo extra_17
	Definir str Como Caracter
	Escribir "Ingrese el str a invertir"
	leer str
	Escribir invertir(str)
FinAlgoritmo


Funcion inv= invertir(str)
    Definir inv Como Caracter
    Si Longitud(str) > 1
        inv = invertir(Subcadena(str,1,Longitud(str)))+ Subcadena(str,0,0)
    SiNo
        inv=str
    FinSi
FinFuncion