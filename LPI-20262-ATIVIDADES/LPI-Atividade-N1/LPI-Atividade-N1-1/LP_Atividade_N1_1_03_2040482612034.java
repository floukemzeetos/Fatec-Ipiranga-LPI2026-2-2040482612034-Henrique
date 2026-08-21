
import java.util.Scanner;

public class LP_Atividade_N1_1_03_2040482612034 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Integer idade = (null);

        
        while (idade == null) {
            try {
                idade = idade + 1;
                System.out.println(idade);
            }
            catch (NullPointerException e) {
                System.out.println("Tentando realizar operação aritmética com Integer nulo...");
                System.out.println("Erro Capiturado com sucesso: Não foi possivel calcular porque a idade não foi informada (null).");
                System.out.println("Detalhe da execução: java.lang.NullPointerExeption");
                System.out.print("Informe uma idade válida: ");
                idade = scanner.nextInt();  
            }
        }

        System.out.println("Reatribuindo valor válido para a variavel...");
        System.out.println("Operação bem-sucedida! Idade atual: " + idade + " | Idade no próximo ano: " + (idade + 1));

        scanner.close();

    }

}
