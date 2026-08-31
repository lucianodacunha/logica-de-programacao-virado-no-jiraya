import java.util.Locale;
import java.util.Scanner;

/**
 * Crie uma classe que calcule uma determinada porcentagem de um dado salario.
 * Criar uma classe
 * Aceitar um valor de entrada para o salario
 * Definir o valor de porcentagem
 * Calcular a porcentagem
 */
public class CalculaPercentualDeSalario {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Entre com o valor do salario: ");
        double valorInicialDeSalario = entrada.nextDouble();
        double percentual = 0.10;
        double valorCalculado = valorInicialDeSalario * percentual;

        System.out.println("Valor Calculado: " + valorCalculado);

    }
}
