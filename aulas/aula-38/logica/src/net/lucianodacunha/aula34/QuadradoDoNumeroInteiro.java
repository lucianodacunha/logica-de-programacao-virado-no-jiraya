package net.lucianodacunha.aula34;

/**
 * aula-34
 */

public class QuadradoDoNumeroInteiro {
    public static void main(String[] args) {
        for (int i = 15, x = 0; i <= 200; i++, x++){
            if (x % 20 == 0) {
                System.out.println();
            }
            System.out.print( (i * i) + " ");
        }
    }
}
