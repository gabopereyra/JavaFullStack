Algoritmo integrador_Pereyra_Gabriel
	///--- Pereyra, Gabriel ---///
	//Lógica del programa:
	//Atendiendo la solicitud de validar la muestra si el usuario carga mal la cantidad necesaria de caracteres de la cadena
	//se le preguntará al usuario si desea volver a cargarla, o que el programa ayude en la corrección
	//la corrección seguirá la siguiente lógica: si es menor a 9 caracteres, pide completarla, caso contrario trunca la cadena al minino válido inmediato.
	
	Definir muestra Como Caracter ///Variable entrada
	Definir vectorMuestra Como Caracter
	Definir matrizDatos Como Caracter ///Variable salida
	Definir long Como Entero
	Definir aux_dim Como Entero
	
	Escribir "Antes de continuar por favor amplie la consola."
	wait()
	
	Escribir "A continuación ingrese la muestra a analizar"
	Escribir "Tenga en cuenta que debe cargar solo A, B, C ó D, y que la longitud tiene que ser de 9, 16 ó 1369 caracteres"
	Leer muestra
	
	validarLongitud(muestra) //se valida la longitud de la cadena
	
	long = Longitud(muestra) 
	Dimension vectorMuestra(long)
	convertir(vectorMuestra, muestra, long) //Conversion cadena a vector, se realiza para poder evaluarlo y llevarlo a matriz fácilmente
	
	validarCaracteres(vectorMuestra, long) //subproceso para validar el contenido de la cadena
	
	aux_dim = rc(long)
	Dimension matrizDatos(aux_dim, aux_dim)
	buscarGen(matrizDatos, vectorMuestra, aux_dim) //Subproceso para validar analizar la matriz
FinAlgoritmo

//SubProceso para validar longitud cadena
SubProceso validarLongitud(muestra Por referencia)
	Definir verificador Como Logico
	Definir size Como Entero
	Definir rta Como Caracter
	size = Longitud(muestra)
	si size <> 9 y size  <> 16 y size <> (37^2) entonces
		Escribir ""
		Escribir "El tamaño ingresado es incorrecto"
		Escribir "¿Desea reingresar el dato o permitir que el programa lo corrija?"
		Escribir "Indique R para reingresar o C para correción por programa"
		leer rta
		Mientras Mayusculas(rta)<>"R" y Mayusculas(rta)<>"C"
			Escribir "Opción incorrecta, intente nuevamente"
			Leer rta
		FinMientras
		si Mayusculas(rta)="R" Entonces
			Escribir "Ingrese nueva muestra"
			Leer muestra
			validarLongitud(muestra)
		SiNo
			redimensionar(muestra, size)
			validarLongitud(muestra)
		FinSi
	FinSi
FinSubProceso
//FIN SubProceso para validar longitud cadena

//SubProceso para REDIMENSIONAR la cadena original
SubProceso redimensionar(muestra Por Referencia, long)
	Definir i Como Entero
	Definir aux, dato Como Caracter
		//validacion menor a 9
		si long < 9 Entonces
			Escribir "Debe agregar ",9-long," datos"
			para i=1 hasta 9-long
				Escribir "Ingrese dato (",i,")"
				leer dato
				muestra = Concatenar(muestra, dato)
			FinPara
			//fin validacion hasta 9
		SiNo
			//SI mayor a 74, trunca a 74
			si long > 37^2 Entonces
				aux = ""
				para i=0 hasta (37^2)-1
					aux = Concatenar(aux, Subcadena(muestra,i, i))
				FinPara
				Escribir "Se ha truncado la cadena a ", 37^2," caracteres"
				Escribir ""
				muestra = aux
			SiNo
				//SI mayor a 16 y menor a 37^2, trunca a 16
				si long > 16 Entonces
					aux = ""
					para i=0 hasta 15
						aux = Concatenar(aux, Subcadena(muestra,i, i))
					FinPara
					Escribir "Se ha truncado la cadena a ", 16," caracteres"
					Escribir ""
					muestra = aux
				SiNo
					//SI mayor a 9 y menor a 16, trunca a 9
					aux = ""
					para i=0 hasta 8
						aux = Concatenar(aux, Subcadena(muestra,i, i))
					FinPara
					Escribir "Se ha truncado la cadena a ", 9," caracteres"
					Escribir ""
					muestra = aux
				FinSi
			FinSi
		FinSi
FinSubProceso
//FinSubProceso longitud texto

//SubProceso para convertir cadena a vector
SubProceso convertir(vectorMuestra, muestra, long)
	Definir i Como Entero
	para i=0 hasta long-1
		vectorMuestra(i)=Subcadena(muestra,i,i)
	FinPara
