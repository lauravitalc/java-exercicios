package Ambulatorio;
import java.util.Scanner;

public class Equipamentos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Entre sua idade: ");
		idade = ler.nextInt();
		System.out.println("\n Você tem " + idade + " anos" );
	}
}
