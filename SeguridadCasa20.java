import java.util.Scanner;

public class SeguridadCasa20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Es de noche? (true/false): ");
        boolean esDeNoche = entrada.nextBoolean();

        System.out.print("¿La puerta está abierta? (true/false): ");
        boolean puertaAbierta = entrada.nextBoolean();

        if (esDeNoche && puertaAbierta) {
            System.out.println(" Asegura la puerta.");
        } else {
            System.out.println(" Todo en orden.");
        }

        entrada.close();
    }
}
