Algoritmo ejercicio_5
	Definir ans, vec_mostrar Como Caracter
	Definir vec_a, vec_b, vec_c Como Logico
	Definir vector_a, vector_b, vector_c, dim Como Real
	
	vec_a = Falso
	vec_b = Falso
	vec_c = Falso
	ans=""
	
	Escribir "Antes de comenzar indique la dimensión con que desea trabajar"
	leer dim
	
	Mientras dim < 1 Hacer
		Escribir "Valor incorrecto, intente nuevamente"
		leer dim
	FinMientras
	Dimension vector_a(dim)
	Dimension vector_b(dim)
	Dimension vector_c(dim)
	
	Mientras Minusculas(ans)<>"f" Hacer
		Segun Minusculas(ans) Hacer
			"a":
				si !vec_a 
					completar(vector_a, vec_a, dim)
				SiNo
					Escribir "El vector A ya fue definido previamente"
				FinSi
			"b":
				si !vec_b 
					completar(vector_b, vec_b, dim)
				SiNo
					Escribir "El vector B ya fue definido previamente"
				FinSi
			"c":
				si !vec_a o !vec_b
					Escribir "El vector A ó B no se encuentra generado"
				SiNo
					suma(vector_c, vector_a, vector_b, vec_c, dim)
				FinSi
			"d":
				si !vec_a o !vec_b
					Escribir "El vector A o B no se encuentra generado"
				SiNo
					resta(vector_c, vector_a, vector_b, vec_c, dim)
				FinSi
			"e":
				Escribir "Elija que vector desea ver: A, B o C"
				leer vec_mostrar
				Segun Minusculas(vec_mostrar)
					"a": 
						si !vec_a
							Escribir "El vector seleccionado no se encuentra creado"
						SiNo
							print(vector_a, dim)
						FinSi
					"b": 
						si !vec_b
							Escribir "El vector seleccionado no se encuentra creado"
						SiNo
							print(vector_b, dim)
						FinSi
					"c": 
						si !vec_c
							Escribir "El vector seleccionado no se encuentra creado"
						SiNo
							print(vector_c, dim)
						FinSi
					De Otro Modo:
						Escribir "La opción es incorrecta"
				FinSegun
				//			De Otro Modo:
				//				Escribir "La opción es incorrecta, intente nuevamente"
		Fin Segun
		Escribir ""
		Escribir "Presione cualquier tecla para continuar"
		Esperar Tecla
		menu
		leer ans
	FinMientras
	Escribir "Se ha finalizado el programa"
FinAlgoritmo


SubProceso menu
Escribir "Elija una opción:"
Escribir "a) Llenar vector A con núm aleatorios"
Escribir "b) Llenar vector B con núm aleatorios"
Escribir "c) Llenar vector C con la suma de los vectores A y B"
Escribir "d) Llenar vector C con la resta de los vectores B y A"
Escribir "e) Mostrar vectores"
Escribir "f) SALIR"
Escribir ""
FinSubProceso

SubProceso completar(vector Por Referencia,vec_ Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 hacer
		vector(i)=Aleatorio(-100, 100)
	FinPara
	vec_=Verdadero
	Escribir "Se generó el vector"
FinSubProceso

SubProceso suma(vector Por Referencia, vector_a, vector_b, vec_ Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 hacer
		vector(i)=vector_a(i)+vector_b(i)
	FinPara
	vec_ = Verdadero
	Escribir "Se generó correctamente el vector (suma)"
FinSubProceso

SubProceso resta(vector Por Referencia, vector_a, vector_b, vec_ Por Referencia, n)
	Definir i Como Entero
	Para i=0 hasta n-1 hacer
		vector(i)=vector_b(i)-vector_a(i)
	FinPara
	vec_ = Verdadero
	Escribir "Se generó correctamente el vector (resta)"
FinSubProceso

SubProceso print(vector, n)
	Definir i como entero
	Para i=0 hasta n-1
		Escribir Sin Saltar vector(i)
		Escribir Sin Saltar " "
	FinPara
	Escribir ""
FinSubProceso

//	. Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer 
//   hasta que ingrese la opción Salir:
//	a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera 
//	aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera 
//	aleatoria.
//	c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar 
//elemento a elemento. Ejemplo: C = A + B
//	d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar 
//elemento a elemento. Ejemplo: C = B - A
//	e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: 
//	Vector A, B, o C.
//	f. Salir
