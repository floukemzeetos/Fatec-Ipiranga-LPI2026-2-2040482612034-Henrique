import java.util.Scanner;

public class pgm_n13 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int quantidadeLeituras;
        double temperaturaCritica;

        System.out.print("Quantidade de leituras: ");
        quantidadeLeituras = scanner.nextInt();

        double[] temperatura = new double[quantidadeLeituras];

        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.print("Temperatura (°C): ");
            temperatura[i] = scanner.nextDouble();
        }

        System.out.println("-- Leituras Registradas --");
        
        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.println("Leitura [" + i + "]: " + temperatura[i]);
        }

        System.out.println("-- Acesso direto --");
        System.out.println("Primeira leitura (indice 0): " + temperatura[0]);
        System.out.println("Ultima leitura (indice " + (quantidadeLeituras - 1) + "): " + temperatura[temperatura.length - 1]);

        System.out.println("-- Busca Linear: Extremos --");

        int indiceMaior, indiceMenor;
        indiceMaior = 0;
        indiceMenor = 0;

        for (int i = 0; i < quantidadeLeituras; i++) {

            if (temperatura[i] > temperatura[indiceMaior]) {
                indiceMaior = i;
            }
            else if (temperatura[i] < temperatura[indiceMenor]) {
                indiceMenor = i;
            }

        }

        System.out.println("Maior temperatura: " + temperatura[indiceMaior] + "°C (indice " + indiceMaior + ")");
        System.out.println("Menor temperatura: " + temperatura[indiceMenor] + "°C (indice " + indiceMenor + ")");

        System.out.print("Temperatura crítica de alerta (°C): ");
        temperaturaCritica = scanner.nextDouble();

        System.out.println("-- Busca Linear: Alerta --");
        int indiceCritico = 0;

        for (int i = 0; i < quantidadeLeituras; i++) {

            if (temperatura[i] >= temperaturaCritica) {
                indiceCritico = i;
            }

        }

        if (temperatura [indiceCritico] < temperaturaCritica) {
            System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura crítica informada.");
        }

        else {
            System.out.println("Alerta: temperatura crítica atingida na leitura de índice " + indiceCritico + " (" + temperatura[indiceCritico] + "°C)");
        }

        scanner.close();

    }

}
