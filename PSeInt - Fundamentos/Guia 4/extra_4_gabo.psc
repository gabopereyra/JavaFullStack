Algoritmo extra_4
	Definir notas Como Entero
	Definir ans Como Caracter
	Dimension notas(100)
	Escribir "A continuación se va a generar un vector aleatorio de 100 notas comprendidas entre 0 a 20"
	Escribir "----PRESIONE CUALQUIER TECLA PARA CONTINUAR----"
	Escribir ""
	Esperar Tecla
	crear(notas,100)
	Escribir "----PRESIONE CUALQUIER TECLA PARA CONTINUAR----"
	Esperar Tecla
	analizar(notas,100)
	Escribir "¿Desea ver el vector que posee las notas? (s/S: para el SI - n/N: para el NO)"
	Leer ans
	Mientras Minusculas(ans)<>"s" y Minusculas(ans)<>"n" Hacer
		Escribir "La opción ingresada es incorrecta, intente nuevamente"
		Escribir "Ingrese s/S para el SI - n/N para el NO"
		Leer ans
	FinMientras
	Si Minusculas(ans)="s" Entonces
		show(notas,100)
	FinSi
FinAlgoritmo

SubProceso crear(notas Por Referencia, dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		notas(i)=Aleatorio(0,20)
	FinPara
	Escribir "Se ha generado correctamente el vector"
	Escribir ""
FinSubProceso

SubProceso analizar(notas,dim)
	Definir i, cat_a, cat_b, cat_c, cat_d Como Entero
	cat_a = 0
	cat_b = 0
	cat_c = 0
	cat_d = 0
	para i=0 hasta dim-1
		Si notas(i) >= 16
			cat_d = cat_d+1
		SiNo
			Si notas(i) >= 11
				cat_c = cat_c+1
			SiNo
				Si notas(i) >= 6
					cat_b = cat_b+1
				SiNo
					cat_a = cat_a+1
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "Los resultados de las notas del alumnado son las siguientes: "
	Escribir "Categoría a) - Deficientes (notas de 0 a 5): ", cat_a
	Escribir "Categoría b) - Deficientes (notas de 6 a 10): ", cat_b
	Escribir "Categoría c) - Deficientes (notas de 11 a 15): ", cat_c
	Escribir "Categoría d) - Deficientes (notas de 16 a 20): ", cat_d
	
FinSubProceso


SubProceso show(notas,dim)
	Definir i Como Entero
	para i=0 hasta dim-1
		Escribir Sin Saltar "[", notas(i),"] "
	FinPara
	Escribir ""
FinSubProceso
//
//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
//0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de
//PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos
//estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20