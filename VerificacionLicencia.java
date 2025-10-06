import java.util.Scanner;

public class VerificacionLicencia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean tieneLicencia;
        boolean estaVigente;
        boolean cumpleCategoria;

        System.out.print("¿Tiene licencia de conducir? (true/false): ");
        tieneLicencia = entrada.nextBoolean();

        System.out.print("¿La licencia está vigente? (true/false): ");
        estaVigente = entrada.nextBoolean();

        System.out.print("¿Cumple con la categoría requerida? (true/false): ");
        cumpleCategoria = entrada.nextBoolean();


        if (!tieneLicencia) {
            System.out.println("No puede aplicar");
        }
        else if (!estaVigente) {
            System.out.println("No puede aplicar");
        }
        else if (!cumpleCategoria) {
            System.out.println("No puede aplicar");
        }
        else {
            System.out.println("Puede aplicar a la vacante");
        }

        entrada.close();

    }
}