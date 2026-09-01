package exercicio02;

/**
 * Crie um programa que armazene o valor de um salário.
 *
 * Calcule:
 *
 *     30% do salário
 *     15% do salário
 *     5% do salário
 *
 * A cada cálculo, armazene o resultado em uma variável.
 *
 * Depois:
 *
 *     Exiba o resultado.
 *     Reutilize a variável que armazenou o resultado.
 *     Utilize-a para realizar o próximo cálculo.
 *
 * Exemplo
 *
 * Salário: R$ 3000.00
 *
 * 30%: R$ 900.00
 * 15%: R$ 450.00
 * 5%: R$ 150.00
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Variáveis
 *     Operadores aritméticos
 *     Reutilização de variáveis
 *     Atribuição
 */
import java.util.Scanner;

public class CalculadoraDeSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] percetuaisDoSalario = new double[]{0.3, 0.15, 0.05};
        double percentualCalculado;

        System.out.print("Entre com o valor do salario: ");
        double salario = entrada.nextDouble();
        for(int i = 0; i < percetuaisDoSalario.length; i++){
            percentualCalculado = salario * percetuaisDoSalario[i];
            System.out.printf("%.0f%%: R$ %.2f\n",
                    (percetuaisDoSalario[i] * 100), percentualCalculado);
        }

    }
}
