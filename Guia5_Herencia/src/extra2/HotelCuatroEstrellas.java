/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
 * Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de
 * Habitaciones
 */
public class HotelCuatroEstrellas extends Alojamiento {

    private Integer cantidadHabitaciones;
    private Integer cantidadCamas;
    private Integer cantidadPisos;
    private Double precioHabitaciones;
    private char tipoGimnasio;
    private String nombreRestaurante;
    private Integer capacidadRestaurante;

    public HotelCuatroEstrellas(Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, String nombreRestaurante, char tipoGimnasio, Integer capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;

    }

    public HotelCuatroEstrellas() {

    }

    protected Double precioHabitacion() {
        Double precio = (50+capacidadHotel()+agregadoRestaurante()+agregadoGimnasio());
        this.precioHabitaciones = precio;
        return precio;
    }

    private Double capacidadHotel() {
        return (double) 1 * this.cantidadCamas;
    }

    private Double agregadoRestaurante() {
        if (this.capacidadRestaurante < 30) {
            return 10d;
        } else if (this.capacidadRestaurante < 50) {
            return 30d;
        } else {
            return 50d;
        }
    }

    private Double agregadoGimnasio() {
        if (this.tipoGimnasio == 'A') {
            return 50d;
        } else {
            return 30d;
        }
    }
    
        
    public double getPrecio(){
        return precioHabitaciones;
    }

    
    /*El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas). */
}
