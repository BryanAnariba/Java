public class App {
    public static void main(String[] args) throws Exception {

        int contador = 1;
        do {
            System.out.println("Counter value: " + contador);
            contador++;
        } while (contador <= 10);
        System.out.println("Outside the bucle");

        for (int i = 1; i <= 10; i++) {
            System.out.println("For i: " + i);
            if (i==5) {
                // break; // Nos saca del bucle
                // continue; // Salta la iteracion
                return; // Nos saca del bucle
            }
            System.out.println("For i: " + i);
        }
    }
}
