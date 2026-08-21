import java.util.Scanner;

public class LP_Atividade_N1_1_05_2040482612034 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        /* variaveis */

        int estoque, qtdEntrada, qtdSaida1, qtdSaida2, estoqueMinimo, tamanhoLote;

        /* adição de dados */

        System.out.print("Estoque inicial: ");
        estoque = scanner.nextInt();

        System.out.print("Quantidade de entrada: ");
        qtdEntrada = scanner.nextInt();

        System.out.print("Quantidade de saída 1: ");
        qtdSaida1 = scanner.nextInt();

        System.out.print("Quantidade de saída 2: ");
        qtdSaida2 = scanner.nextInt();

        System.out.print("Estoque mínimo: ");
        estoqueMinimo = scanner.nextInt();

        System.out.print("Tamanho do lote (caixa): ");
        tamanhoLote = scanner.nextInt();

        System.out.println("Estoque inicial: " + estoque + " unidades.");
        estoque += qtdEntrada;
        System.out.println("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades.");
        estoque -= qtdSaida1;
        System.out.println("Após saída (-" + qtdSaida1 + "): " + estoque + " unidades." );
        estoque -= qtdSaida2;
        System.out.println("Após outra saída (-" + qtdSaida2 + "): " + estoque + " unidades.");

        if (estoque < estoqueMinimo) {
            System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ").");
            
        }
        else {
            System.out.println("O nível de estoque atual (" + estoque + ") está no mínimo ou acima do mínimo (" + estoqueMinimo + ").");
        }

        int sobras = estoque % tamanhoLote;
        boolean sobrasPerfeitas = (sobras == 0);

        System.out.println("Unidades foras de caixas fechadas de " + tamanhoLote + ": " + sobras);
        System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + sobrasPerfeitas);
        


        scanner.close();
    }
}