Algoritmo ejercicio_23
	Definir vendedores, inicio, i Como Entero
	Definir sueldo, ventas, sueldo_total, comisiones_total, valor_venta, total_ventas_vendedor, total_total Como Real
	inicio = 0
	Escribir "Ingrese la cantidad de vendedores"
	Leer vendedores
		
	Repetir
		
		Escribir "Ingrese el sueldo"
		Leer sueldo
		Escribir "ingrese ventas"
		Leer ventas
		total_ventas_vendedor = 0
		
		Para i=1 Hasta ventas Hacer
			Escribir "Ingrese valor venta"
			Leer valor_venta
			total_ventas_vendedor = total_ventas_vendedor + valor_venta
		Fin Para
		
		Escribir "A pagar vendedor: ", sueldo+(total_ventas_vendedor*0.1)
		//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por 
		//cada venta
		inicio = inicio +1
		
	Mientras Que inicio<vendedores
	
FinAlgoritmo


//. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza 
// múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor 
// recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la 
// compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada 
// vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto 
// deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por 
//cada venta.
