import classes.Circle;
import classes.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circleOne = new Circle(10);
        Rectangle rectangleOne = new Rectangle(8, 6);

        System.out.println("Circle Area: " + circleOne.getFigureArea() + ", Rectangle Area: " + rectangleOne.getFigureArea());
        circleOne.printFigureData();
        rectangleOne.printFigureData();
    }
}
