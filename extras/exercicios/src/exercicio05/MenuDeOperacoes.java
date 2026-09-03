package exercicio05;

/**
 * Crie uma calculadora utilizando um menu.
 *
 * O programa deve apresentar:
 *
 * ===== CALCULADORA =====
 *
 * 1 - Somar
 * 2 - Subtrair
 * 3 - Multiplicar
 * 4 - Dividir
 * 5 - Sair
 *
 * Escolha uma opção:
 *
 * O usuário deverá escolher uma operação.
 *
 * Depois, informe dois números e execute a operação escolhida.
 *
 * Utilize switch.
 * Regras
 *
 *     Não permita divisão por zero.
 *     Caso o usuário informe uma opção inválida, mostre uma mensagem de erro.
 *
 * Desafio
 *
 * Faça o menu continuar aparecendo até que o usuário escolha a opção 5.
 * Objetivo
 *
 * Praticar:
 *
 *     switch
 *     case
 *     break
 *     default
 *     Entrada de dados
 *     Estruturas de repetição
 */
import java.util.Scanner;

public class MenuDeOperacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        boolean sair = false;
        do {
            System.out.printf(
                    "===== CALCULADORA =====%n" +
                            "1 - Somar%n" +
                            "2 - Subtrair%n" +
                            "3 - Multiplicar%n" +
                            "4 - Dividir%n" +
                            "5 - Sair%n%n" +
                            "Escolha uma opcao: "
            );

            int opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Entre com o primeiro numero: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Entre com o segundo numero: ");
                    numero2 = entrada.nextDouble();
                    System.out.printf("%nSoma dos numeros: %.2f%n%n",
                            numero1 + numero2);
                    break;
                case 2:
                    System.out.print("Entre com o primeiro numero: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Entre com o segundo numero: ");
                    numero2 = entrada.nextDouble();
                    System.out.printf("%nSubtracao dos numeros: %.2f%n%n",
                            numero1 - numero2);
                    break;
                case 3:
                    System.out.print("Entre com o primeiro numero: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Entre com o segundo numero: ");
                    numero2 = entrada.nextDouble();
                    System.out.printf("%nMutiplicacao dos numeros: %.2f%n%n",
                            numero1 * numero2);
                    break;
                case 4:
                    System.out.print("Entre com o primeiro numero: ");
                    numero1 = entrada.nextDouble();

                    boolean valorNaoPermitido;
                    do {
                        valorNaoPermitido = false;
                        System.out.print("Entre com o segundo numero: ");
                        numero2 = entrada.nextDouble();
                        if(numero2 ==0){
                            System.out.println("Valor nao permitido, digite" +
                                    "novamente.");
                            valorNaoPermitido = true;
                        }
                    }while(valorNaoPermitido);

                    System.out.printf("%nDivisao dos numeros: %.2f%n%n",
                            numero1 / numero2);
                    break;
                case 5:
                    entrada.close();
                    sair = true;
                    break;
                default:
                    System.out.printf("Opcao invalida%n%n");
            }
        } while (!sair);
    }
}
