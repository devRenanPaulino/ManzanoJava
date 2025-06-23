package manzano;
import java.util.Scanner;

public class Pag25_7K {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite a cotação em dolar atualmente:");
		float cotacao = escaneia.nextFloat();
		System.out.println("Digite o valor em reais a converter: ");
		float real = escaneia.nextFloat();
		
		float convercao = real / cotacao;
		
		System.out.printf("USD: %.2f = R$: %.2f",real, convercao);
		
		escaneia.close();
	}
}
