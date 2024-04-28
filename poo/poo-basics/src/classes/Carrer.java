package classes;

public class Carrer {
    private String carrerName;
    private int duration;

    public Carrer(String carrerName, int duration) {
        this.carrerName = carrerName;
        this.duration = duration;
    }

    public String getCarrerName () {
        return this.carrerName;
    }

    public int getDuration (int duration) {
        return this.duration;
    }

    public void setCarrerName (String carrerName) {
        this.carrerName = carrerName;
    }

    public void setDuration (int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Carrer: {carrerName: " + this.carrerName + ", duration: " + this.duration + "}";
    }
}
