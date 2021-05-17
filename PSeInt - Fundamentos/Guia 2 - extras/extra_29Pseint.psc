Algoritmo Extra_29
	Definir add, centros, add_2, first, centro, i Como Entero;
	Definir string Como Caracter;
	
	centros = 0;
	centro = 0;
	string = '';
	
	Mientras centros < 4 hacer
		add = 0;
		add_2 = 0;
		centro = centro + 1;
		first = centro + 1;
		
		si centro > 1 Entonces
			Para i = centro - 1 Hasta  0 Con Paso -1 Hacer
				add = add + i;
			FinPara
			
			Mientras add_2 < add Hacer
				add_2 = first + add_2;
				
				si add_2 = add Entonces
					centros = centros + 1;
					string = string + ConvertirATexto(centro) + ', ';
				SiNo
					first = first + 1;
				FinSi
			FinMientras
		FinSi
	FinMientras
	
	Escribir  'Los primeros 4 centros númericos son: ', string;
FinAlgoritmo
