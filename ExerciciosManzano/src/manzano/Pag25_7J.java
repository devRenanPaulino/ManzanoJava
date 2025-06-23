package manzano;
import java.util.Scanner;

public class Pag25_7J {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite a cotação em dolar atualmente:");
		float cotacao = escaneia.nextFloat();
		System.out.println("Digite o valor em dolares a converter: ");
		float dolar = escaneia.nextFloat();
		
		float convercao = dolar * cotacao;
		
		System.out.printf("USD: %.2f = R$: %.2f",dolar, convercao);
		
		escaneia.close();
	}
}
