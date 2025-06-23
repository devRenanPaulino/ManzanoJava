package manzano;
import java.util.Scanner;

public class Pag25_7A {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Celsius para s Fahrenheit");
		System.out.println("Digite a temperatura em Celcius:");
		float celcius = escaneia.nextFloat();
		
		float fahrenheit = (9 * celcius / 5) + 32;
		
		System.out.printf("A temperatura de %.1f°C convertida é %.1f°F\n", celcius, fahrenheit);		
		escaneia.close();
	}
}
