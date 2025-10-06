import java.util.Scanner;
public class ControlDeAcceso {
    public static void main(String[] args) {
        String claveCorrecta = "secreto123";
        String claveIngresada;

        System.out.println("Ingresa la contraseña: ");
        Scanner scanner = new Scanner(System.in);
        claveIngresada = scanner.nextLine();

        if (claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        scanner.close();
    }
}
