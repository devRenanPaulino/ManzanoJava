package manzano;
import java.util.Scanner;

public class Pag25_7L {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float valorA = escaneia.nextFloat();
		System.out.println("Digite o valor de B:");
		float valorB = escaneia.nextFloat();
		System.out.println("Digite o valor de C:");
		float valorC = escaneia.nextFloat();
		
		float soma = (valorA * valorA) + (valorB * valorB) + (valorC * valorC);
		
		System.out.printf("A soma dos quadrados é %.2f", soma);
		
		escaneia.close();
	}
}
