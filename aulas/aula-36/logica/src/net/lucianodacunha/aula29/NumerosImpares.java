package net.lucianodacunha.aula29;

/**
 * aula-29
 * Imprimir numeros impares de 0 ate o valor fornecido pelo usuario.
 */
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o valor limite: ");
        int valorLimite = entrada.nextInt();
        int valorAtual = 0;

        while(valorAtual <= valorLimite){
            if (valorAtual % 2 != 0){
                System.out.print(valorAtual + " ");
            }
            valorAtual++;
        }
    }
}