FinSubProceso
//fin SubProceso para convertir cadena

//SubProceso para validar los caracteres
SubProceso validarCaracteres(vectorMuestra, long)
	definir i Como Entero
	Definir validacion Como Logico
	para i=0 hasta long-1
		//Se analiza la posición para ver el valor en la misma
		si vectorMuestra(i)<>"A" y vectorMuestra(i)<>"B" y vectorMuestra(i)<>"C" y vectorMuestra(i)<>"D" Entonces
			validacion = Falso //si el dato no coincide se genera un FALSO que nos ayudará a controlar la correcta inyección del valor
			mientras !validacion Hacer //Mientras el valor no sea "Verdadero" lo seguirá solicitando
				Escribir ""
				Escribir "El dato ingresado en la posición ", i," es incorrecto, modifique el valor"
				Escribir "No se olvidé de verificar que el dato esté en mayúsculas"
				leer vectorMuestra(i)
				si vectorMuestra(i)<>"A" y vectorMuestra(i)<>"B" y vectorMuestra(i)<>"C" y vectorMuestra(i)<>"D" Entonces
					validacion = Falso
				SiNo
					validacion=Verdadero //Cuando el usuario carga el valor conforme el tipo de dato cambia el booleano y sale del mientras
				finsi
			FinMientras
		FinSi
	FinPara
FinSubProceso
//FIN SubProceso para validar los caracteres

//SubProceso analisis de la matriz
SubProceso buscarGen(matrizDatos, vectorMuestra, aux)
	crear(matrizDatos, vectorMuestra, aux)
	wait()
	Limpiar Pantalla
	Escribir "Matriz datos: "
	show(matrizDatos, aux)
	Escribir ""
	si gen(matrizDatos, aux) Entonces
		Escribir "--Se ha encontrado el GEN--"
	SiNo
		Escribir "--NO se ha encontrado el GEN--"
	FinSi
FinSubProceso
//FinSubProceso analisis de la matriz

//SubProceso para crear la matriz
SubProceso crear(matriz, vector, aux)
	Definir i, j, aux_v Como Entero
	aux_v=0
	para i=0 hasta aux-1
		para j=0 hasta aux-1
			matriz(i,j)=vector(aux_v)
			aux_v = aux_v + 1
		FinPara
	FinPara
FinSubProceso
//Fin SubProceso creacion de la matriz

//Suproceso para mostrar la matriz
SubProceso show(matriz, dim)
	Definir i, j Como Entero
	para i=0 hasta dim-1
		para j=0 hasta dim-1
			Escribir Sin Saltar "|", matriz(i,j),"| "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
//Fin SubProceso para mostrar la matriz

//Funcion para analizar la matriz
Funcion z = gen(matrizDatos, aux)
	Definir z Como Logico
	Definir dig_uno, dig_dos Como Caracter
	Definir i, j Como Entero
	//si la matriz es de 4*4 las diagonales pueden ser distintas, caso contrario deberan ser iguales para poder encontrar el gen ya que las diagonales se cruzan
	z = Verdadero
	si aux=4
		dig_uno = matrizDatos(0,0)
		//Verificar primer diagonal
		j=1
		para i=1 hasta aux-1
				si matrizDatos(i,j) <> dig_uno Entonces
					z=Falso
				FinSi
			j = j+1
		FinPara
		si z Entonces
			//verifica segunda diagonal
			dig_dos = matrizDatos(3,0)
			j=1
			para i=(aux-2) hasta 0
					si matrizDatos(i,j) <> dig_dos Entonces
						z = Falso
					FinSi
			j=j+1
			FinPara
		FinSi
	SiNo
		dig_uno = matrizDatos(0,0)
		//Verificar primer diagonal
		j=1
		para i=1 hasta aux-1
			si matrizDatos(i,j) <> dig_uno Entonces
				z=Falso
			FinSi
			j = j+1
		FinPara
		si z Entonces
			//verifica segunda diagonal
			j=1
			para i=(aux-2) hasta 0
				si matrizDatos(i,j) <> dig_uno Entonces
					z = Falso
				FinSi
				j=j+1
			FinPara
		FinSi
	FinSi
FinFuncion
//fin funcion analisis

//Subproceso auxiliar
SubProceso wait()
	Escribir ""
	Escribir "--PRESIONE CUALQUIER TECLA PARA CONTINUAR--"
	Esperar Tecla
	Escribir ""
FinSubProceso
//FIN Subproceso auxiliar
