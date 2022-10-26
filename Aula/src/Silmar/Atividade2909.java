package Silmar;
import java.util.Scanner;
public class Atividade2909 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String palavra;
		
		System.out.println("Digite uma palavra: ");
		palavra = ler.nextLine();
		
		// Exercicio 1
		for(int i=0; i < palavra.length(); i++) {
			System.out.print(palavra.charAt(i) + " - ");
		}
		
		// Exercicio 2
		System.out.println("\n" + palavra.toUpperCase());
		
		// Exercicio 3
		
		System.out.println(palavra.substring(0,3));
		
		// Exercicio 4
		
		System.out.println(palavra.length());
		
		// Exercicio 5
		
		if(palavra.length() >= 7) {
			System.out.println("O 7º caracter é " + palavra.charAt(6));
		} else {
			System.out.println("A palavra tem: " + palavra.length() + " letras.");
		}
		
		// Exercicio 6
		System.out.println("A palavra começa com a letra A? " + palavra.startsWith("a"));
		
		// Exercicio 7
		
		System.out.println("A última letra é: " + palavra.charAt(palavra.length() - 1));
		
	}

}
