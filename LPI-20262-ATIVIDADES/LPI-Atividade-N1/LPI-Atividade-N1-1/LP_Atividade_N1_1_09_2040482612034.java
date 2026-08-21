import java.util.Scanner;

public class LP_Atividade_N1_1_09_2040482612034 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double notaFinal;

        System.out.print("Informe a nota final do aluno: ");
        notaFinal = scanner.nextDouble();

        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        if (notaFinal >= 6.0) {
            System.out.println("Situação (if-else): Aprovado");
        }
        else {
            System.out.println("Situação (if-else): Reprovado");
        }

        System.out.println("--- Abordagem 2: Estrutura Ternário Simples ---");

        String notaFinalTernario = (notaFinal >= 6) ? "Aprovado" : "Reprovado";

        System.out.println("Situação (Ternário): "+ notaFinalTernario);

        scanner.close();

    }
}
