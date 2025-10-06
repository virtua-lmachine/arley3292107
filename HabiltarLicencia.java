import java.util.Scanner;

public class HabiltarLicencia {
    public static void main(String[] args) {

        int edad;
        boolean aproboExamen;

        Scanner scanner = new Scanner(System.in);
        System.out.println("edad");
        edad = scanner.nextInt();

        System.out.println("aprobo examen teorico? (true/false): ");
        aproboExamen = scanner.nextBoolean();

        if ( edad >= 16 && aproboExamen) {
            System.out.println("Licencia habilitada");
        }else {
            System.out.println("no cumple los requisitos");
        }
    }
}
