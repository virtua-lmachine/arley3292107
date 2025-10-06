import java.util.Scanner;
public class Descuento4 {
    public static void main(String[] args) {
        boolean esVIP = false;
        boolean tieneCupon = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("eres VIP (true/false): ");
        esVIP = sc.nextBoolean();
        System.out.println("tienes cupon (true/false): ");
        tieneCupon = sc.nextBoolean();
        if (esVIP || tieneCupon) {
            System.out.println("se aplica descuento");
        } else {
            System.out.println("precio regular");
            
        }
    }
}
