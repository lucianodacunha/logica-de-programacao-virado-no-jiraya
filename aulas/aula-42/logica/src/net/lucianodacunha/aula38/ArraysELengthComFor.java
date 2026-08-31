package net.lucianodacunha.aula38;

import java.util.Scanner;

public class ArraysELengthComFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];
        double media = 0.0;

        // inserindo as notas
        for(int i = 0; i < notas.length; i++){
            System.out.print("Entre com o valor da nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // calculando a media
        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }

        // exibindo a media
        System.out.printf("Media Geral: %.2f\n", media);

    }
}
