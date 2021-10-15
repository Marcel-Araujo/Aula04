import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		double media = 0;
		int numeroAlunos = 0;
		int qtde;
		
		System.out.println("Quantos alunos tem na turma? ");
		qtde = leitor.nextInt();
		
		while (numeroAlunos < qtde) {
			numeroAlunos = numeroAlunos + 1;
			
			System.out.println("Por favor, digite a idade do aluno " + numeroAlunos);
			idade = leitor.nextInt();
			
			media = media + idade;
			
		}
			
			media = media / (double)qtde;
			
			System.out.println("A média de idade dos alunos é: " + media);
			
			leitor.close();
	}

}
