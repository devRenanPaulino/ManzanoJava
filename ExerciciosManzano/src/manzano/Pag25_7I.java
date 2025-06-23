package manzano;
import java.util.Scanner;

public class Pag25_7I {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("O Quadrado da diferença de A e B");
		System.out.println("Digite o valor de A:");
		float valorA = escaneia.nextFloat();
		System.out.println("Digite o valor de B: ");
		float valorB = escaneia.nextFloat();
		
		float diferenca = valorA - valorB;
		double quadrado = Math.pow(diferenca, 2);
		
		System.out.printf("A diferença dos valores %.2f e %.2f na ordem digitada é: %.2f %nO quadrado da %.2f é: %.2f", valorA, valorB, diferenca, diferenca, quadrado);
		
		escaneia.close();
	}
}
