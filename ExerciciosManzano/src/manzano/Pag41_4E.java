package manzano;
import java.util.Scanner;

public class Pag41_4E {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		float valorA;
		
		do {
			System.out.println("Digite o coeficiente de A: (Diferente de Zero)");
			valorA = escaneia.nextFloat();
		} while (valorA == 0);
		
		System.out.println("Digite o coeficiente de B:");
		float valorB = escaneia.nextFloat();
		System.out.println("Digite o coeficiente de C:");
		float valorC = escaneia.nextFloat();
		
		double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;	
		
		if (delta > 0) {
			double x1 = ((-valorB + Math.sqrt(delta)) / (2 * valorA));
			double x2 = ((-valorB - Math.sqrt(delta)) / (2 * valorA));
			
			System.out.printf("As duas raízes distintas: x1 = %.2f e x2 = %.2f", x1, x2 );
		} else if (delta == 0){
			double x1 = (-valorB / (2 * valorA));
			
			System.out.printf("A raíz única (dupla): X= %.2f", x1);
		} else {
			double parteReal = (-valorB / (2 * valorA));
			double parteImaginaria = (Math.sqrt(Math.abs(delta)) / (2 * valorA));
			
			System.out.printf("As duas raízes complexas conjugadas são:%n");
			System.out.printf("x1 = %.2f + %.2fi%n", parteReal, parteImaginaria);
			System.out.printf("x2 = %.2f - %.2fi%n", parteReal, parteImaginaria);
		}
		escaneia.close();
	}
}
