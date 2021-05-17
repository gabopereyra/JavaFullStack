Algoritmo extra_5
	Definir frase, vector, char Como Caracter
	Definir n, n_char, pos Como entero
	
	Escribir "Ingrese una frase cualquiera"
	Leer frase
	si Longitud(frase) > 20 Entonces
		Escribir "La frase tiene más de 20 caracteres por lo que quedará truncada ya que el vector solo almacena hasta 20 caracteres"		
	FinSi
		
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

///Subproceso para rellenar vector
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
///FIN Subproceso para rellenar vector

SubProceso cambio(vector Por Referencia, n, char, pos)
	Definir i, atras, adelante, aux Como Entero
	Definir auxiliar Como Caracter
	aux = pos //salvo el valor de la posición
	si vector(pos) <> " "
		i=pos
		adelante=pos
		atras=pos
		Mientras vector(i)<>" " y i<n-1 Hacer //identificar la posición libre más adelante
			adelante=adelante+1
			i = i+1
		FinMientras
		i=pos
		Mientras vector(i)<>" " y i>=1 Hacer //identificar la posición libre más atrás
			atras=atras-1
			i = i-1
		FinMientras
		Si vector(adelante) <> " " Entonces //VERIFICO si está ocupada
			si vector(atras) <> " " Entonces //VERIFICO si está ocupada
				Escribir "No hay posiciones disponibles en ninguna dirección"
			SiNo
				para i=atras hasta pos-1 
					vector(i) = vector(i+1)
				FinPara
				vector(pos)=char
				show(vector, n) //mostrar vector final
			FinSi
		SiNo
			si vector(atras) <> " " Entonces //VERIFICO si está ocupada				
				para i=18 hasta pos 
					vector(i+1) = vector(i)
				FinPara
				vector(pos)=char
				show(vector, n) //mostrar vector final
			SiNo
				Si adelante >= atras Entonces
					para i=adelante hasta pos+1 
						vector(i) = vector(i-1)
					FinPara
					vector(pos)=char
					show(vector, n) //mostrar vector final
				SiNo
					para i=atras hasta pos-1 
						vector(i) = vector(i+1)
					FinPara
					vector(pos)=char
					show(vector, n) //mostrar vector final
				FinSi
			FinSi
		FinSi
		
	SiNo
		vector(pos) = char
		show(vector, n) //mostrar vector final
		Escribir "Donde el carácter: ", char, ", fue agregado en la posición ",pos,"."
	FinSi
FinSubProceso

///SubProceso para mostrar vector final
SubProceso show(vector, n)
	definir i Como Entero
	Escribir "- EL CARÁCTER FUE AGREGADO CORRECTAMENTE -"
	Escribir "El vector final es el siguiente: "
	Escribir ""
	para i=0 hasta n-1
		Escribir Sin Saltar "{ ",vector(i)," } "
	FinPara
	Escribir ""
FinSubProceso
///FIN SubProceso para mostrar vector final	