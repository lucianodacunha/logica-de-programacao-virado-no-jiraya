package net.lucianodacunha.aula35;

/**
 * aula-35
 * Gerar tabuadas de 1 a 10 utilizando o loop for.
 */

public class Tabuadas {
    public static void main(String[] args) {
        System.out.println("Tabuada - Multiplicacao");
        for(int tabuada = 1; tabuada <= 10; tabuada++){
            for(int linha = 1; linha <= 10; linha++){
                System.out.println(
                        tabuada + " X " + linha + " = " + (tabuada * linha));

            }
            System.out.println();
        }
    }
}
