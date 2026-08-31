package net.lucianodacunha.aula41;

/**
 * aula-41
 */
public class ArraysMultis2 {
    public static void main(String[] args) {
        int[][] am = new int[2][3];
        am[0][0] = 22;
        am[0][1] = 11;
        am[0][2] = 54;
        am[1][0] = 44;
        am[1][1] = 55;
        am[1][2] = 76;

        for(int linha = 0; linha < am.length; linha++){
            for(int coluna = 0; coluna < am[linha].length; coluna++){
                System.out.printf("%d ", am[linha][coluna]);
            }
            System.out.println();
        }
    }
}
