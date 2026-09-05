package exercicio12;

/**
 * Crie um array capaz de armazenar dez números inteiros.
 *
 * Solicite os números ao usuário.
 *
 * Depois apresente:
 *
 *     Todos os números.
 *     Apenas os números pares.
 *     Apenas os números ímpares.
 *     Soma dos números.
 *     Média.
 *     Maior número.
 *     Menor número.
 *
 * Requisito
 *
 * Utilize:
 *
 * array.length
 *
 * para controlar os loops.
 *
 * Não utilize manualmente:
 *
 * i < 10
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Arrays
 *     length
 *     Índices
 *     for
 *     %
 *     Acumuladores
 */
import java.util.Scanner;

public class ArrayDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        double media;
        int menor;
        int maior;

        // entrada de dados
        System.out.println("Entre com 10 numeros inteiros: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Numero %d: ", (i+1));
            numeros[i] = entrada.nextInt();
        }

        // exibicao
        // todos os numeros
        System.out.println("\nExibindo os numeros digitados: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }

        // apenas os pares
        System.out.println("\nExibindo os numeros pares: ");
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0)
                System.out.printf("%d ", numeros[i]);
        }

        // apenas os impares
        System.out.println("\nExibindo os numeros impares: ");
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 != 0)
                System.out.printf("%d ", numeros[i]);
        }

        // soma
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.printf("%nExibindo a soma dos numeros: %n%d", soma);

        // media
        media = (double) soma / numeros.length;
        System.out.printf("\nExibindo a media dos numeros: %n%.2f", media);

        // menor e maior
        menor = numeros[0];
        maior = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        System.out.printf("\nExibindo menor numero: %n%d", menor);
        System.out.printf("\nExibindo maior numero: %n%d", maior);

        entrada.close();
    }
}
