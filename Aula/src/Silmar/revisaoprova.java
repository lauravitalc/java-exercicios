package Silmar;
import java.util.Scanner;

public class revisaoprova {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	 int n1;
	 int n2;
	 int n3;
	int menor = 0;
	System.out.println("Digite o primeiro número");
	n1 = ler.nextInt();
	System.out.println("Digite o segundo número");
	n2 = ler.nextInt();
	System.out.println("Digite o terceiro número");
	n3 = ler.nextInt();
	
	double media = ((n1 + n2 + n3) / 3);
	 
	 if(n1 < n2 && n1 < n3) {
		 menor = n1;
		 System.out.println("O primeiro número é menor. O número é: " + menor);
		 System.out.println("A média dos números é: " + media);
	 } else if (n2 < n1 && n2 < n3) {
		 menor = n2;
		 System.out.println("O segundo número é menor. O número é: " + menor);
		 System.out.println("A média dos números é: " + media);
	 } else if (n3 < n1 && n3 < n2) {
		 menor = n3;
		 System.out.println("O terceiro número é menor. O número é: " + menor);
		 System.out.println("A média dos números é: " + media);
	 }

	}

}
