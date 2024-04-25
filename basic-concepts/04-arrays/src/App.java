public class App {
    public static void main(String[] args) throws Exception {

        int[] numbers = new int[10];
        char[] letras = new char[5];

        letras[0] = 'A';
        letras[1] = 'E';
        letras[2] = 'I';
        letras[3] = 'O';
        letras[4] = 'U';

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[3] = 40;
        numbers[4] = 50;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (char letra: letras) {
            System.out.println("Letra: " + letra);
        }
    }
}
