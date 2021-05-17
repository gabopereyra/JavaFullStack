Algoritmo extra_27
	definir total, num, var Como real

	Escribir "Ingrese un número entero positivo"
	Leer num
	total = 1
	Mientras num<0 Hacer
		Escribir "El número ingresado es negativo"
		Escribir "intente nuevamente"
		Leer num
	FinMientras
	Si num = 0 Entonces
		Escribir "El factorial de 0 es: 1"
	SiNo
		var = num
		Mientras num>0 hacer
			total = total*num
			num = num-1
		FinMientras
		Escribir "El factorial de ", var " es: ", total
	FinSi
FinAlgoritmo
//La función factorial se aplica a números enteros positivos. El factorial de un número 
//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n 
//	Escriba un programa que calcule los factoriales de todos los números enteros desde el 1 
//hasta el 5. El programa deberá mostrar la siguiente salida: 
//!1 = 1
//!2 = 1*2 = 2
//!5 = 1*2*3*4*5 = 120
//Nota: si necesitas saber más sobre la función factorial revisar este link: Funcion Factoria