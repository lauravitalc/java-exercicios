package Silmar;
import java.util.Scanner;

public class Prova2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroAlunos;
        double notaAluno;
        int reprovados = 0;
        double media = 0;
        double soma = 0;

        System.out.print("Informe o número de alunos da turma: ");
        numeroAlunos = entrada.nextInt();
        
        double[] notas = new double[numeroAlunos];
        
        for (int i = 0; i < numeroAlunos; i++) {
        	System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
        	notaAluno = entrada.nextDouble();
        	
        	notas[i] = notaAluno;
        }

        for(int i = 0; i < notas.length; i++) {
        	soma += notas[i];
        	if(notas[i] < 70 ) {
        		reprovados++;
        	}
        	
        }
        
        media = soma / numeroAlunos;
        
        System.out.println("O número total de alunos é: " + numeroAlunos);
        System.out.println("O número de reprovados é: " + reprovados);
        System.out.println("A média das notas é:  " + media);
 

    }

}