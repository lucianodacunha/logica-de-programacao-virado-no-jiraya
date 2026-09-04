package exercicio07;

/**
 * Crie um programa que leia números inteiros continuamente.
 *
 * O programa deverá parar quando o usuário digitar 0.
 *
 * Ao final, informe:
 *
 *     Quantidade de números digitados.
 *     Soma dos números.
 *     Média dos números.
 *
 * Exemplo
 *
 * Digite um número: 10
 * Digite um número: 20
 * Digite um número: 30
 * Digite um número: 0
 *
 * Quantidade: 3
 * Soma: 60
 * Média: 20
 *
 * Desafio
 *
 * Também informe:
 *
 *     Maior número.
 *     Menor número.
 *
 * Objetivo
 *
 * Praticar:
 *
 *     while
 *     Entrada de dados
 *     Contadores
 *     Acumuladores
 *     Condições
 */
import java.util.Scanner;

public class SomaAteZero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int quantidade = 0;
        int soma = 0;
        double media = 0.0;
        int maior = 0;
        int menor = 0;

        do {
            System.out.print("Digite um numero (0 para sair): ");
            numero = entrada.nextInt();
            if (numero != 0){
                quantidade++;
                soma += numero;
                if (quantidade == 1) {
                    maior = numero;
                    menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
        } while (numero != 0);

        entrada.close();

        if (quantidade > 0){
            media = (double) soma / quantidade;
            System.out.printf(
                    "%nQuantidade %d%n" +
                    "Soma %d%n" +
                    "Media: %.2f%n" +
                    "Maior: %d%n" +
                    "Menor: %d%n",
                    quantidade, soma, media, maior, menor);
        }
    }
}
