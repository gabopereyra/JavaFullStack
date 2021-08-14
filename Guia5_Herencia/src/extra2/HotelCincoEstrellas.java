/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

public class HotelCincoEstrellas extends HotelCuatroEstrellas {
    private Integer cantidadSalonesConferencia;
     private Integer cantidadSuites;
     private Integer cantidadLimosinas;

    public HotelCincoEstrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, String nombreRestaurante, char tipoGimnasio, Integer capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, nombreRestaurante, tipoGimnasio, capacidadRestaurante, nombre, direccion, localidad, gerente);
       
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        
    }

    public HotelCincoEstrellas() {
    }
    
    @Override
    protected Double precioHabitacion() {
        return super.precioHabitacion()+agregadoLimosina();
    }
    
    private Double agregadoLimosina(){
        return (double) 15*this.cantidadLimosinas;
    }

}
/*Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas*/