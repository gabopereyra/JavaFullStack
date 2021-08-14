/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
 *
 * @author Gabriel
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HotelCuatroEstrellas cuatro = new HotelCuatroEstrellas(10, 10, 10, "Gabo", 'A', 20, "Gabe", "9 de julio 900", "Rosario", "yo");
        HotelCincoEstrellas cinco = new HotelCincoEstrellas(1, 1, 1, 10, 10, 10, "Gabo", 'A', 20, "Gabe", "9 de julio 900", "Rosario", "yo");

        System.out.println("4 estrellas " + cuatro.precioHabitacion());
        System.out.println("5 estrellas " + cinco.precioHabitacion());

    }

}
