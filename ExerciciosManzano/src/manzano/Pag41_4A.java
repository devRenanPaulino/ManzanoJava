package manzano;
import java.util.Scanner;

public class Pag41_4A {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
			System.out.println("Digite o valor de A:");
			float valorA = escaneia.nextFloat();
			System.out.println("Digite o valor de B:");
			float valorB = escaneia.nextFloat();
			
			float diferenca = valorA >= valorB ? valorA - valorB : valorB - valorA;
			
			System.out.printf("A diferenca de %.2f para %.2f é: %.2f", valorA, valorB, diferenca);
		
		escaneia.close();
	}
}
