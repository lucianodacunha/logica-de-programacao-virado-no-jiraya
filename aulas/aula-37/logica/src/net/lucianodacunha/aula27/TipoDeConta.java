package net.lucianodacunha.aula27;

/**
 * Como gerente, eu gostaria que meus usuarios pudessem digitar o tipo de conta
 * e o sistema imprimir qual a porcentagem de juros que aquela conta ira
 * oferecer. Os tipos de contas sao:
 * 1 - POUPANCA: 0.05%
 * 2 - CORRENTE: 0.02%
 * 3 - INVESTIMENTO: 0.10%
 */
import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(
                "TIPOS DE CONTAS" +
                "\n1 - POUPANCA" +
                "\n2 - CORRENTE" +
                "\n3 - INVESIMENTO"
        );
        System.out.print("Entre com o tipo da conta desejado [1-3]: ");
        int tipoInformado = entrada.nextInt();
        String percentualDeJuros;

        switch (tipoInformado) {
            case 1: percentualDeJuros = "0.05%"; break;
            case 2: percentualDeJuros = "0.02%"; break;
            case 3: percentualDeJuros = "0.10%"; break;
            default: percentualDeJuros = "Valor invalido";
        }

        System.out.println("Percentual de Juros: " + percentualDeJuros);
    }
}
