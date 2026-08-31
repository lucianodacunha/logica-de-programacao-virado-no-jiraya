package net.lucianodacunha.aula09;

/**
 * aula-09
 * Crie uma classe chamada net.lucianodacunha.aula09.CalculadorDiferencaIdade
 * Crie uma variavel para guardar a primeira idade
 * Crie uma variavel para guardar a segunda idade
 * Crie uma variavel para guardar a diferenca entre as duas idades
 * Imprima a diferenca no console
 *
 */
public class CalculadorDiferencaIdade {
    public static void main(String[] args){
        int primeiraIdade = 30;
        int segundaIdade = 25;
        int diferencaDeIdades = primeiraIdade - segundaIdade;
        System.out.println(
                "A diferenca entre a primeiraIdade: " +
                        primeiraIdade +
                        " e a segundaIdade: " +
                        segundaIdade +
                        " => " + diferencaDeIdades
        );
    }
}
