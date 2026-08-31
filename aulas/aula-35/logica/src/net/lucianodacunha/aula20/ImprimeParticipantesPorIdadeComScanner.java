package net.lucianodacunha.aula20;
/**
 * aula-20
 * Eu, como usuario, gostaria de ter o nome e a idade de participantes de um
 * torneio de natacao e que o sistema imprimisse da seguinte forma:
 * - menor que 10 anos: [nome] participara da categoria infantil.
 * - entre 11 e 15 anos: [nome] participara d categoria juvenil.
 * - entre 16 e 19 anos: [nome] participara d categoria pre-adulto.
 * - acima de 20 anos: [nome] participara d categoria adulto.
 * Para que eu possa rapidamente classificar todos os participantes.
 */
import java.util.Scanner;

public class ImprimeParticipantesPorIdadeComScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o nome do participante: ");
        String nome = entrada.next();
        System.out.print("Entre com a idade do participante: ");
        int idade = entrada.nextInt();
        String categoria = null;

        if (idade <= 10){
            categoria = "infantil";
        } else if (idade >= 11 && idade <= 15){
            categoria = "juvenil";
        } else if (idade >= 16 && idade <= 19){
            categoria = "pre-adulto";
        } else {
            categoria = "adulto";
        }

        System.out.println(nome + ", idade: " + idade +
                " anos, participara da categoria " + categoria + ".");
    }
}