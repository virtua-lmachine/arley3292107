import java.util.Scanner;

public class BateriaDispositivo17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el porcentaje de batería (0 a 100): ");
        int bateria = entrada.nextInt();

        // Verificamos los diferentes rangos de batería
        if (bateria < 20) {
            System.out.println(" Batería baja. Sugerencia: Cargar el dispositivo.");
        } else if (bateria <= 80) {
            System.out.println("Batería suficiente.");
        } else {
            System.out.println(" Nivel alto de batería.");
        }

        entrada.close();
    }
}
