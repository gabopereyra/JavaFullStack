package extra2;

/**
 * Para las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo. Realizar un
 * programa en el que se representen todas las relaciones descriptas.
 */
public class Residencia extends ExtraHotelero {

    private Integer cantHabitaciones;
    private boolean hayDescuentoGremios;
    private boolean hayCampoDeportivo;

    public Residencia() {

    }

    public Residencia(Integer cantHabitaciones, boolean hayDescuentoGremios, boolean hayCampoDeportivo, boolean esPrivado, Double areaOcupada, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, areaOcupada, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.hayDescuentoGremios = hayDescuentoGremios;
        this.hayCampoDeportivo = hayCampoDeportivo;
    }

}
