/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

public class ExtraHotelero extends Alojamiento {

    private boolean esPrivado;
    private Double areaOcupada;

    public ExtraHotelero(boolean esPrivado, Double areaOcupada, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.areaOcupada = areaOcupada;
    }

    public ExtraHotelero() {

    }

}
