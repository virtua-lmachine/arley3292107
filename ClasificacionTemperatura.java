import java.util.Scanner;

public class ClasificacionTemperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temp;

        System.out.print("Temperatura en °C: ");
        temp = entrada.nextDouble();


        if (temp < 10) {
            System.out.println("Frío");
        }
        else if (temp <= 25) {
            System.out.println("Agradable");
        }
        else {
            System.out.println("Caluroso");
        }

        entrada.close();

    }
}