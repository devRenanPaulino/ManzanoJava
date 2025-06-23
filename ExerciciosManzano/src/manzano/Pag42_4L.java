package manzano;
import java.util.Scanner;

public class Pag42_4L {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		 System.out.print("Digite seu nome: ");
	     String nome = escaneia.nextLine();

	     System.out.print("Digite seu sexo (M/F): ");
	     String sexo = escaneia.nextLine().trim().toUpperCase();

	     String saudacao = (sexo.equals("M")) ? "Ilmo Sr." :(sexo.equals("F")) ? "Ilma Sra." : "Sexo não identificado";

	     System.out.println(saudacao + " " + nome);

	     escaneia.close();
	}
}
