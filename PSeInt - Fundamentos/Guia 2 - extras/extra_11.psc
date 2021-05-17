Algoritmo extra_11
	Definir nota_uno, nota_dos, nota_tres, nota_cuatro, total Como Entero
	Escribir "Ingrese la nota uno"
	Leer nota_uno
	Escribir "Ingrese la nota dos"
	Leer nota_dos
	Escribir "Ingrese la nota tres"
	Leer nota_tres
	Escribir "Ingrese la nota cuatro"
	Leer nota_cuatro
	
	Si nota_uno>=nota_dos Entonces
		total = nota_uno
		Si nota_dos>=nota_tres Entonces
			total = total + nota_dos
			Si nota_tres>=nota_cuatro Entonces
			total = total+nota_tres
			SiNo
			total = total+nota_cuatro
			Fin Si
		SiNo
			total = total + nota_tres
			si nota_dos >= nota_cuatro Entonces
				total = total + nota_dos
			SiNo
				total = total + nota_cuatro
			FinSi
		Fin Si
	SiNo
		total = nota_dos
		Si nota_uno>=nota_tres Entonces
			total = total + nota_uno
			Si nota_tres>=nota_cuatro Entonces
				total = total+nota_tres
			SiNo
				total = total + nota_cuatro
			Fin Si
		SiNo
			total = total + nota_tres
			si nota_uno>=nota_cuatro Entonces
				total = total + nota_uno
			SiNo
				total = total + nota_cuatro
			FinSi
		Fin Si
	Fin Si
	
	Escribir "El promedio de las 3 mayores es: ", total/3
FinAlgoritmo


// El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de 
//las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un 
// programa que determine cuál es la nota eliminada y el promedio de los trabajos 
// prácticos de un estudiante.