import java.util.Scanner;
// 3:02
public class App {
    public static void main(String[] args) throws Exception {

        Scanner inputKeyboard = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaxismos = 10;
        boolean isParabraAdivinado = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int index = 0; index < letrasAdivinadas.length; index++) {
            letrasAdivinadas[index] = '_';
            System.out.print(letrasAdivinadas[index]);
        }
        System.out.println();
        System.out.println(palabraSecreta);
    }
}
