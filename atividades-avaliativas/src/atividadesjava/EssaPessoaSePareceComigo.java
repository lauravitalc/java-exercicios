package atividadesjava;
import java.util.Scanner;
public class EssaPessoaSePareceComigo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		String estiloMusical;
		
		int idade;
		int numeroCamera;
		
		char sexo;
		char tamanho;
		
		double altura;
		double peso;
		
		boolean rock;
		boolean classico;
		
		int count = 0;
		
		System.out.println("Qual é seu nome?");
		nome = ler.nextLine();
		
		System.out.println("Qual é seu estilo musical favorito?");
		estiloMusical = ler.nextLine();
		
		System.out.println("Qual é sua idade");
		idade = ler.nextInt();
		
		System.out.println("Quantas cameras você possue?");
		numeroCamera = ler.nextInt();
		
		System.out.println("Qual seu sexo? F ou M?");
		sexo = ler.next().charAt(0);
		
		System.out.println("Qual é seu tamanho de roupa? P, M, G..?");
		tamanho = ler.next().charAt(0);
		
		System.out.println("Qual é sua altura?");
		altura = ler.nextDouble();
		
		System.out.println("Qual é seu peso? (Kilogramas e Gramas)");
		peso = ler.nextDouble();
		
		System.out.println("Você gosta de rock. True ou False?");
		rock = ler.nextBoolean();
		
		System.out.println("Você gosta de música clássica. True ou False?");
		classico = ler.nextBoolean();
		
		if(nome.equalsIgnoreCase("Laura")) {
			count ++;
		}
		if (estiloMusical.equalsIgnoreCase("Rock")) {
			count ++;
		} 
		if (idade == 22) {
			count ++;
		}
		if (numeroCamera == 6) {
			count ++;
		}
		if (sexo == 'F') {
			count ++;
		}
		if (tamanho == 'M') {
			count ++;
		}
		if (altura == 1.64) {
			count ++;
		}
		if (peso == 60.5) {
			count ++;
		}		
		if (rock) {
			count ++;
		}	
		if (classico) {
			count ++;
		}
		
		System.out.println(count >= 5 ? "Somos parecidos" : "Não somos parecidos");
		System.out.printf("%d", count);
	}

}
