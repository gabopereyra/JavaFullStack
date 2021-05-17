Algoritmo extra_29_AJENO
	Escribir "Mostramos los primeros 4 numeros céntricos:"
	Escribir ""
	
	Definir cantCentroNumEncontrados, i Como Entero
	definir m Como Real
	i = 1
	cantCentroNumEncontrados = 0
	
	Mientras cantCentroNumEncontrados < 4 Hacer
		i = i + 1
		m = rc((i*i + i)/2)

		si (trunc(m) = m) Entonces
			cantCentroNumEncontrados = cantCentroNumEncontrados + 1
			Escribir "Centro numérico: ", m
		FinSi
	Fin Mientras
	
FinAlgoritmo

