Algoritmo extra_14
	Definir min, max, contador, sumatoria, num Como Entero
	Escribir "Ingrese el valor m�nimo"
	Leer min
	Escribir "Ingrese el valor maximo"
	Leer max
	Mientras max < min Hacer
		Escribir "El valor ingresado como m�ximo es MENOR al minino indicado"
		Escribir "Intente nuevamente"
		Leer max
	FinMientras
	contador = 0
	sumatoria = 0
	Escribir "A continuaci�n ingrese un n�mero"
	Leer num
	Mientras num>=min y num<=max Hacer
		sumatoria = sumatoria + num
		contador = contador + 1
		Escribir "Ingrese otro n�mero"
		Leer num
	FinMientras
	Escribir "El n�mero ingresado est� fuera del intervalo"
	Escribir "La cantidad de n�meros ingresados fue de: ", contador
	Escribir "La sumatoria de ellos es igual a: ", sumatoria

FinAlgoritmo


//. Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.