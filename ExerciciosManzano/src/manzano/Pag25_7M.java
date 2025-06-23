package manzano;
import java.util.Scanner;

public class Pag25_7M {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float valorA = escaneia.nextFloat();
		System.out.println("Digite o valor de B:");
		float valorB = escaneia.nextFloat();
		System.out.println("Digite o valor de C:");
		float valorC = escaneia.nextFloat();
		
		float soma = valorA + valorB + valorC;
		double quadrado = Math.pow(soma,2);
		
		System.out.printf("A soma é: %.2f e seu quadrado: %.2f", soma, quadrado);
		
		escaneia.close();
	}
}
