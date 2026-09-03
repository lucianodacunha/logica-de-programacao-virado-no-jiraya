package exercicio06;

/**
 * Solicite ao usuário um número inteiro N.
 *
 * Percorra todos os números de 0 até N.
 *
 * Para cada número, informe se ele é:
 *
 *     Par
 *     Ímpar
 *
 * Utilize o operador %.
 * Exemplo
 *
 * Para:
 *
 * N = 10
 *
 * Resultado:
 *
 * 0 - Par
 * 1 - Ímpar
 * 2 - Par
 * 3 - Ímpar
 * ...
 * 10 - Par
 *
 * Desafio
 *
 * Ao final, informe:
 *
 *     Quantidade de números pares.
 *     Quantidade de números ímpares.
 *
 * Objetivo
 *
 * Praticar:
 *
 *     for
 *     Operador %
 *     if
 *     Contadores
 */
import java.util.Scanner;

public class NumerosParesEImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNumerosPares = 0;
        int quantidadeDeNumerosImpares = 0;
        System.out.print("Entre com um numero inteiro [0-100]: ");
        int numero = entrada.nextInt();

        for(int i = 0; i <= numero; i++){
            if (i % 2 == 0){
                quantidadeDeNumerosPares++;
                System.out.printf("%d - Par%n", i);
            } else {
                quantidadeDeNumerosImpares++;
                System.out.printf("%d - Impar%n", i);
            }
        }

        System.out.printf(
                "Quantidade de Numeros Pares: %d%n" +
                "Quantidade de Numeros Impares: %d%n",
                quantidadeDeNumerosPares, quantidadeDeNumerosImpares);

        entrada.close();
    }
}
