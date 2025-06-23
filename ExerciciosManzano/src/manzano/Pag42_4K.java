package manzano;
import java.util.Scanner;

public class Pag42_4K {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float valor = escaneia.nextFloat();
		
		if ( valor > 3) {
			System.out.println("Será Apenas exibido valores menores que três!");
		} else {
			System.out.print(valor);
		}
		
		escaneia.close();
	}
}
