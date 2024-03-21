package Media;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada do teclado

        char desejaInserirOutroAluno = 's'; // Inicialmente, o usuário deseja inserir notas de pelo menos um aluno

        while (desejaInserirOutroAluno == 's' || desejaInserirOutroAluno == 'S') {
            // Solicita ao usuário que insira o número de alunos
            System.out.print("Quantos alunos deseja inserir notas? ");
            int numAlunos = scanner.nextInt(); // Lê o número de alunos fornecido pelo usuário

            // Matriz para armazenar as notas dos alunos. Cada linha representa um aluno e cada coluna representa uma nota.
            double[][] notasAlunos = new double[numAlunos][3]; // Assumindo que cada aluno tem três notas

            // Loop para receber as notas de cada aluno
            for (int i = 0; i < numAlunos; i++) {
                // Solicita ao usuário que insira as três notas do aluno atual
                System.out.print("Informe as três notas do aluno " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    notasAlunos[i][j] = scanner.nextDouble(); // Lê a nota fornecida pelo usuário e a armazena na matriz
                }
            }

            // Exibindo as notas dos alunos
            System.out.println("\nNotas dos alunos:");
            for (int i = 0; i < numAlunos; i++) {
                System.out.print("Aluno " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(notasAlunos[i][j] + " "); // Exibe as notas do aluno atual
                }
                System.out.println(); // Move para a próxima linha para o próximo aluno
            }

            // Verifica se o usuário deseja inserir as notas de outro aluno
            System.out.print("\nDeseja inserir as notas de outro aluno? (s/n): ");
            desejaInserirOutroAluno = scanner.next().charAt(0);
        }

        scanner.close(); // Fechando o Scanner para evitar vazamento de recursos
    }
}
