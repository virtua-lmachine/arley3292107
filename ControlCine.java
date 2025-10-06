import java.util.Scanner;

public class ControlCine {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Edad del espectador: ");
        edad = entrada.nextInt();


        if (edad >= 13) {

            System.out.println("Puedes entrar a la película para mayores de 13.");
        } else {

            System.out.println("No puedes entrar; elige una apta para tu edad.");
        }

        entrada.close();

    }
}