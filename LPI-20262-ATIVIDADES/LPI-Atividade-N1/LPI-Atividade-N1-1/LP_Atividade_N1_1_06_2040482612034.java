import java.util.Scanner;

public class LP_Atividade_N1_1_06_2040482612034 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String user;

        System.out.print("Informe o nome de usuário: ");
        user = scanner.nextLine();

        if (user != null && user.length() > 0) {
            System.out.println("Usuário válido fornecido: " + user);
        }
        else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        scanner.close();

    }
}