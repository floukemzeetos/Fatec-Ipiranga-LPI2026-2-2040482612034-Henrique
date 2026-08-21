/*
Justificativa: A escolha da estrutura while se deu pelo fato de: Enquanto o PIN informado é diferente do PIN cadastrado, o sistema
repetir a solicitação, até o PIN correto seja informado.
*/

import java.util.Scanner;

public class LP_Atividade_N2_1_03_2040482612034 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* Ser um sistema de verificar a senha. Se chegar a 3ª tentativa, começar a listar quantas tentativas foram feitas. */

        int senha = 1234;
        int cont, informPassword;

        cont = 0;

        System.out.println("Informe o PIN de acesso: ");
        informPassword = scanner.nextInt();

        cont = cont + 1;

        if (senha != informPassword) {
            System.out.println("PIN incorreto. Tente novamente");
        }

        while (informPassword != senha) {
            System.out.println("Informe o PIN de acesso: ");
            informPassword = scanner.nextInt();
            cont = cont + 1;
            

            if (senha != informPassword) {
                System.out.println("PIN incorreto. Tente novamente");                
            }
        }

        System.out.println("Acesso concedido! Você utilizou " + cont + " tentativa(s).");

        scanner.close();

    }

}
