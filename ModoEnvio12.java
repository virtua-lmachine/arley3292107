import java.util.Scanner;

public class ModoEnvio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String modoEnvio;
        double saldoUsuario;
        double costoExtra;

        System.out.println("=== SISTEMA DE ENVÍO ===");
        System.out.println();

        System.out.print("Ingrese su saldo disponible: $");
        saldoUsuario = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Ingrese el costo extra del envío express: $");
        costoExtra = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("¿Qué modo de envío desea? (express/estandar): ");
        modoEnvio = entrada.nextLine();


        System.out.println();


        if (modoEnvio.equals("express")) {

            if (saldoUsuario >= costoExtra) {
                System.out.println("✓ ENVÍO CONFIRMADO");
                System.out.println("Modo de envío: EXPRESS");
                System.out.println("Costo del envío express: $" + costoExtra);

                double saldoRestante = saldoUsuario - costoExtra;
                System.out.println("Saldo después del envío: $" + saldoRestante);
                System.out.println();
                System.out.println("Su pedido llegará en 1-2 días hábiles.");
            }
            else {
                System.out.println("⚠ SALDO INSUFICIENTE PARA ENVÍO EXPRESS");
                System.out.println("Su saldo actual: $" + saldoUsuario);
                System.out.println("Costo del envío express: $" + costoExtra);

                // Calcular cuánto dinero le falta para poder usar express
                double faltante = costoExtra - saldoUsuario;
                System.out.println("Le faltan: $" + faltante);
                System.out.println();
                System.out.println("→ SUGERENCIA: Le recomendamos el envío estándar (sin costo extra)");
                System.out.println("El envío estándar llegará en 5-7 días hábiles.");
            }
        }
        else if (modoEnvio.equals("estandar")) {
            System.out.println("✓ ENVÍO CONFIRMADO");
            System.out.println("Modo de envío: ESTÁNDAR");
            System.out.println("Costo del envío: $0.00 (incluido)");
            System.out.println("Su saldo permanece igual: $" + saldoUsuario);
            System.out.println();
            System.out.println("Su pedido llegará en 5-7 días hábiles.");
        }
        else {
            System.out.println("✗ ERROR");
            System.out.println("Modo de envío no reconocido: '" + modoEnvio + "'");
            System.out.println("Por favor, elija 'express' o 'estandar'.");
        }

        entrada.close();

    }
}