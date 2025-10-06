import java.util.Scanner;

public class ModeracionChat19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba su mensaje: ");
        String mensaje = entrada.nextLine();

        // Verificar si el mensaje contiene la palabra "spoiler"
        // Usamos toLowerCase() para evitar errores si escriben "Spoiler", "SPOILER", etc.
        if (mensaje.toLowerCase().contains("spoiler")) {
            System.out.println(" Advertencia: su mensaje contiene spoilers. Revíselo antes de enviarlo.");
        } else {
            System.out.println(" Mensaje publicado correctamente: " + mensaje);
        }

        entrada.close();
    }
}
