package net.lucianodacunha.aula37;

import java.util.Scanner;

public class NotasComArrays {
    public static void main(String[] args) {
        double[] notas = new double[5]; // sintaxe de declaracao
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }

        System.out.println("Notas: " +
                "\nNota 1: " + notas[0] +
                "\nNota 2: " + notas[1] +
                "\nNota 3: " + notas[2]
        );
    }
}
