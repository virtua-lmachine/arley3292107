import java.util.Scanner;
public class EnvioGratis {
    public static void main(String[] args) {
        boolean esPremium;
        double monto;
        monto = 50;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tienes membresia premium? (true/false): ");
        esPremium = scanner.nextBoolean();
        System.out.println("Monto de la compra: ");
        monto = scanner.nextDouble();

        if (esPremium ||(monto <= 50)) {
            System.out.println("Envio gratis");
        }else {
            System.out.println("Envio con costo");
        }
    }
}
