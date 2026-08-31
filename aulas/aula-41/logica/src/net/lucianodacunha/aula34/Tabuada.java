package net.lucianodacunha.aula34;

/**
 * aula-34
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o numero da tabuada desejada: ");
        int tabuada = entrada.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
