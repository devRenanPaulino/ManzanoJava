package manzano;
import java.util.Scanner;

public class Pag41_4B {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Apresento apenas valores positivos, sendo negativo converto ele!");
		System.out.println("Digite o valor: ");
		float valor = escaneia.nextFloat();
		
		float apresentar = valor < 0 ? valor * -1 : valor;
		
		System.out.print(apresentar);
		
		escaneia.close();
	}
}
