/*
Justificativa: A escolha da estrutura do-while se deu, pelo fato de: Existir uma condicional: O sistema deve parar de repetir quando
o usuário informar o número 0.
*/

import java.util.Scanner;

public class LP_Atividade_N2_1_02_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* Servir como caixa de empresa, coletasr os valores, gerar média das vendas. Se inserido 0, encerrar o programa e não somar ao final. */

        double valorVenda, caixa;
        caixa = 0.0;
        int vendas;
        vendas = 0;

        do {
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();

            if (valorVenda != 0) {
                caixa = caixa + valorVenda;
                vendas = vendas + 1;

                System.out.print("Valor da venda (ou 0 para encerrar): ");
                valorVenda = scanner.nextDouble();

                vendas = vendas + 1;
            }

            caixa = caixa + valorVenda;

        } while (valorVenda != 0);

        if (caixa == 0) {
            System.out.println("Nenhuma venda registrada nessa sessão de caixa");
        }
        else {
            System.out.printf("Total vendido no turno: R$ %.2f \n", caixa);
            System.out.println("Quantidade de vendas: " + vendas);

            double mediaVendas = caixa / vendas;

            System.out.printf("Valor médio por venda: R$ %.2f \n", mediaVendas);
        }

        scanner.close();

    }

}
