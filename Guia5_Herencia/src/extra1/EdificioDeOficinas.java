package extra1;

public class EdificioDeOficinas extends Edificio {

    private Integer numeroOficinas;
    private Integer personasPorOficina;
    private Integer numeroPisos;

    public EdificioDeOficinas(Integer numeroOficinas, Integer personasPorOficina, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroOficinas;
    }

    public EdificioDeOficinas() {

    }

    @Override
    public Double calcularSuperficie() {
        return getAncho() * getLargo() * (double) this.numeroPisos;
    }

    @Override
    public Double calcularVolumen() {
        return getAncho() * getLargo() * getAlto();
    }
    
    public void cantPersonas(){
        System.out.println("Cantidad de personas en total: "+(this.personasPorOficina*this.numeroOficinas));
        System.out.println("Cantidad de personas por oficina: "+personasPorOficina()+"\n");
    }

    public Integer personasPorOficina() {
        return personasPorOficina;
    }
    
}

/**
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio.
* el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio
 */
