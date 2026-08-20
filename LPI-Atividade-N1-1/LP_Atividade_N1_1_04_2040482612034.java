import java.util.Scanner;

public class LP_Atividade_N1_1_04_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias para o empréstimo: ");
        int diasEmprestimo = scanner.nextInt();

        do {
            System.out.print("Informe o número de dias para o empréstimo: ");
            diasEmprestimo = scanner.nextInt();
        } while (diasEmprestimo > 14);


        System.out.println("Instituição: FATEC Ipiranga");
        System.out.println("Prazo Máximo Padrão: 14 dias.");
        System.out.println("Dias calculados para devolução: " + diasEmprestimo);

        scanner.close();
    }

}