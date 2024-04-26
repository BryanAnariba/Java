package classes;

public class Carrer {
    private String name;
    private int duration;

    public Carrer(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Carrer: {name: " + this.name + ", duration: " + this.duration + "}";
    }
}
