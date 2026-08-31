package net.lucianodacunha.aula39;

/**
 * aula-39
 * Armazenar em dois vetores V1 e V2, nove valores numericos inteiros e exibir o
 * resultado da multiplicacao dos numeros do V1 com os correspondentes em V2.
 */

public class ArmazenarValores {
    public static void main(String[] args) {
        int[] V1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] V2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] VR = new int[9];

        for(int i = 0; i < 9; i++){
            VR[i] = V1[i] * V2[i];
        }

        for(int i = 0; i < 9; i++){
            System.out.print(VR[i] + " ");
        }
    }
}
