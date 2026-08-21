/*
Justificativa: A escolha da estrutura for, foi efetivada pelo fato de: existir uma pré-definição de quantas notas será encaminhada
e processada. A pré-definição é quando o usuário acessa o sistema e informa quantos alunos terão notas informadas.
*/

import java.util.Scanner;

public class LP_Atividade_N2_1_01_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* Consultar quantos alunos tem, solicitar as notas, gerar somatória, gerar média e exibir a maior nota. Estrutura Double. */

        double nota, media, notaMaior;
        int quantidadeAlunos;
        double acumuladorNota = 0.0;

        notaMaior = 0.0;

        System.out.print("Quantidade de alunos na turma: ");
        quantidadeAlunos = scanner.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno: ");
            nota = scanner.nextDouble();
            acumuladorNota = acumuladorNota + nota;
            if (notaMaior <= nota) {
                notaMaior = nota;
            }
        }

        media = acumuladorNota / quantidadeAlunos;

        System.out.printf("Soma total das notas: %.2f \n", acumuladorNota);
        System.out.printf("Média da turma: %.2f \n", media);
        System.out.printf("Maior nota da turma: %.2f \n", notaMaior);

        scanner.close();

    }

}
