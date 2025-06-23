package manzano;
import java.util.Scanner;

public class Pag41_4J {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
			
			System.out.println("Digite um valor de 1 a 9:");
			float valor = escaneia.nextFloat();
			
			if (valor > 9 || valor < 1) {
				System.out.println("O valor está fora da faixa permitida!");
			} else {
				System.out.println("O valor está dentro da faixa permitida!");
			};
		
		escaneia.close();
	}
}
