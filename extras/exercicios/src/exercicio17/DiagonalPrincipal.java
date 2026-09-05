package exercicio17;

/**
 * Crie uma matriz quadrada 5x5.
 *
 * Exiba a matriz e identifique os elementos da diagonal principal.
 *
 * Lembre-se:
 *
 * i == j
 *
 * identifica os elementos da diagonal principal.
 * Exemplo
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Diagonal principal:
 *
 * 1 5 9
 *
 * Calcule
 *
 *     Soma da diagonal principal.
 *     Multiplicação dos elementos da diagonal principal.
 *
 * Desafio
 *
 * Faça o mesmo para a diagonal secundária.
 * Objetivo
 *
 * Praticar:
 *
 *     Matrizes
 *     Loops aninhados
 *     Condições
 *     i == j
 *     Acumuladores
 *     Multiplicação
 */
public class DiagonalPrincipal {
    public static void main(String[] args) {
//        int[][] matriz = new int[][]{
//                                        {1, 2, 3, 4, 5},
//                                        {1, 2, 3, 4, 5},
//                                        {1, 2, 3, 4, 5},
//                                        {1, 2, 3, 4, 5},
//                                        {1, 2, 3, 4, 5},
//                                    };
        int[][] matriz = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] diagonalPrincipal = new int[matriz.length];
        int somaDiagonalPrincipal = 0;
        int produtoDiagonalPrincipal = 1;

        int[] diagonalSecundaria = new int[matriz.length];
        int somaDiagonalSecundaria = 0;
        int produtoDiagonalSecundaria = 1;

        // processa diagonal principal
        System.out.println("Matriz");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%d   ", matriz[linha][coluna]);

                if(linha == coluna){
                    diagonalPrincipal[coluna] = matriz[linha][coluna];
                    somaDiagonalPrincipal += matriz[linha][coluna];
                    produtoDiagonalPrincipal *= matriz[linha][coluna];
                }
            }
            System.out.printf("%n");
        }

        // processo diagonal secundaria
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(
                        linha == matriz.length - coluna - 1
                ){
                    diagonalSecundaria[coluna] = matriz[linha][coluna];
                    somaDiagonalSecundaria += matriz[linha][coluna];
                    produtoDiagonalSecundaria *= matriz[linha][coluna];
                }
            }
        }

        // resultados diagonal principal
        System.out.printf("%nDiagonal Principal: ");
        for(int coluna = 0; coluna < diagonalPrincipal.length; coluna++){
            System.out.printf("%d   ", diagonalPrincipal[coluna]);
        }

        System.out.printf("%nSoma Diagonal Principal: %d", somaDiagonalPrincipal);
        System.out.printf("%nProduto Diagonal Principal: %d", produtoDiagonalPrincipal);

        // resultados diagonal secundaria
        System.out.printf("%n%nDiagonal Secundaria: ");
        for(int coluna = 0; coluna < diagonalSecundaria.length; coluna++){
            System.out.printf("%d   ", diagonalSecundaria[coluna]);
        }

        System.out.printf("%nSoma Diagonal Secundaria: %d", somaDiagonalSecundaria);
        System.out.printf("%nProduto Diagonal Secundaria: %d%n", produtoDiagonalSecundaria);

    }
}
