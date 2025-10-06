import java.util.Scanner;

public class SemaforoPeatonal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String color;

        System.out.print("Color del semáforo (rojo/amarillo/verde): ");
        color = entrada.nextLine();


        if (color.equals("rojo")) {
            System.out.println("Detente.");
        }
        else if (color.equals("amarillo")) {
            System.out.println("Precaución.");
        }
        else if (color.equals("verde")) {
            System.out.println("Avanza.");
        }
        else {
            System.out.println("Color no reconocido.");
        }

        entrada.close();

    }
}