Algoritmo Ejercicio_16_Extra_6_Guia_3
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
