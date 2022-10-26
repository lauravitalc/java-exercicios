package atividadesjava;
import java.util.Scanner;

public class DoisColegaDeClasse {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String escolha;
		String nome;
		int idade;
		double altura;
		String cor;
		String doce;
		String comida;
		
		System.out.println("Qual colega você escolhe? Laura ou Gabriel?");
		escolha = ler.nextLine();
		
		if(escolha.equalsIgnoreCase("Laura")) {
			nome = "Laura";
			idade = 22;
			altura = 1.64;
			cor = "roxo";
			doce = "Suspiro Princesa";
			comida = "Strogonoff";
			System.out.println("Dados sobre " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nCor favorita: " + cor + "\nDoce favorito: " + doce + "\nComida favorita: " + comida);
		} else if(escolha.equalsIgnoreCase("Gabriel")) {
			nome = "Gabriel";
			idade = 21;
			altura = 1.78;
			cor = "Verde";
			doce = "Doce de Leite";
			comida = "Tropeiro";
			System.out.println("Dados sobre " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nCor favorita: " + cor + "\nDoce favorito: " + doce + "\nComida favorita: " + comida);
		}
		
	}
}
