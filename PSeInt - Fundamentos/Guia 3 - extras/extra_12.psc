Algoritmo extra_12
	Definir letra Como Caracter
	leer letra
	pos(letra)
FinAlgoritmo
SubProceso pos(letra)
	Mientras Longitud(letra)>1 Hacer
		Escribir "Se ingresó un texto de más de 1 caracter, intente nuevamente"
		Leer letra
	FinMientras
	si letra > "M" y letra < "T" Entonces
		Escribir "Se encuentra en el intervalo del código ASCii (entre M y T)"
	SiNo
		Escribir "Se encuentra fuera del intervalo del código ASCii (entre M y T)"
	FinSi
FinSubProceso
// Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta 
//entre las letras “M” y “T”. Recordar que Pseint le da un valor numérico a cada letra a 
//través del Código Ascii.