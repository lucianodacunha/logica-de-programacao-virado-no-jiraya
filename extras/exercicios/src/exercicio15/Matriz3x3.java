package exercicio15;

/**
 * Crie uma matriz 3x3 de números inteiros.
 *
 * Solicite ao usuário todos os valores.
 *
 * Depois exiba a matriz formatada.
 * Exemplo
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Requisito
 *
 * Utilize dois loops:
 *
 * for externo → linhas
 * for interno → colunas
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Arrays multidimensionais
 *     Matrizes
 *     Índices
 *     Loops aninhados
 */
import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // entrando com os valores
        System.out.println("Digite os valores da matriz 3X3:");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("Linha %d, Coluna %d: ", linha, coluna);
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        // exibindo os valores
        System.out.println("\nMatriz:");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("%d ", matriz[linha][coluna]);
            }
            System.out.printf("%n");
        }

        entrada.close();
    }
}
