Algoritmo ejercicio_21
	Definir alumnado, inicio, cont, cont_aprobados, cont_parcial, max Como Entero
	Definir nota_tp, nota_expo, nota_parcial, prom_repro Como Real
	
	cont = 0
	cont_aprobados = 0
	cont_parcial = 0
	prom_repro = 0
	max = 0
	
	Escribir "Ingrese la cantidad de alumnos"
	Leer alumnado
	
	Para inicio = 1 Hasta alumnado Con Paso 1 Hacer
		Escribir "Ingrese las notas del alumno"
		Escribir "Nota TP"
		Leer nota_tp
		Escribir "Nota expo"
		Leer nota_expo
		Escribir "Nota parcial"
		Leer nota_parcial
		
		Si (nota_tp*0.35+nota_expo*.25+nota_parcial*0.4)<6.5 Entonces
			cont = cont+1
			prom_repro = (prom_repro+(nota_tp*0.35+nota_expo*.25+nota_parcial*0.4))
		Fin Si
		
		Si nota_tp>7.5 Entonces
			cont_aprobados = cont_aprobados+1
		Fin Si
		
		Si	nota_expo > max 
			max = nota_expo
		FinSi
		
		Si nota_parcial>=4 y nota_parcial<=7.5 Entonces
			cont_parcial = cont_parcial+1
		Fin Si
		
	FinPara
	
	Escribir "El promedio de los reprobados es: ", prom_repro/cont
	Escribir "El % de las notas mayores a 7.5 en el integrador: ", (cont_aprobados/alumnado)*100, "%"
	Escribir "La mayor nota de exposicion es: ", max
	Escribir "La cantidad de estudiantes que tienen nota de parcial entre 4 y 7.5 son: ", cont_parcial	
	
FinAlgoritmo



//Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante 
//reprueba el curso si tiene una nota final inferior a 6.5
//Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//La mayor nota obtenida en las exposiciones.
//Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.