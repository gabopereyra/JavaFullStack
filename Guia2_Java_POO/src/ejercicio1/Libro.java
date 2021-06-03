package ejercicio1;

import java.util.Scanner;

public class Libro {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public int ISBN;
    public String title;
    public String author;
    public int numberOfPages;

    public Libro(int ISBN, String title, String author, int numberOfPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    } //End Constructor

    public Libro() {
    } //End Constructor (empty)

    public void create() {
        System.out.println("Ingrese el ISBN:");
        ISBN = read.nextInt();
        System.out.println("Ingrese el titulo:");
        title = read.next();
        System.out.println("Ingrese el autor:");
        author = read.next();
        System.out.println("Ingrese cantidad de páginas del libro:");
        numberOfPages = read.nextInt();
        
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", title: " + title + ", author: " + author + ", pagesNumber: " + numberOfPages+".";
    } //Return information;

} //End class


/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */


/*
        public Libro(){
       System.out.println("Ingrese el ISBN");
       setISBN(read.nextInt());
       System.out.println("Ingrese titulo");
       setTitle(read.next());
       System.out.println("Ingrese el autor");
       setAuthor(read.next());
       System.out.println("Ingrese la cantidad de páginas");
       setNumberOfPages(read.nextInt());
       
       System.out.println(toString());
               
   }*/
