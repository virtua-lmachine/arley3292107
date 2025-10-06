

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        int n;
        System.out.println("Ingresa numero entero");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("este numero es par");
        }
        else {
            System.out.println("este numero no es par");
        }
    }

}
