package Silmar;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int respostas[] = new int[5];
		int soma = 0;
		System.out.println("Telefonou para a vítima?");
			respostas[0] = ler.nextInt();
		System.out.println("Esteve no local do crime?");
			respostas[1] = ler.nextInt();
		System.out.println("Mora perto da vítima?");
			respostas[2] = ler.nextInt();
		System.out.println("Devia para a vítima?");
			respostas[3] = ler.nextInt();
		System.out.println("Já trabalhou para a vítima?");
			respostas[4] = ler.nextInt();
		
		for(int array : respostas) {
			System.out.println("Resposta: " + array);
		}
		
		for (int i = 0; i < respostas.length; i++) {
            soma+=respostas[i];
        }

		System.out.println(soma);
		
		if(soma == 2) {
			System.out.println("Você é suspeito");
		} else if (soma == 3 || soma == 4) {
			System.out.println("Você é cumplice");
		} else if (soma == 5) {
			System.out.println("Você é o assassino");
		} else {
			System.out.println("Você é inocente");
		}
		
	}

}
