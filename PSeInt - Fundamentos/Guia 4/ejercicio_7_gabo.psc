Algoritmo ejercicio_7
	Definir vector_1, vector_2, dim, min, max Como Entero
	Escribir "Defina la dimensión de los vectores"
	leer dim
	Mientras dim < 0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vector_1(dim)
	Dimension vector_2(dim)
	Escribir "Defina los valores entre los cuales se creará el vector aleatorio"
	Escribir "Ingrese valor mínino"
	leer min
	Escribir "Ingrese valor máximo"
	leer max
	Mientras max < min Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer max
	FinMientras
	
	completar(vector_1, dim, min, max)
	completar(vector_2, dim, min, max)
	comparar(vector_1, vector_2, dim)
	
FinAlgoritmo

SubProceso completar(vector Por Referencia, n, min, max)
	Definir i Como Entero
	Para i=0 hasta n-1 hacer
		vector(i)=Aleatorio(min, max)
	FinPara
	Escribir "Se generó el vector"
	Para i=0 hasta n-1 hacer
		Escribir sin saltar "[",vector(i),"] "
	FinPara
	Escribir ""
FinSubProceso

SubProceso comparar(vector_1, vector_2, dim)
	Definir i, j Como Entero
	Definir log Como Logico
	log = Verdadero
	i=0
	mientras log=Verdadero y i<=(dim-1) Hacer
		j=0
		Mientras log=Verdadero y j<=(dim-1) Hacer
			si vector_1(i) <> vector_2(j) Entonces
				log = falso 
			FinSi
			j=j+1
		FinMientras
	FinMientras
	
	SI log
		Escribir "Todos los numeros son iguales"
	SiNo
		Escribir "Hay numeros diferentes"
	FinSi
FinSubProceso

//7. Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
//Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son 
//	iguales o no. La función debe devolver el resultado de está validación, para mostrar el 
//	mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.