package net.lucianodacunha.aula26;

/**
 * aula-26
 * Receba um numero inteiro do usuario e imprima o dia da semana correspondente.
 * 1 - domingo
 * ...
 * 7 - sabado
 */
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorInformado;
        String diaDaSemana;

        System.out.print("Entre com o valor desejado: ");
        valorInformado = entrada.nextInt();

        switch (valorInformado){
            case 1: diaDaSemana = "Domingo"; break;
            case 2: diaDaSemana = "Segunda-Feira"; break;
            case 3: diaDaSemana = "Terca-Feira"; break;
            case 4: diaDaSemana = "Quarta-Feira"; break;
            case 5: diaDaSemana = "Quinta-Feira"; break;
            case 6: diaDaSemana = "Sexta-Feira"; break;
            case 7: diaDaSemana = "Sabado"; break;
            default: diaDaSemana = "Valor Invalido";
        }

        System.out.println(diaDaSemana);
    }
}
