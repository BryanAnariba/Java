import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int option = 0;
        Scanner inputData = new Scanner(System.in);

        //* If
        int edad = 19;
        if (edad > 18) {
            System.out.println("Puedes Entrar a la Disco");
        } else if (edad == 18) { 
            System.out.println("Tienes la edad justa para entrar a la Disco");
        } else {
            System.out.println("No puedes entrar a la Disco");
        }

        //* Switch
        System.out.println("Welcome to spended machine of drinks: ");
        System.out.println("Select your drink: ");
        System.out.println("1. Coffee: ");
        System.out.println("2. Tea: ");
        System.out.println("3. Gaseosa: ");
        System.out.println("3. Wine: ");
        System.out.println("Select your favorite drink: ");
        option = inputData.nextInt();

        switch (option) {
            case 1:
                System.out.println("Good choice, with sweet bread!");        
            break;
            case 2:
                System.out.println("Great, but do not drink a lot because is danger!");
            case 3:
                System.out.println("Best choice!");
            break;
            case 4:
                System.out.println("You are bolo!");
            break;
            default:
                System.out.println("Drink not found yet");
            break;
        }

        if (option >= 1 && option <= 4) {
            System.out.println("Enjoy your drink!!!");
        }
        inputData.close();
    }
}
