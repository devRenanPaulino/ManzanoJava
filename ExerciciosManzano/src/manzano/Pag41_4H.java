package manzano;
import java.util.Scanner;
import java.util.Arrays;

public class Pag41_4H {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
        int A = escaneia.nextInt();
        System.out.println("Digite o valor de B:");
        int B = escaneia.nextInt();
        System.out.println("Digite o valor de C:");
        int C = escaneia.nextInt();
        System.out.println("Digite o valor de D:");
        int D = escaneia.nextInt();
        System.out.println("Digite o valor de E:");
        int E = escaneia.nextInt();
        
        int[] numeros = {A, B, C, D, E};
        
        Arrays.sort(numeros);
        
        System.out.printf("O menor número é %d e o maior %d", numeros[0], numeros[4]);

	}
}
