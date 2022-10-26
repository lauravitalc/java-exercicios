package Silmar;
import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroAlunos;
        double notaAluno;
        int aprovados = 0;
        double maior = 0;

        // Maior nota
        // Numero de alunos aprovados
        // Nota de aprovação maior ou igual a 70

        System.out.print("Informe o número de alunos da turma: ");
        numeroAlunos = entrada.nextInt();
        
        double[] notas = new double[numeroAlunos];
        
        for (int i = 0; i < numeroAlunos; i++) {
        	System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
        	notaAluno = entrada.nextDouble();
        	
        	notas[i] = notaAluno;
        	
        }
        
        for(int i = 0; i < notas.length; i++) {
        	if(notas[i] >= 70 ) {
        		aprovados++;
        	}
        	
        	if(notas[i] > maior) {
        		maior = notas[i];
        	}
        }
        
        System.out.println("O número total de alunos é: " + numeroAlunos);
        System.out.println("A maior nota é: " + maior);
        System.out.println("O número de aprovados é: " + aprovados);

 

    }

}