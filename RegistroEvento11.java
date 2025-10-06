import java.util.Scanner;

public class RegistroEvento11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        int cuposDisponibles;

        System.out.println("=== REGISTRO AL EVENTO ===");
        System.out.println();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese cupos disponibles: ");
        cuposDisponibles = entrada.nextInt();

        System.out.println();



        if (edad >= 18 && cuposDisponibles > 0) {

            System.out.println("✓ REGISTRO EXITOSO\n¡bienvenido al evento!");


            int cuposRestantes = cuposDisponibles - 1;
            System.out.println("Cupos restantes después de su registro: " + cuposRestantes);
        }
        else if (edad < 18 && cuposDisponibles > 0) {

            System.out.println("✗ REGISTRO DENEGADO");
            System.out.println("Lo sentimos, debe ser mayor de 18 años para registrarse.");
            System.out.println("Su edad: " + edad + " años (se requiere: más de 18 años)");
            System.out.println("pero aun tiene: " + cuposDisponibles + " cupos disponibles");
        }
        else if (edad >= 18 && cuposDisponibles <= 0) {
            System.out.println("✗ REGISTRO DENEGADO");
            System.out.println("Lo sentimos, no quedan cupos disponibles.");
            System.out.println("El evento está completamente lleno.");
        }
        else {
            System.out.println("✗ REGISTRO DENEGADO");
            System.out.println("Lo sentimos, no puede registrarse por dos razones:");
            System.out.println("1. Debe ser mayor de 18 años (su edad: " + edad + " años)");
            System.out.println("2. No quedan cupos disponibles");
        }

        entrada.close();

    }
}