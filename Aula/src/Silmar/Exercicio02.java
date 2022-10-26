package Silmar;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int a,b;
		a = 420;
		b = 666;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.printf("%d %d\n", a,b);
		
		String nome;
		nome = "Laura";
		System.out.println("Meu nome é: " + nome);
		System.out.printf("Meu nome é: %s", nome);
		
		final double Pi = 3.14159; // constante, o const do javascript
		System.out.println(Pi);
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		double temperatura = 32;
		double resultado = (temperatura - AJUSTE) / FATOR;
		System.out.println("A temperatura: " + temperatura + " equivale a: " + resultado);
		
	}
}
