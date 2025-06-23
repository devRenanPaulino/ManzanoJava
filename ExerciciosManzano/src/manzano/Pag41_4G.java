package manzano;
import java.util.Scanner;

public class Pag41_4G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros divisíveis por 2 e 3:");

        for (int numero : numeros) {
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
