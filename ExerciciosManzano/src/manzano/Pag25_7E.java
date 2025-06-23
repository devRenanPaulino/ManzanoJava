package manzano;
import java.util.Scanner;

public class Pag25_7E {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
			
		System.out.println("Digite o valor da prestação: ");
		float valorPrestacao = escaneia.nextFloat();
		System.out.println("Digite a taxa em juros: ");
		float taxaJuros = escaneia.nextFloat();
		System.out.println("Digite o tempo em atraso (em meses): ");
		int tempoAtraso = escaneia.nextInt();
		
		float prestacaoAtraso = valorPrestacao + (valorPrestacao * taxaJuros/100) * tempoAtraso;
		
		System.out.printf("O valor da prestação em atraso é de R$: %.2f", prestacaoAtraso);
		
		
		escaneia.close();	
	}
}
