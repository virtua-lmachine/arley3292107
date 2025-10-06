import java.util.Scanner;

public class PoliticaPetFriendly16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Trae mascota? (si/no): ");
        String respuesta = entrada.nextLine();

        if (respuesta.equals("si")) {
            System.out.print("¿Qué tipo de mascota trae?: ");
            String tipo = entrada.nextLine();

            if (tipo.equals("perro")) {
                System.out.println("Hay parque canino disponible.");
            } else {
                System.out.println(" Bienvenido con su mascota (zona común).");
            }

        } else {
            System.out.println(" Sin restricciones, disfrute su estancia.");
        }

        entrada.close();
    }
}
