Algoritmo extra_6
	Definir vector, dim Como Entero
	Escribir "Ingrese la dimensi�n del vector"
	Leer dim
	Mientras dim<=0 Hacer
		Escribir "El valor ingresado es incorrecto, intente nuevamente"
		Leer dim
	FinMientras
	Dimension vector(dim)
	crear(vector, dim)
	Escribir "A continuaci�n se obtendr� la diferencia entre el max y el min del vector ingresado"
	Escribir "---Presione cualquier tecla para continuar---"
	Esperar Tecla
	Escribir ""
	Escribir "La diferencia entre el valor m�ximo y m�nimo del vector es: ", diferencia(vector,dim)
FinAlgoritmo

SubProceso crear(vector Por Referencia, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir "Ingrese el valor para la posici�n ", i
		Leer vector(i)
	FinPara
	Escribir "El vector se ha creado con �xito"
	Escribir ""
FinSubProceso

Funcion dif=diferencia(vector,dim)
	Definir dif, max, min, i Como Entero
	max=vector(0)
	min=vector(0)
	para i=1 hasta dim-1
		si vector(i) > max Entonces
			max=vector(i)
		SiNo
			si vector(i) < min Entonces
				min=vector(i)
			FinSi
		FinSi
	FinPara
	dif = max-min
FinFuncion


//. Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un 
//arreglo y su valor m�s grande.