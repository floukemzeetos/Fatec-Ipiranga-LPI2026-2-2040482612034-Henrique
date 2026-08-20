import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_N1_1_07_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String valorA, valorB, valorCompra;
        int numeroParcelas;

        System.out.print("Informe o valor A (ex.: 1.00): ");
        valorA = scanner.nextLine();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        valorB = scanner.nextLine();

        System.out.print("Informe o valor total da compra: ");
        valorCompra = scanner.nextLine();

        System.out.print("Informe o número de parcelas: ");
        numeroParcelas = scanner.nextInt();

        double valorA_Double = Double.parseDouble(valorA);
        double valorB_Double = Double.parseDouble(valorB);

        double erro = valorA_Double - valorB_Double;
        double resultadoPreliminar = Math.round(erro * 100.0) / 100.0;

        System.out.println("\n--- Demonstração da Imprecisão do Padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - "+ valorB + " seria de " + resultadoPreliminar);
        System.out.println("Resultado real obtido com o double: " + erro);

        BigDecimal valorAA = new BigDecimal(valorA);
        BigDecimal valorBB = new BigDecimal(valorB);

        BigDecimal valorSubtraido = valorAA.subtract(valorBB);
        System.out.println("\n--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + valorSubtraido);

        BigDecimal valorCompraDEC = new BigDecimal(valorCompra);
        BigDecimal numeroParcelasDEC = new BigDecimal(numeroParcelas);

        BigDecimal valorParcela = valorCompraDEC.divide(numeroParcelasDEC, 2, RoundingMode.HALF_UP);
        System.out.println("\n--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x : R$ " + valorParcela + " por parcela.");

        scanner.close();

    }    

}
