package manzano;
import java.util.Scanner;

public class Pag41_4C {
	 public static void main(String[] args) {
	        Scanner escaneia = new Scanner(System.in);

	        System.out.println("Digite as quatro notas do aluno:");

	        System.out.print("Nota 1: ");
	        float nota1 = escaneia.nextFloat();

	        System.out.print("Nota 2: ");
	        float nota2 = escaneia.nextFloat();

	        System.out.print("Nota 3: ");
	        float nota3 = escaneia.nextFloat();

	        System.out.print("Nota 4: ");
	        float nota4 = escaneia.nextFloat();

	        float media = (nota1 + nota2 + nota3 + nota4) / 4;

	        if (media >= 5) {
	            System.out.printf("Aluno aprovado com média %.2f.%n", media);
	        } else {
	            System.out.printf("Aluno reprovado com média %.2f.%n", media);
	        }

	        escaneia.close();
	 }
}
