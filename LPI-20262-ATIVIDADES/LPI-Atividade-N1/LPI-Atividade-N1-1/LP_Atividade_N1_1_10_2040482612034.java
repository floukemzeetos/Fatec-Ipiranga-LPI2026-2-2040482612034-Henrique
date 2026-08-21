import java.util.Scanner;

public class LP_Atividade_N1_1_10_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a, b, c, d, media, presenca;

        System.out.print("Informe o valor A: ");
        a = scanner.nextDouble();

        System.out.print("Informe o valor B: ");
        b = scanner.nextDouble();

        System.out.print("Informe o valor C: ");
        c = scanner.nextDouble();

        System.out.print("Informe o valor D: ");
        d = scanner.nextDouble();

        System.out.print("Informe a média do aluno: ");
        media = scanner.nextDouble();

        System.out.print("Informe o percentual de presença: ");
        presenca = scanner.nextDouble();

        double resultadoPar = a * b - c / d;

        System.out.println("--- Demonstração de Presença Aritmética ---");
        System.out.println("Resultado Sem parênteses: " + resultadoPar);
        System.out.println("Resultado Com parênteses explícitos: " + (a*b-c/d));

        System.out.println("--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
        
        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);

        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        scanner.close();

    }

}
