package net.lucianodacunha.aula32;

/**
 * aula-32
 * Escreve um jogo de adivinhacao, onde o usuario tera 3 chances de adivinhar o
 * numero secreto.
 * A cada palpite, o jogo exibirá se o valor é correto, menor ou maior.
 */
import java.util.Scanner;

public class TestandoDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite;
        int NUMERO_SECRETO = 42;
        int tentativa = 1;
        int tentativas = 3;
        boolean acertou = false;
        String mensagemFinal;
        do {
            System.out.print("Entre com o seu palpite (" + tentativa + "): ");
            palpite = entrada.nextInt();
            if (palpite == NUMERO_SECRETO){
                mensagemFinal = "Parabens, vc acertou o numero secreto!";
                acertou = true;
            } else if (palpite < NUMERO_SECRETO) {
                System.out.println(
                        "O valor informado e menor que o numero secreto. " +
                        "Vc tem mais " +
                        (tentativas - tentativa) +
                        " tentativas");
            } else {
                System.out.println(
                        "O valor informado e maior que o numero secreto. " +
                                "Vc tem mais " +
                                (tentativas - tentativa) +
                                " tentativas");
            }
            tentativa++;
        } while ((tentativa <= tentativas) && !acertou);

        if (acertou){
            mensagemFinal = "Parabens, vc acertou o numero secreto!";
        } else {
            mensagemFinal = "Fim de jogo. O numero secreto e " + NUMERO_SECRETO;
        }

        System.out.println(mensagemFinal);
    }
}
