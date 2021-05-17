Algoritmo Ejercicio_24_Extra_14_Guia_3
	///	Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha
	///	anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba
	///	una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha
	///	anterior. Puede asumir que dia, mes y anio representan una fecha válida. Realice
	///	pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3,
	///	anio=2004.
	Definir Dia Como Entero;
	Definir Mes Como Entero;
	Definir Anio Como Entero;
	
	Dia = 0;
	Mes = 0;
	Anio = 0;
	
	Escribir "Digite la fecha ( DD / MM / AAAA )"
	Leer Dia, Mes, Anio;
	
	Si Dia >= 1 & Dia <= 31 & Mes <= 12 & Mes >= 1 Entonces
		DiaAnterior(Dia, Mes, Anio);
	SiNo
		Escribir "La fecha ingresada no es valida";
	FinSi
	
FinAlgoritmo

SubProceso DiaAnterior(Dia, Mes, Anio)
	
	Si Dia > 1 & Dia < 31 & Mes < 12 & Mes > 1 Entonces
		Dia = Dia - 1
		Mes = Mes - 1
		Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
	FinSi
	
	Si Dia = 1 & ( Mes = 2 | Mes = 4 | Mes = 6 | Mes = 9 | Mes = 11) Entonces
		Dia = 31
		Mes = Mes - 1
		Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
	SiNo
		Si Dia = 1 & ( Mes = 1 | Mes = 5 | Mes = 7 | Mes = 8 | Mes = 10 | Mes = 12) Entonces
			Dia = 30
			Si Mes = 1 Entonces
				Mes = 12
				Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
			SiNo
				Mes = Mes - 1
				Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
			FinSi
		SiNo
			Si (Anio mod 4 = 0 & Anio mod 100 <> 0) | (Anio mod 100 = 0 & Anio mod 400 = 0) Entonces
				Si Dia = 1 & Mes = 3 Entonces
					Dia = 29
					Mes = Mes - 1
					Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
				FinSi
			SiNo
				Si Dia = 1 & Mes = 3 Entonces
					Dia = 28
					Mes = Mes - 1
					Escribir "La fecha es: ", Dia, " / ", Mes, " / ", Anio;
				FinSi
			FinSi
		FinSi
	FinSi
FinSubProceso
