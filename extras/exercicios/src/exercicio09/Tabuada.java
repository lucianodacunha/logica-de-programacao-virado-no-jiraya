package exercicio09;

/**
 * Solicite ao usuário um número.
 *
 * Exiba sua tabuada de 1 até 10.
 * Exemplo
 *
 * Digite um número: 7
 *
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63
 * 7 x 10 = 70
 *
 * Desafio
 *
 * Crie um menu permitindo escolher:
 *
 * 1 - Somar
 * 2 - Subtrair
 * 3 - Multiplicar
 * 4 - Dividir
 *
 * E utilize a estrutura de repetição para aplicar a operação de 1 até 10.
 * Objetivo
 *
 * Praticar:
 *
 *     for
 *     Operações aritméticas
 *     Entrada de dados
 *     switch
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        System.out.printf(
                "Escolha uma operacao:%n" +
                "1 - Somar%n" +
                "2 - Subtrair%n" +
                "3 - Multiplicar%n" +
                "4 - Dividir%n" +
                "> "
        );

        int operacao = entrada.nextInt();
        System.out.println(" ");

        switch(operacao) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d + %d = %d%n", numero, i, (numero + i));
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d - %d = %d%n", numero, i, (numero - i));
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d * %d = %d%n", numero, i, (numero * i));
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d / %d = %d%n", numero, i, (numero / i));
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }

        entrada.close();
    }
}
