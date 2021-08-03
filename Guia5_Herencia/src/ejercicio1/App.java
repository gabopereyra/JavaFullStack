package ejercicio1;

public class App {

    public static void main(String[] args) {

        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();

        Perro perroUno = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perroUno.alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Síanes");
        gato.alimentarse();

        Animal caballo = new Caballo("Spark", "Plato", 25, "Fino");
        caballo.alimentarse();
       
    }

}
