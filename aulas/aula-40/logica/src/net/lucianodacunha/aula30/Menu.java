package net.lucianodacunha.aula30;

/**
 * Como usuario, eu gostaria de ter um menu visual, que seja navegavel atraves
 * de numeros.
 * O menu deve ser exibido da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar salario
 * 3. Sair
 *
 * O menu deve ficar disponivel enquanto eu nao digitar o numero 3.
 * Dessa forma, o sistema ficara em execucao, evitando ter que ser reiniciado a
 * cada operacao.
 */
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println(
                    "1. Calcular imposto" +
                    "\n2. Depositar salario" +
                    "\n3. Sair");
            System.out.print("Entre com a opcao desejada [1-3]: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Calculando imposto...");
                    break;
                case 2:
                    System.out.println("Depositando salario...");
                    break;
                case 3:
                    System.out.println("Finalizando o sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
