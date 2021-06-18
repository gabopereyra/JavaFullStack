package extra3;

import java.util.Scanner;

public class RaicesService {

    Scanner read = new Scanner(System.in);

    public Raices nuevaEcuacion() {
        Raices ecuacion = new Raices();
        System.out.println("Ingrese el valor del primer coeficiente (a)");
        ecuacion.setA(read.nextDouble());
        System.out.println("Ingrese el valor del primer coeficiente (b)");
        ecuacion.setB(read.nextDouble());
        System.out.println("Ingrese el valor del primer coeficiente (c)");
        ecuacion.setC(read.nextDouble());
        return ecuacion;
    } //Fin metodo de creacion

    /*Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    public double getDiscriminante(Raices ecuacion) {
        double discriminante = Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC());
        return discriminante;
    }
    //Fin metodo getDiscriminante

    /*• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices ecuacion) {
        boolean poseeRaices = false;
        if (getDiscriminante(ecuacion) > 0) {
            poseeRaices = true;
        }
        return poseeRaices;
    }
    //FIn metodo tience Raices

    /*• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    para que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz(Raices ecuacion) {
        boolean poseeRaiz = false;
        if (getDiscriminante(ecuacion) == 0) {
            poseeRaiz = true;
        }
        return poseeRaiz;
    }
    //fin metodo tieneRaiz

    /*• Método obtenerRaices(): llama a tieneRaíces() y si devolvió t́ rue, imprime las 2
    posibles soluciones.*/
    public void obtenerRaices(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            double raizUno = ((ecuacion.getB() * -1) + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double raizDos = ((ecuacion.getB() * -1) - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println("La primer raiz es: " + raizUno);
            System.out.println("La segunda raiz es: " + raizDos);
        } else {
            System.out.println("NO POSEE DOS RAICES");
        }
    }
    //Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) 
    //Fin metodo obtenerRaices()

    /*• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.*/
    public void obtenerRaiz(Raices ecuacion) {
        if (tieneRaiz(ecuacion)) {
            double raizUno = (ecuacion.getB() * -1) / (2 * ecuacion.getA());
            System.out.println("La raiz unica es: " + raizUno);
        } else {
            System.out.println("NO POSEE DOS RAICES o NO EXISTEN SUS RAICES");
        }
    }
    //Fin metodo ObtenerRaiz

    /* • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
    caso de no existir solución, se mostrará un mensaje
     */
    public void calcular(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            double raizUno = ((ecuacion.getB() * -1) + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double raizDos = ((ecuacion.getB() * -1) - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println("La primer raiz es: " + raizUno);
            System.out.println("La segunda raiz es: " + raizDos);
        } else if (tieneRaiz(ecuacion)) {
            double raizUno = (ecuacion.getB() * -1) / (2 * ecuacion.getA());
            System.out.println("La raiz unica es: " + raizUno);
        } else {
            System.out.println("El ejercicio no tiene soluciones reales");
        }
    }
    //Fin metodo calcular
} //Fin Clase
