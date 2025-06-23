package manzano;
import java.util.Scanner;

public class Pag25_7H {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Calculando o volume de um retângulo");
		System.out.println("Digite o comprimento: ");
		float comprimento = escaneia.nextFloat();
		System.out.println("Digite a largura: ");
		float largura = escaneia.nextFloat();
		System.out.println("Digite a altura: ");
		float altura = escaneia.nextFloat();
		
		float volume = comprimento * largura * altura;
		
		System.out.printf("O volume do retângulo é de %.2fcm²", volume);
		
		escaneia.close();
	}
}
