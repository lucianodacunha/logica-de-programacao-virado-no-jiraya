package exercicio14;

/**
 * Crie um array contendo dez números inteiros.
 *
 * Solicite ao usuário um número para pesquisar.
 *
 * O programa deverá informar:
 *
 *     Se o número existe.
 *     Em qual posição ele foi encontrado.
 *
 * Exemplo
 *
 * Array:
 *
 * 10 20 30 40 50
 *
 * Digite um número: 30
 *
 * Número encontrado!
 * Índice: 2
 *
 * Desafio
 *
 * Caso o número apareça várias vezes, informe todas as posições.
 * Objetivo
 *
 * Praticar:
 *
 *     Arrays
 *     Busca
 *     Índices
 *     for
 *     Condições
 */
import java.util.Scanner;

public class PesquisaEmArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[]{1, 45, 56, 59, 96, 38, 53, 24, 50, 56};

        System.out.print("Digite um numero: ");
        int numeroProcurado = entrada.nextInt();

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == numeroProcurado){
                System.out.printf(
                        "%nNumero encontrado!" +
                        "%nIndice: %d", i);
            }
        }

        entrada.close();
    }
}
