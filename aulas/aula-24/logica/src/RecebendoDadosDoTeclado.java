/**
 * aula 19
 */

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com seu nome: ");
        String nome = entrada.next();
        System.out.println("Seja bem-vindo " + nome);
        System.out.print("Entre com sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Sua idade e " + idade);
    }
}
