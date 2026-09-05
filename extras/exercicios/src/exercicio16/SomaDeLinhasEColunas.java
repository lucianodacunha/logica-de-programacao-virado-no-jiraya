package exercicio16;

/**
 * Crie uma matriz 3x3.
 *
 * Preencha a matriz com valores informados pelo usuário.
 *
 * Depois calcule:
 *
 *     Soma de cada linha.
 *     Soma de cada coluna.
 *     Soma total da matriz.
 *
 * Exemplo
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Resultado:
 *
 * Soma linha 1: 6
 * Soma linha 2: 15
 * Soma linha 3: 24
 *
 * Soma coluna 1: 12
 * Soma coluna 2: 15
 * Soma coluna 3: 18
 *
 * Soma total: 45
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Matrizes
 *     Loops aninhados
 *     Acumuladores
 *     Índices
 *     length
 */
import java.util.Scanner;

public class SomaDeLinhasEColunas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somaDasLinhas = new int[]{0,0,0};
        int[] somaDasColunas = new int[]{0,0,0};
        int somaTotal = 0;

        // entrando com o valores da mariz
        System.out.println("Digite os valores da matriz 3x3:");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.printf("Linha %d, Coluna %d: ", linha+1, coluna+1);
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

         // somando os valores
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                somaTotal += matriz[linha][coluna];
                somaDasLinhas[linha] += matriz[linha][coluna];
                somaDasColunas[coluna] += matriz[linha][coluna];
            }
        }

        // exibindo os valores
        for (int linha = 0; linha < somaDasLinhas.length; linha++) {
            System.out.printf(
                    "%nSoma da linha %d: %d",
                    linha+1, somaDasLinhas[linha]
            );
        }

        System.out.println(" ");
        for (int coluna = 0; coluna < somaDasColunas.length; coluna++) {
            System.out.printf(
                    "%nSoma da coluna %d: %d",
                    coluna+1, somaDasColunas[coluna]
            );
        }

        System.out.printf("%n%nSoma Total: %d", somaTotal);

        entrada.close();
    }
}
