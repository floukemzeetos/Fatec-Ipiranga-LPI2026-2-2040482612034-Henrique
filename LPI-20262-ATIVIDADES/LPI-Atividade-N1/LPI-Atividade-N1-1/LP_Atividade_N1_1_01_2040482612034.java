import java.util.Scanner;

public class LP_Atividade_N1_1_01_2040482612034 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* Variaveis */
        byte idade;                     /* Intervalo: -128 a 127 | Tamanho: 8 bits */
        short faltas;                   /* Intervalo: -32.768 a 32.767 | Tamanho: 16 bits */
        int matriculaId;                /* Intervalo: -2.147.483.648 a 2.147.483.647 | Tamanho: 32 bits */
        long codigoNacional;            /* Intervalo: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | Tamanho: 64 bits */
        float notaTrabalho;             /* Intervalo: -3.4028235e+38 a 3.4028235e+38 [Padrão IEEE 754] | Tamanho: 32 bits */
        double notaProvaFinal;          /* Intervalo: 4.9E-324 a 1.7976931348623157E+308 [Padrão 754] | Tamanho: 64 bits */
        char conceitoFinal;             /* Intervalo: 0 a 65.535 | Tamanho: 16 bits */
        boolean aprovado;               /* Intervalo: false (falso) ou true (verdadeiro) | Tamanho: 1 bits */

        /* Cadastro de Informações */
        System.out.print("Idade do Aluno: ");
        idade = scanner.nextByte();

        System.out.print("Número de Faltas: ");
        faltas = scanner.nextShort();

        System.out.print("Matrícula ID: ");
        matriculaId = scanner.nextInt();

        System.out.print("Código Nacional do Estudante: ");
        codigoNacional = scanner.nextLong();

        System.out.print("Nota do Trabalho: ");
        notaTrabalho = scanner.nextFloat();

        System.out.print("Nota da Prova Final: ");
        notaProvaFinal = scanner.nextDouble();

        System.out.print("Conceito Final do Aluno: ");
        conceitoFinal = scanner.next().charAt(0);

        System.out.print("Aluno está Aprovado? (true/false): ");
        aprovado = scanner.nextBoolean();

        /* Saídas */
        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        scanner.close();

    }
}