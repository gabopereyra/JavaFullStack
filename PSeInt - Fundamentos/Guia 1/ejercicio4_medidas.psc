Algoritmo metros
	Definir metros_ Como Real
	Definir cm Como Real
	Definir mm Como Real
	definir pulg Como Real
	Escribir "Ingrese la cantidad de metros"
	Leer metros_
	Si metros_ <= 0 Entonces
		Escribir "Debe cargar un valor mayor a cero"
	SiNo
		cm = metros_*100
		mm = cm*10
		pulg = mm/25.4
		Escribir "Las medidas obtenidas son:"
		Escribir "En centimetros: ", cm," cm"
		Escribir "En milimetros: ", mm," mm"
		Escribir "En pulgadas: ", pulg," pulgadas"
	Fin Si

FinAlgoritmo
