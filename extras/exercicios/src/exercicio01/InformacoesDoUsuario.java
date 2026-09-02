package exercicio01;

/**
 * Crie um programa que armazene informações sobre uma pessoa utilizando
 * diferentes tipos de dados.
 *
 * O programa deve armazenar:
 *
 *     Nome
 *     Idade
 *     Altura
 *     Sexo
 *     Possui carteira de motorista
 *
 * Utilize tipos apropriados para cada informação.
 * Requisitos
 *
 * Utilize pelo menos:
 *
 *     String
 *     int
 *     double
 *     char
 *     boolean
 *
 * Ao final, imprima todas as informações.
 * Exemplo
 *
 * Nome: João
 * Idade: 25
 * Altura: 1.75
 * Sexo: M
 * Possui CNH: true
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Variáveis
 *     Tipos primitivos
 *     String
 *     Valores literais
 *     System.out.println()
 */
import java.util.Scanner;
public class InformacoesDoUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserindo dados do Usuario");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Sexo [M/F]: ");
        char sexo = entrada.next().toUpperCase().charAt(0);
        System.out.print("Possui CNH? [true/false]: ");
        boolean temCNH = entrada.nextBoolean();

        System.out.println("\nExibindo dados do Usuario");
        System.out.printf(
                "Nome: %s%n" +
                "Idade: %d%n" +
                "Altura: %.2f%n" +
                "Sexo: %c%n" +
                "CNH: %b%n",
                nome,
                idade,
                altura,
                sexo,
                temCNH
        );

        entrada.close();
    }
}
