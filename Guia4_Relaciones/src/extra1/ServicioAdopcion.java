package extra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAdopcion {

    private final Scanner read = new Scanner(System.in);
    private final List<Persona> personas = new ArrayList();
    private final List<Perro> perros = new ArrayList();

    private final PersonaService serv = new PersonaService();
    private final PerroService servPerro = new PerroService();

    public void iniciarServicio() {
        crearPersonas();
        crearMascotas();
        adoptar();
    }

    private boolean menu() {
        System.out.println("Desea cargar un nuevo dato? (S/N)");
        String ans = read.next().toUpperCase();
        while (!ans.equals("S") && !ans.equals("N")) {
            System.out.println("La rta es incorrecta, intente nuevamente");
            ans = read.next().toUpperCase();
        }
        return ans.equals("S");
    } //pregunta 

    private void crearPersonas() {
        boolean ans = true;
        while (ans) {
            personas.add(serv.crearPersona());
            ans = menu();
        }
    } //Fin crear personas

    private void crearMascotas() {
        boolean ans = true;
        while (ans) {
            perros.add(servPerro.crearPerro());
            ans = menu();
        }
    } //Fin crear personas

    private void adoptar() {
        for (Persona persona : personas) {
            System.out.println("Estimado/a: " + persona.getName() + ", indique el nombre de la mascota que desea adoptar:");
            String nombre = read.next();
            for (Perro perro : perros) {
                boolean exist = false;
                if (perro.getName().equals(nombre)) {
                    exist = true;
                    if (perro.isIsAdoptado()) {
                        System.out.println("Lo sentimos el perro ya fue adoptado.");
                        break;
                    } else {
                        System.out.println("Felicitaciones! has adoptado a "+nombre);
                        perro.setIsAdoptado(true);
                        persona.setDog(perro);
                        break;
                    }
                } //Fin for perro
                if (!exist) {
                    System.out.println("El perro indicado no forma parte de la lista");
                }
            }
        }

    }

}
