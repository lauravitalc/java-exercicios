// Laura Vital Cacique - 32214364

package ifEElse;
import java.util.Scanner;

public class calcularIMC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		double altura;
		double peso;	
		
		System.out.println("Digite sua altura: ");
		altura = input.nextDouble();
		
		System.out.println("Digite seu peso: ");
		peso = input.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("\nSeu IMC é " + imc);
		
		if(imc <= 18.5) {
			System.out.println("Você está na classificação: Magreza");
		}else if (imc <= 24.9) {
			System.out.println("Você está na classificação: Normal");
		}else if (imc <= 29.9){
			System.out.println("Você está na classificação: Sobre Peso I");
		}else if (imc <= 39.9){
			System.out.println("Você está na classificação: Sobre Peso II");
		}else {
			System.out.println("Você está na classificação: Obesidade Grave");
		}
		
		
		
		input.close();
	}
}
