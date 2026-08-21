import java.util.Scanner;

public class LP_Atividade_N1_1_08_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorTotaisReais;
        int numeroParcelas;

        System.out.print("Informe o valor total da compra em reais: ");
        valorTotaisReais = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        numeroParcelas = scanner.nextInt();

        System.out.println("\n--- Calculadora Financeira Escalar ---");
        
        long cents = (Math.round(valorTotaisReais * 100));
        System.out.println("Valor total convertido: " + cents + " centavos.");

        long centsTotaisReais = (cents / numeroParcelas);
        System.out.println("Divisão de R$ " + valorTotaisReais + " em centavos: " + centsTotaisReais + " centavos por parcela.");

        long valorFinal = centsTotaisReais / 100;
        System.out.println("Valor convertido para exibição: R$" + valorFinal);

        scanner.close();

    }

}
