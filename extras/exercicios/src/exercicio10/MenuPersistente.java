package exercicio10;

/**
 * Crie um programa que apresente continuamente um menu.
 *
 * Exemplo:
 *
 * ===== MENU =====
 *
 * 1 - Exibir números de 1 a 10
 * 2 - Exibir números pares de 1 a 10
 * 3 - Exibir números ímpares de 1 a 10
 * 4 - Sair
 *
 * Escolha uma opção:
 *
 * Cada opção deverá executar uma ação diferente.
 *
 * O programa só deverá terminar quando o usuário escolher 4.
 * Requisitos
 *
 * Utilize:
 *
 *     do-while
 *     switch
 *     for
 *     if
 *
 * Objetivo
 *
 * Este exercício combina diversos conceitos estudados no curso.
 */
import java.util.Scanner;

public class MenuPersistente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.print(
                    "===== MENU =====\n" +
                            "\n" +
                            "1 - Exibir números de 1 a 10\n" +
                            "2 - Exibir números pares de 1 a 10\n" +
                            "3 - Exibir números ímpares de 1 a 10\n" +
                            "4 - Sair\n" +
                            "\n" +
                            "Escolha uma opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d ", i);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d ", i);
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%d ", i);
                        }
                    }
                    break;
                case 4:
                    sair = true;
                    break;
            }
            System.out.println("\n");
        } while (!sair);

        entrada.close();
    }
}
