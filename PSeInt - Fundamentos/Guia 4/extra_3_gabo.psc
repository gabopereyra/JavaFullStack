Algoritmo extra_3
	Definir nombre Como Caracter
	Definir long, dim Como Entero
	Escribir "Defina la cantidad de nombres a ingresar"
	Leer dim
	Mientras dim<0 Hacer
		Escribir "La dimensión ingresada es incorrecta, intente nuevamente"
		leer dim
	FinMientras
	Dimension nombre(dim)
	Dimension long(dim)
	llenarNombre(nombre, dim)
	llenarLongitud(long, nombre, dim)
	print(long, nombre, dim)
FinAlgoritmo

SubProceso llenarNombre(nombre Por Referencia, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir "Ingrese el nombre que va en la posición ",i
		leer nombre(i)
	FinPara
FinSubProceso


SubProceso llenarLongitud(long Por Referencia, nombre, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		long(i) = Longitud(nombre(i))
	FinPara
FinSubProceso

SubProceso print(long, nombre, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir "El nombre en la posición [",i, "] es: `",nombre(i),"` y tiene una longitud de ",long(i)," caracteres."
		Escribir ""
	FinPara
FinSubProceso




//. Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
//	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su
//	longitud.