package net.lucianodacunha.aula24; /**
 * aula-24
 * Receba um numero inteiro do usuario e imprima o dia da semana correspondente.
 * 1 - domingo
 * ...
 * 7 - sabado
 */
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com um valor [1-7]: ");
        int diaDaSemanaValor = entrada.nextInt();
        String diaDaSemanaTexto;

        if (diaDaSemanaValor == 1){
            diaDaSemanaTexto = "Domingo";
        } else if (diaDaSemanaValor == 2){
            diaDaSemanaTexto = "Segunda-Feira";
        } else if (diaDaSemanaValor == 3){
            diaDaSemanaTexto = "Terca-Feira";
        } else if (diaDaSemanaValor == 4){
            diaDaSemanaTexto = "Quarta-Feira";
        } else if (diaDaSemanaValor == 5){
            diaDaSemanaTexto = "Quinta-Feira";
        } else if (diaDaSemanaValor == 6){
            diaDaSemanaTexto = "Sexta-Feira";
        } else if (diaDaSemanaValor == 7){
            diaDaSemanaTexto = "Sabado";
        } else {
            diaDaSemanaTexto = "Valor Invalido";
        }

        System.out.println(diaDaSemanaTexto);

    }
}
