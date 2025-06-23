package manzano;
import java.util.Scanner;

public class Pag41_4D {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Sistema Escolar");
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = escaneia.nextFloat();
		System.out.println("Digite a segunda nota do aluno: ");
		float nota2 = escaneia.nextFloat();
		System.out.println("Digite a terceira nota do aluno: ");
		float nota3 = escaneia.nextFloat();
		System.out.println("Digite a quarta nota do aluno: ");
		float nota4 = escaneia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		 if (media >= 7) {
	            System.out.printf("O aluno foi aprovado com média de: %.2f%n", media);
	        } else {
	            System.out.print("Digite a nota do exame: ");
	            float exame = escaneia.nextFloat();

	            float novaMedia = (media + exame) / 2;

	            if (novaMedia >= 5) {
	                System.out.printf("O aluno foi aprovado em exame com média final de: %.2f%n", novaMedia);
	            } else {
	                System.out.printf("O foi reprovado em exame com média final de: %.2f%n", novaMedia);
	            }
	        }
		
		escaneia.close();
	}
}
