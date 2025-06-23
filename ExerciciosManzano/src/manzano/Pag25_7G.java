package manzano;
import java.util.Scanner;

public class Pag25_7G {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		 int[] valores = new int[4];
	     String[] nomes = {"A", "B", "C", "D"};
	     
	     for (int i = 0; i < 4; i++ ) {
	    	 System.out.printf("Digite o valor de %s: ", nomes[i]);
	    	 valores[i] = escaneia.nextInt();
	     }
	     
	     for (int i = 0; i < valores.length; i++) {
	    	 for (int j = i + 1; j < valores.length; j++) {
	    		 System.out.printf("%s + %s = %d%n", nomes[i], nomes[j], valores[i] + valores[j]);
	    	 }
	     }
	     
	     for (int i = 0; i < valores.length; i++) {
	            for (int j = i + 1; j < valores.length; j++) {
	                System.out.printf("%s * %s = %d%n", nomes[i], nomes[j], valores[i] * valores[j]);
	            }
	     }
		
		escaneia.close();
	}
}
