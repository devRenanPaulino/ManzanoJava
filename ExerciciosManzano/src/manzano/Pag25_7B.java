package manzano;
import java.util.Scanner;

public class Pag25_7B {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Fahrenheit para Celsius");
		System.out.println("Digite a temperatura em Fahrenheit:");
		float fahrenheit = escaneia.nextFloat();
		
		float celcius = (fahrenheit-32) * 0.5556f;
		
		System.out.printf("A temperatura de %.2f°F convertida é %.2f°C\n", fahrenheit, celcius);		
		escaneia.close();
	}
}
