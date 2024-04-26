import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inputKeyboard = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean isParabraAdivinado = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int index = 0; index < letrasAdivinadas.length; index++) {
            letrasAdivinadas[index] = '_';
            System.out.print(letrasAdivinadas[index]);
        }

        // System.out.println();
        // System.out.println(palabraSecreta);
        while (!isParabraAdivinado && intentos < intentosMaximos) {
            System.out.println("Palabra a adividar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " Letras!)");
            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(inputKeyboard.next().charAt(0));
            boolean letracorrecta = false;
            for (int i=0; i <palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letracorrecta = true;
                }
            }

            if (!letracorrecta) {
                intentos++;
                System.out.println("Letra incorrecta, te quedan: " + (intentosMaximos - intentos));
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                isParabraAdivinado = true;
                System.out.println("Felicidades!, haz adivinado la palabra " + palabraSecreta);
            }
        }

        if (!isParabraAdivinado) {
            System.out.println("Que pena, te haz quedado sin intentos!!!");
        }
        inputKeyboard.close();
    }
}
