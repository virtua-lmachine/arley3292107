import java.util.Scanner;

public class BloqueoIntentos13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int intentosFallidos;

        System.out.println("=== SISTEMA DE SEGURIDAD ===");
        System.out.println();


        System.out.print("Ingrese el número de intentos fallidos: ");
        intentosFallidos = entrada.nextInt();

        System.out.println();



        if (intentosFallidos >= 3) {
            System.out.println("🔒 CUENTA BLOQUEADA");
            System.out.println();
            System.out.println("Su cuenta ha sido bloqueada por seguridad.");
            System.out.println("Razón: Ha excedido el número máximo de intentos permitidos.");
            System.out.println("Intentos fallidos registrados: " + intentosFallidos);
            System.out.println();

        }
        else {
            System.out.println("✓ CUENTA ACTIVA");
            System.out.println();
            System.out.println("Puedes volver a intentar.");
            System.out.println("Intentos fallidos hasta ahora: " + intentosFallidos + " de 3");

            int intentosRestantes = 3 - intentosFallidos;
            System.out.println("Intentos restantes antes del bloqueo: " + intentosRestantes);

            if (intentosFallidos == 2) {
                System.out.println();
                System.out.println("⚠️ ADVERTENCIA: Este es su último intento antes del bloqueo.");
                System.out.println("Por favor, verifique cuidadosamente sus credenciales.");
            }
        }

        entrada.close();

    }
}