package Silmar;
import java.util.Scanner;

public class nome {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int count = 0;
		
		String meuNome = "Laura";
		String seuNome;
		
		int minhaIdade = 22;
		int suaIdade;
		
		Double minhaAltura = 1.64;
		Double suaAltura;
		
		int meuPeso = 60;
		int seuPeso;
		
		String minhaMusica = "Elephant Gun";
		String suaMusica;
		
		String meuFilme = "Como se Fosse a Primeira vez";
		String seuFilme;
		
		String meuLivro = "O Hobbit";
		String seuLivro;
		
		System.out.println("Qual é seu nome?");
		seuNome = ler.nextLine();
		
		System.out.println("Qual é sua idade?");
		suaIdade = ler.nextInt();
		
		System.out.println("Qual é sua altura?");
		suaAltura = ler.nextDouble();
		
		System.out.println("Qual é seu peso?");
		seuPeso = ler.nextInt();
		
		System.out.println("Qual é sua música favorita?");
		suaMusica = ler.nextLine();
		
		System.out.println("Qual é seu filme favorito?");
		seuFilme = ler.nextLine();
		
		System.out.println("Qual é seu livro favorito?");
		seuLivro = ler.nextLine();
		
		
		if(seuNome.equalsIgnoreCase(meuNome)) {
			count++;
		} 
		
		if(suaIdade == minhaIdade) {
			count++;
		} 
		
		if(suaAltura == minhaAltura) {
			count++;
		} 
		
		if(seuPeso == meuPeso) {
			count++;
		} 
		
		if(suaMusica.equalsIgnoreCase(minhaMusica)) {
			count++;
		} 
		
		if(seuFilme.equalsIgnoreCase(meuFilme)) {
			count++;
		} 
		
		if(seuLivro.equalsIgnoreCase(meuLivro)) {
			count++;
		} 
		
		if(count > 0) {
			if(count >=3) {
				System.out.println("Somos parecidos");
			} else {
				System.out.println("Somos diferentes");
			}
		} else {
			System.out.println("Inválido");
		}
		
		
	}
}
//Laura Vital Cacique - 32214364