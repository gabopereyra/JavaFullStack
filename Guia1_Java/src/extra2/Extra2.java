/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package extra2;

public class Extra2 {

    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8;
        int aux;
        System.out.println("Los valores originales son:\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("los valores luego de la transformación son:\nA: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
    }

}
