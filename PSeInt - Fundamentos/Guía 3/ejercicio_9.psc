Algoritmo ejercicio_9
	Definir string Como Caracter
	Escribir "Ingrese el texto a convertir"
	Leer string
	convertir(string)
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
FinAlgoritmo
SubProceso convertir(string)
	Definir i Como Entero
	Definir final como caracter
	final = ""
	para i = 0 hasta Longitud(string)-1 Con Paso 1 Hacer
		Segun Minusculas(Subcadena(string, i, i)) Hacer
	"a":
		final = concatenar(final, "@")
	"e":
		final = concatenar(final, "#")
	"i":
		final = concatenar(final, "$")
	"o":
		final = concatenar(final, "%")
	"u":
		final = concatenar(final, "*")
	De Otro Modo:
		final = concatenar(final, Subcadena(string, i, i))
	Fin Segun
	FinPara
Escribir final
FinSubProceso




// Escribir un programa que procese una secuencia de caracteres ingresada por teclado
// y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
// manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de
//	los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.

//Realice un subprograma que reciba una secuencia de caracteres y retorne la 
//codificación correspondiente. Utilice la estructura “según” para la transformación.

//a e i o u
//@ # $ % *