Algoritmo extra_14
	Definir min, max, contador, sumatoria, num Como Entero
	Escribir "Ingrese el valor mínimo"
	Leer min
	Escribir "Ingrese el valor maximo"
	Leer max
	Mientras max < min Hacer
		Escribir "El valor ingresado como máximo es MENOR al minino indicado"
		Escribir "Intente nuevamente"
		Leer max
	FinMientras
	contador = 0
	sumatoria = 0
	Escribir "A continuación ingrese un número"
	Leer num
	Mientras num>=min y num<=max Hacer
		sumatoria = sumatoria + num
		contador = contador + 1
		Escribir "Ingrese otro número"
		Leer num
	FinMientras
	Escribir "El número ingresado está fuera del intervalo"
	Escribir "La cantidad de números ingresados fue de: ", contador
	Escribir "La sumatoria de ellos es igual a: ", sumatoria

FinAlgoritmo


//. Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.