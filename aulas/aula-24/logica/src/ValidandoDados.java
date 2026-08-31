/**
 * aula 21
 * Verifica se o valor digitado pelo usuario e invalido.
 */

import java.util.Scanner;

public class ValidandoDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o nome: ");
        String nome = entrada.nextLine();
        if (nome == null || nome == "" || nome.isEmpty()){
            System.out.println("Nome digitado invalido!");
        } else {
            System.out.println("Nome digitado: " + nome);
        }
    }
}
