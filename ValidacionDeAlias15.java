import java.util.Scanner;

public class ValidacionDeAlias15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su alias (por ejemplo: @usuario): ");
        String alias = entrada.nextLine();

        if (alias.startsWith("@")) {

            // Verificar la longitud del alias
            // length() devuelve el número de caracteres que tiene la cadena
            int longitud = alias.length();

            if (longitud >= 5 && longitud <= 15) {
                System.out.println(" Alias aceptado: " + alias);
            } else {
                System.out.println(" Alias inválido. Debe tener entre 4 y 15 caracteres.");
            }

        } else {
            System.out.println(" Alias inválido. Debe comenzar con '@'.");
        }

        entrada.close();
    }
}
