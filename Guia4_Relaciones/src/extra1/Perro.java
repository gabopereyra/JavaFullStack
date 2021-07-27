package extra1;

public class Perro {

    private String name;
    private Integer age;
    private String race;
    private String size;
    private boolean isAdoptado = false;

    public Perro(String name, Integer age, String race, String size) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.size = size;
    }

    public Perro() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name + ", de edad: " + age + ", raza: " + race + ", donde su tamaño es: " + size + '.';
    }

    public boolean isIsAdoptado() {
        return isAdoptado;
    }

    public void setIsAdoptado(boolean isAdoptado) {
        this.isAdoptado = isAdoptado;
    }

    
    
}
