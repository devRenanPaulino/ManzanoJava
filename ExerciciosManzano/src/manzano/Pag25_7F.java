package manzano;
import java.util.Scanner;

public class Pag25_7F {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);

		System.out.println("Escolha o tipo de valor:");
		System.out.println("1 - Inteiro | 2 - Real | 3 - Caractere");
		System.out.print("Digite o número da opção escolhida: ");
		int opcao = escaneia.nextInt();

		switch (opcao) {
			case 1:
				System.out.print("Digite o valor inteiro para A: ");
				int A = escaneia.nextInt();
				System.out.print("Digite o valor inteiro para B: ");
				int B = escaneia.nextInt();

				int tempInt = A;
				A = B;
				B = tempInt;

				System.out.printf("Valores Trocados:%nValor A = %d%nValor B = %d%n", A, B);
				break;

			case 2:
				System.out.print("Digite o valor real para A: ");
				float Af = escaneia.nextFloat();
				System.out.print("Digite o valor real para B: ");
				float Bf = escaneia.nextFloat();

				float tempFloat = Af;
				Af = Bf;
				Bf = tempFloat;

				System.out.printf("Valores Trocados:%nValor A = %.2f%nValor B = %.2f%n", Af, Bf);
				break;

			case 3:
				System.out.print("Digite um caractere para A: ");
				char Ac = escaneia.next().charAt(0);
				System.out.print("Digite um caractere para B: ");
				char Bc = escaneia.next().charAt(0);

				char tempChar = Ac;
				Ac = Bc;
				Bc = tempChar;

				System.out.printf("Valores Trocados:%nValor A = %c%nValor B = %c%n", Ac, Bc);
				break;

			default:
				System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
		}

		escaneia.close();
	}
}