import java.util.Scanner;

public class PrestamoBiblioteca18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de su multa pendiente (0 si no tiene): ");
        double multaPendiente = entrada.nextDouble();

        if (multaPendiente > 0) {
            System.out.println(" No se puede realizar el préstamo. Tiene una multa pendiente de $" + multaPendiente);
        } else {
            System.out.println("📘 Préstamo permitido por 7 días.");
        }

        entrada.close();
    }
}
