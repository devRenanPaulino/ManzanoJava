package manzano;
import java.util.Scanner;

public class Pag41_4I {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int valor = escaneia.nextInt();
		
		String resultado = (valor % 2 == 0) ? "par" : "impar";
		
		System.out.printf("O n�mero %d � %s", valor, resultado);
		
		escaneia.close();
	}
}
