package manzano;
import java.util.Scanner;

public class Pag25_7D {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite o tempo da viagem em horas: ");
		float tempoGasto = escaneia.nextFloat();
		System.out.println("Digite a velocidade m�dia da viagem: ");
		float velocidadeMedia = escaneia.nextFloat();
		
		float distancia = tempoGasto * velocidadeMedia;
		float litrosUsados = distancia / 12;
		
		System.out.printf("A velocidade m�dia do ve�culo era de %.2FKm/h %n O tempo gasto foi de %.2F horas %n A dist�ncia percorrida de %.2FKm %n A quantidade de combustivel utilizada de %.2F litros %n", velocidadeMedia, tempoGasto, distancia, litrosUsados);
		
		
		escaneia.close();
	}
}
