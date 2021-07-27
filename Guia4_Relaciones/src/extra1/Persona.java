package extra1;

public class Persona {

    private String name;
    private String surname;
    private Integer age;
    private Long document;
    private Perro dog;

    public Persona(String name, String surname, Integer age, Long document) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.document = document;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona: "+ name + " " + surname + ", de edad: " + age + ", documento: " + document + ", su perro es: " + dog;
    }
    
}
