package net.lucianodacunha.aula11;

/**
 * aula-11
 * Crie uma variavel que ira guardar o valor de um salario.
 * Calcule a porcentagem desse salario, sendo os valores da porcentagem:
 * - 30%
 * - 15%
 * - 5%
 * A cada vez que voce calcular guarde o restulado em uma variavel.
 * Imprima o resultado e reutilize a variavel que guardao resultado para o novo
 * calculo.
 */

public class CalculandoPercentuaisDeSalarios {
    public static  void main(String[] args){

        double valorDoSalario = 6000.0;
        System.out.println("Valor do salario " + valorDoSalario);
        double resultado = valorDoSalario * 0.3;
        System.out.println("30% do salario: " + resultado);
        resultado = valorDoSalario * 0.15;
        System.out.println("15% do salario: " + resultado);
        resultado = valorDoSalario * 0.05;
        System.out.println("5% do salario: " + resultado);
    }
}
