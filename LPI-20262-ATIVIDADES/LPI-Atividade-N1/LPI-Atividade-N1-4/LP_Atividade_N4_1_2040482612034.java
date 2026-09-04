/*--------------------------------------------------------*
* Disciplina : Linguagem de Programacao I                 *
* Prof . Verissimo                                        *
*---------------------------------------------------------*
* Objetivo do Programa : Programa que realizará jogadas   *
*                        que resultará no Xeque Pastor    *
* Data - 03/09/2026                                       *
* Autor : Henrique B. Queiroz                             *
*---------------------------------------------------------*/

public class LP_Atividade_N4_1_2040482612034 {

    private static final int TAMANHO_TABULEIRO = 8;

    public static void main(String[] args) {

        String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        /*
         * Estrutura de repetição I: Responsavel por remover os "null" de cada célula da
         * matriz. Ele está sendo preparado para a inserção de cada peça do tabuleiro.
         */

        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {

                tabuleiro[linha][coluna] = "   ";

            }

        }

        /*
         * posicionamento das casas: Serão configuradas as peças dos tabuleiros, em suas
         * respectivas posições.
         */

        /* LEGENDA */
        /*
         * t = Torre
         * c = Cavalo
         * b = Bispo
         * d = Rainha
         * r = Rei
         */

        /* CASAS PRETAS */
        /* Linha 01 */
        tabuleiro[0][0] = "tP1";
        tabuleiro[0][1] = "cP2";
        tabuleiro[0][2] = "bP3";
        tabuleiro[0][3] = "dP4";
        tabuleiro[0][4] = "rP5";
        tabuleiro[0][5] = "bP6";
        tabuleiro[0][6] = "cP7";
        tabuleiro[0][7] = "tP8";
        /* Linha 02 */
        tabuleiro[1][0] = "PP1";
        tabuleiro[1][1] = "PP2";
        tabuleiro[1][2] = "PP3";
        tabuleiro[1][3] = "PP4";
        tabuleiro[1][4] = "PP5";
        tabuleiro[1][5] = "PP6";
        tabuleiro[1][6] = "PP7";
        tabuleiro[1][7] = "PP8";

        /* CASAS BRANCA */
        /* Linha 07 */
        tabuleiro[6][0] = "PB1";
        tabuleiro[6][1] = "PB2";
        tabuleiro[6][2] = "PB3";
        tabuleiro[6][3] = "PB4";
        tabuleiro[6][4] = "PB5";
        tabuleiro[6][5] = "PB6";
        tabuleiro[6][6] = "PB7";
        tabuleiro[6][7] = "PB8";
        /* Linha 08 */
        tabuleiro[7][0] = "tB1";
        tabuleiro[7][1] = "cB2";
        tabuleiro[7][2] = "bB3";
        tabuleiro[7][3] = "dB4";
        tabuleiro[7][4] = "rB5";
        tabuleiro[7][5] = "bB6";
        tabuleiro[7][6] = "cB7";
        tabuleiro[7][7] = "tB8";

        /*
         * Exibição inicial do tabuleiro. Todos os tabuleiros foram devidamentes
         * configurados
         */
        System.out.println("====================================");
        System.out.println("\n    Posição inicial do Tabuleiro\n");
        System.out.println("====================================");
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição II - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

        /* Processo de exibição da primeira jogada */

        System.out.println("\n====================================");
        System.out.println("             Jogada #1");
        System.out.println("====================================\n");

        System.out.println("     ----Brancas jogam e4----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[6][4] = "...";
        tabuleiro[4][4] = "PB5";

        /* Exibição da Jogada 1 das peças Brancas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição II - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

        System.out.println("\n     ----Pretas jogam e5----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[1][4] = "...";
        tabuleiro[3][4] = "PP4";

        /* Exibição da Jogada 1 das peças Pretas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição III - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }


        /* Processo de exibição da segunda jogada */

        System.out.println("\n====================================");
        System.out.println("             Jogada #2");
        System.out.println("====================================\n");

        System.out.println("     ----Brancas jogam bC4----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[7][5] = "...";
        tabuleiro[4][2] = "bB6";

        /* Exibição da Jogada 2 das peças Brancas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição IV - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

        System.out.println("\n     ----Pretas jogam Cc6----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[0][1] = "...";
        tabuleiro[2][2] = "cP2";

        /* Exibição da Jogada 2 das peças Pretas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição V - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

         /* Processo de exibição da terceira jogada */

        System.out.println("\n====================================");
        System.out.println("             Jogada #3");
        System.out.println("====================================\n");

        System.out.println("     ----Brancas jogam Dh5----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[7][3] = "...";
        tabuleiro[3][7] = "bB6";

        /* Exibição da Jogada 3 das peças Brancas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição VI - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }

        System.out.println("\n     ----Pretas jogam Cf6----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[0][6] = "...";
        tabuleiro[2][5] = "cP7";

        /* Exibição da Jogada 3 das peças Pretas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição VII - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }


        /* Processo de exibição da Quarta jogada --> Xeque Mate */

        System.out.println("\n========================================================================");
        System.out.println("                         Jogada #4 (Xeque Mate)");
        System.out.println("========================================================================\n");

        System.out.println("     ----Brancas capituram Peão PP6 em f7 e Xeque Mate (Dxf7#)----");
        /* Processamento do movimento da peça escolhida */
        tabuleiro[1][5] = "dB6";

        /* peça devorada */
        tabuleiro[3][7] = "...";

        /* Exibição da Jogada 4 das peças Brancas */
        System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");

        /* Estrutura de repetição VIII - Responsavel por: Instalar o tabuleiro. */
        for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
            System.out.print((8 - linha) + " ");

            for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }

            System.out.println();
        }


    }

}