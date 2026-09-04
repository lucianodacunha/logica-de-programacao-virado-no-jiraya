package exercicio08;

/**
 * Crie um jogo no qual um jogador deverá descobrir um número secreto entre 1 e 100.
 *
 * O programa deverá:
 *
 *     Definir um número secreto.
 *     Solicitar um palpite.
 *     Informar se o número secreto é maior ou menor.
 *     Continuar solicitando palpites até acertar.
 *     Contabilizar a quantidade de tentativas.
 *
 * Exemplo
 *
 * Digite seu palpite: 50
 *
 * O número secreto é maior.
 *
 * Digite seu palpite: 75
 *
 * O número secreto é menor.
 *
 * Digite seu palpite: 63
 *
 * Parabéns! Você acertou.
 *
 * Tentativas: 3
 *
 * Desafio
 *
 * Pergunte ao usuário se deseja jogar novamente.
 *
 * Utilize do-while.
 * Objetivo
 *
 * Praticar:
 *
 *     while
 *     do-while
 *     if
 *     Contadores
 *     Entrada de dados
 */
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = 42;
        int palpite;
        char jogarNovamente;
        do {
            int tentativas = 0;
            do {
                System.out.print("Digite seu palpite: ");
                palpite = entrada.nextInt();
                tentativas++;
                if (palpite > numeroSecreto){
                    System.out.println("O numero secreto e menor");
                } else if (palpite < numeroSecreto){
                    System.out.println("O numero secreto e maior");
                } else {
                    System.out.printf(
                            "%nParabens! Voce acertou" +
                            "%nTentativas: %d%n", tentativas);
                }
            } while (palpite != numeroSecreto);

            System.out.printf("%nDeseja jogar novamente? [S/N]: ");
            jogarNovamente = entrada.next().toUpperCase().charAt(0);
            System.out.printf("%n");
        } while (jogarNovamente == 'S');

        entrada.close();
    }
}
