/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro
 */
package ejercicio2;

import java.util.Scanner;

public class Electrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    invocar al crear el objeto y no será visible.*/
    private char comprobarConsumoEnergetico(char letra) {
        for (ConsumoEnergetico letter : ConsumoEnergetico.values()) {
            if (letter.toString().charAt(0) == letra) {
                return letra;
            }
        }
        return 'F';
    } //fin comprobar Consumo

    /* Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    está en mayúsculas o en minúsculas. Este método se invocará al crear el
    objeto y no será visible.*/
    private String comprobarColor(String color) {
        for (Colores colour : Colores.values()) {
            if (colour.toString().equals(color)) {
                return color;
            }
        }
        return "BLANCO";
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000*/
    public void crearElectrodomestico() {
        System.out.println("Ingrese el color del equipo:");
        String color = comprobarColor(read.nextLine().toUpperCase());

        System.out.println("Ingrese el peso del equipo:");
        Double peso = read.nextDouble();

        System.out.println("Ingrese la eficiencia del equipo (A a F):");
        char eficiencia = comprobarConsumoEnergetico(read.next().toUpperCase().charAt(0));

        this.color = color;
        this.consumoEnergetico = eficiencia;
        this.peso = peso;
        this.precio = precioFinal();
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios:*/
    public double precioFinal() {
        double precio = 1000.0;
        if (this.peso < 20.0) {
            precio += 100.0;
        } else if (this.peso < 50.0) {
            precio += 500.0;
        } else if (this.peso < 80.0) {
            precio += 800.0;
        } else {
            precio = precio + 1000.0;
        }     

        switch (this.consumoEnergetico) {
            case 'A':
                precio += ConsumoEnergetico.A.getPrecio();
                break;
            case 'B':
                precio += ConsumoEnergetico.B.getPrecio();
                break;
            case 'C':
                precio += ConsumoEnergetico.C.getPrecio();
                break;
            case 'D':
                precio += ConsumoEnergetico.D.getPrecio();
                break;
            case 'E':
                precio += ConsumoEnergetico.E.getPrecio();
                break;
            default:
                precio += ConsumoEnergetico.F.getPrecio();
                break;
        }

        return precio;
    }

    
        @Override
    public String toString() {
        return "COLOR" + this.color + " PRECIO" + this.precio + " eficiencia" + this.consumoEnergetico + " peso " + this.peso + " ";
    } //borrar luego
}
