/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y 
la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4;

import java.util.Scanner;

public class Rectangulo {
    Scanner read = new Scanner(System.in);
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    //getters & setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //End getters & setter

    public void create() {
        System.out.println("Ingrese el valor de la base");
        this.base=read.nextDouble();
        
        System.out.println("Ingrese el valor de la altura");
        this.altura=read.nextDouble();
    } //Punto A

    public double area() {
        double area = (base * altura);
        return area;
    }//End area (punto C)

    public double perimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }//End perimetro (punto D)

    public void draw() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1)) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == (base - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    } //End draw 

} //End public Class
