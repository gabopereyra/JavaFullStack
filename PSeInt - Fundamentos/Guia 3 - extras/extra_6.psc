Algoritmo extra_6
    Definir Num Como Real;
    Num = 0;
    Escribir "Digite un numero";
    Leer Num;
    Escribir Sin Saltar Numeros_Impares(Num)
FinAlgoritmo

Funcion Impares <- Numeros_Impares(Num)
    Definir Conteo Como Real;
    Definir Conteo_I Como Entero;
    Conteo = 0;
    Conteo_I = 0;
    Mientras Num <> 0 Hacer
        Si Num mod 2 <> 0 Entonces
            Conteo_I = Conteo_I + 1 
        FinSi
        Num = trunc(Num / 10);
        Conteo = Conteo + 1
    FinMientras
    Si Conteo_I = Conteo Entonces
        Escribir "Todos los numeros son impares"
    SiNo
        Escribir "Todos los numeros no son impares"
    FinSi
FinFuncion



//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el 
//número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener 
//		que separar el numero en partes (si es un numero de más de un digito) y ver si cada 
//		numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No podemos 
//			pasar el numero a cadena para realizar el ejercicio