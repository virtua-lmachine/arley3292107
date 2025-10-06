import java.util.Scanner;

public class Saludo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora (0-23):");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("¡Buenos días!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("¡Buenas tardes!");
        } else if ((hora >= 18 && hora <= 23) || (hora < 6 && hora >= 0)) {
            System.out.println("¡Buenas noches!");
        } else {
            System.out.println("Hora no válida.");
        }
    }
}