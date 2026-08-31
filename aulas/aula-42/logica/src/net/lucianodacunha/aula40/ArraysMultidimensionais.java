package net.lucianodacunha.aula40;

import java.util.Scanner;

/**
 * aula-40
 */
public class ArraysMultidimensionais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // representada pelos indices [linha][coluna]
        int[][] arrayMulti = new int[2][3];

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                arrayMulti[linha][coluna] = entrada.nextInt();
            }
        }

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.printf("%d", arrayMulti[linha][coluna]);
            }
            System.out.println();
        }


    }
}
