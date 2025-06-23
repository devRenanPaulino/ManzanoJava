package manzano;
import java.util.Scanner;

public class Pag25_7C {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Calculando Volume de Cilindros");
		System.out.println("Digite o raio do cilindro:");
		float raio = escaneia.nextFloat();
		System.out.println("Digite a altura do cilindro:");
		float altura = escaneia.nextFloat();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.printf("O volume do cilindro é %.2f\n", volume);
		
		escaneia.close();
	}
}
