package net.lucianodacunha.aula18;

/**
 * aula-18
 * Eu, como usuario, gostaria de ter o nome e a idade de participantes de um
 * torneio de natacao e que o sistema imprimisse da seguinte forma:
 * - menor que 10 anos: [nome] participara da categoria infantil.
 * - entre 11 e 15 anos: [nome] participara d categoria juvenil.
 * - entre 16 e 19 anos: [nome] participara d categoria pre-adulto.
 * - acima de 20 anos: [nome] participara d categoria adulto.
 * Para que eu possa rapidamente classificar todos os participantes.
 */
public class ImprimeParticipantesPorIdade {
    public static void main(String[] args) {
        String nome = "Luciano";
        int idade = 18;
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