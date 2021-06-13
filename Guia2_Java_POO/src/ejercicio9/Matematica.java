/*
Realizar una clase llamada Matemática que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase 
deber tener un constructor vacío, parametrizado y get y set.
 */
package ejercicio9;

public class Matematica {
    private double numeroUno;
    private double numeroDos;
    
    //CONSTRUCTORS
    public Matematica(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public Matematica() {
    }
    //CONSTRUCTORS
    
    //SETTER && GETTERS

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    //end SEETER && GETTERS    
}
