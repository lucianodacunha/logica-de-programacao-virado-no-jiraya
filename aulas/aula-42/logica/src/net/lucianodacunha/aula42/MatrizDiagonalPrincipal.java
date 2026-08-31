package net.lucianodacunha.aula42;

import java.sql.SQLOutput;

/**
 * aula-42
 * Calcule a multiplicacao dos elementos da diagonal principal de uma matriz.
 */
public class MatrizDiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        String diagonalPrincipal = "";
        int produtoDiagonalPrincipal = 1;

        System.out.println("Matriz Quadrada");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%d    ", matriz[linha][coluna]);
                if (linha == coluna) {
                    diagonalPrincipal += matriz[linha][coluna] + " ";
                    produtoDiagonalPrincipal *= matriz[linha][coluna];
                }
            }
            System.out.println();
        }

        System.out.printf("Diagonal Principal: %s\n" +
                "Produto Diagonal Principal: %d",
                diagonalPrincipal, produtoDiagonalPrincipal);
    }
}
