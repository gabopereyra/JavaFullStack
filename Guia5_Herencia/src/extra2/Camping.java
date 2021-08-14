package extra2;

/**
Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones
 */
public class Camping extends ExtraHotelero{
    private Integer cantidadMaxCarpas;
    private Integer banios;
    private boolean hayRestaurante;

    public Camping(Integer cantidadMaxCarpas, Integer banios, boolean hayRestaurante, boolean esPrivado, Double areaOcupada, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, areaOcupada, nombre, direccion, localidad, gerente);
        this.cantidadMaxCarpas = cantidadMaxCarpas;
        this.banios = banios;
        this.hayRestaurante = hayRestaurante;
    }
    public Camping(){
        
    }
}
