/*
 . En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
 */
package ejercicio4;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private long document;
    private LocalDate fechaInicioAlquiler;
    private LocalDate fechaFinAlquiler;
    private int posicion;
    private Barco barco;

    public Alquiler(String nombre, long document, LocalDate fechaInicioAlquiler, LocalDate fechaFinAlquiler, int posicion, Barco barco) {
        this.nombre = nombre;
        this.document = document;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
        this.posicion = posicion;
        this.barco = barco;
    }

    public Alquiler() {

    }

    public double calcularAlquiler() {
        return redondeoFinal();
    }

    private double obtenerDias() {
        int diasTotales = (int) ChronoUnit.DAYS.between(fechaInicioAlquiler, fechaFinAlquiler);
        return (double) diasTotales;
    }

    private double obtenerModulo(){
        return barco.calcularModulo();
    }
    
    private double redondeoFinal(){
        return Math.round((obtenerModulo() * obtenerDias())*100.0)/100.0;
    }
    
}
