import java.util.Scanner;

public class RecomendacionClima14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String clima;


        System.out.println("---SISTEMA DE RECOMENDACIÓN POR CLIMA---");

        System.out.println();

        System.out.println("Por favor, indique el clima actual:");
        System.out.print("(lluvia/soleado/nublado): ");


        clima = entrada.nextLine();

        System.out.println();

        if (clima.equals("lluvia")) {

            System.out.println(" CLIMA DETECTADO: Lluvia");
            System.out.println();
            System.out.println(" RECOMENDACIÓN: Lleva un paraguas");
            System.out.println();

        }
        // SEGUNDA CONDICIÓN: Verificar si está soleado
        // Esta condición solo se evalúa si la primera fue falsa
        // Si clima no era "lluvia", entonces Java verifica si es "soleado"
        else if (clima.equals("soleado")) {
            // Este bloque se ejecuta SOLO si clima es exactamente "soleado"
            // Para días soleados, la protección solar es prioritaria

            System.out.println("☀ CLIMA DETECTADO: Soleado");
            System.out.println();
            System.out.println(" RECOMENDACIÓN: Usa bloqueador solar");
            System.out.println();
        }
        else if (clima.equals("nublado")) {

            System.out.println("☁ CLIMA DETECTADO: Nublado");
            System.out.println();
            System.out.println(" RECOMENDACIÓN: Lleva una chaqueta ligera");
            System.out.println();

        }

            System.out.println(" CLIMA NO RECONOCIDO");

            System.out.println();
            System.out.println("Lo sentimos, no reconocemos el clima: \"" + clima + "\"");

        entrada.close();
        }



    }