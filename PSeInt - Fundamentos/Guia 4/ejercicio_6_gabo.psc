Algoritmo ejercicio_6
	Definir frase, vector, char Como Caracter
	Definir n, n_char, pos Como entero
	
	Escribir "Ingrese una frase cualquiera"
	Leer frase
	
	n = 20 //dimension vector fija, posee 20 ubicaciones
	Dimension vector(n)
	completar(vector, n, frase)
	
	Escribir "Indique el caracter a ingresar"
	leer char
	n_char = Longitud(char)
	
	Mientras n_char <> 1 Hacer
		Escribir "Se debe ingresar solo un caracter, intente nuevamente"
		leer char
		n_char = Longitud(char)
	FinMientras
	
	Escribir ""
	Escribir "Ahora indique en que posición desea ingresar el caracter, recordando que el vector posee ", n-1, " posiciones, incluyendo el 0."
	leer pos
	Mientras pos < 0 o pos >n-1 Hacer
		Escribir "La posición ingresada es incorrecta, intente nuevamente"
		leer pos
	FinMientras
	Escribir ""
	
	cambio(vector, n, char, pos)
	
FinAlgoritmo


SubProceso completar(vector Por Referencia, n, frase)
	Definir i Como Entero
	Para i=0 hasta n-1
		si Subcadena(frase, i, i)<>""
			vector(i)=Subcadena(frase, i, i)
		SiNo
			vector(i)=" "
		FinSi
	FinPara
	Escribir "Se generó el vector"
	Escribir ""
FinSubProceso

SubProceso cambio(vector Por Referencia, n, char, pos)
	Definir i Como Entero
	si vector(pos) <> " "
		Escribir "LA POSICIÓN SE ENCUENTRA OCUPADA"
	SiNo
		vector(pos) = char
		Escribir "- EL CARÁCTER FUE AGREGADO CORRECTAMENTE -"
		Escribir "El vector final es el siguiente: "
		Escribir ""
		para i=0 hasta n-1
			Escribir Sin Saltar "[ ",vector(i)," ] "
		FinPara
		Escribir ""
		Escribir "Donde el carácter: ", char, ", fue agregado en la posición ",pos,"."
	FinSi
FinSubProceso


	