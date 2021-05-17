Algoritmo extra_7
	Definir vector, dim Como Entero
	Escribir "Ingrese la dimensi�n del vector"
	Leer dim
	Mientras dim<=0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vector(dim)
	Escribir "A continuaci�n se crear� un vector aleatorio (entre 0 y 50) con la dimensi�n indicada (",dim,")."
	Escribir "---PRESIONE CUALQUIER TECLA PARA CONTINUAR---"
	Esperar Tecla
	crear(vector, dim)
	Escribir "A continuaci�n se mostrar� el vector creado"
	Escribir "---PRESIONE CUALQUIER TECLA PARA CONTINUAR---"
	Esperar Tecla
	show(vector, dim)
	Escribir "A continuaci�n se mostrar� el vector ordenado de menor a mayor"
	Escribir "---PRESIONE CUALQUIER TECLA PARA CONTINUAR---"
	Esperar Tecla
	ordenar(vector, dim)
	show(vector, dim)
FinAlgoritmo

SubProceso crear(vector Por Referencia, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		vector(i) = Aleatorio(0,50)
	FinPara
	Escribir "El vector se ha creado con �xito"
	Escribir ""
FinSubProceso

SubProceso show(vector, dim)
	Definir i Como Entero
	Escribir "El vector ordenado es el siguiente:"
	para i=0 hasta dim-1
		Escribir Sin Saltar "[",vector(i),"] "
	FinPara
	Escribir ""
	Escribir ""
FinSubProceso

SubProceso ordenar(vector Por Referencia, dim)
	Escribir ""
	Definir i, j, aux Como Entero
	para j=0 hasta dim-1
		para i=0 hasta dim-2
			si vector(i) > vector(i+1)
				aux = vector(i)
				vector(i) = vector(i+1)
				vector(i+1)=aux
			FinSi
		FinPara
	FinPara
FinSubProceso

//
//Crear un programa que ordene un vector lleno de n�meros enteros aleatorios, de menor 
//a mayor. Nota: investigar el ordenamiento burbuja en el siguiente link: Ordenamiento
//		Burbuja