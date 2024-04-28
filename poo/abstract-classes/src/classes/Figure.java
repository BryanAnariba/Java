package classes;

public abstract class Figure {
    // Son similares a la interfaces, pones lo que ocupa requeridamente una clase que herede de esta
    public abstract double getFigureArea();
    public void printFigureData() {
        System.out.println("Print data from Figure.java");
    }
}
