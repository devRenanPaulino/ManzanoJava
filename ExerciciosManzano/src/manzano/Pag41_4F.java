package manzano;
import java.util.Scanner;
import java.util.Arrays;
	
public class Pag41_4F {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = escaneia.nextInt();

        System.out.println("Digite o valor de B:");
        int B = escaneia.nextInt();

        System.out.println("Digite o valor de C:");
        int C = escaneia.nextInt();

        int[] numeros = {A, B, C};

        Arrays.sort(numeros);

        System.out.printf("Ordem crescente: %d, %d, %d%n", numeros[0], numeros[1], numeros[2]);

        escaneia.close();
    }

}
