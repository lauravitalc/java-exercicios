package Silmar;
import java.util.Scanner;
public class votacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int voto;
		int contador27 = 0;
		int contador33 = 0;
		
		
		
			System.out.println("Qual é o seu voto? ");
			voto = ler.nextInt();
			
			switch(voto) {
			case 27:
				System.out.println("Você votou em Adam Sandler");
				contador27++;
				break;
			case 33:
				System.out.println("Você votou em Kanye West");
				contador33++;
				break;
			default:
				System.out.println("Invalido");
				break;
			}
		}

}
