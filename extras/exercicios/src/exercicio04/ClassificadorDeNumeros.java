package exercicio04;

/**
 * @author luciano
 *
 * Leia três números inteiros.
 *
 * O programa deve informar:
 *
 *     O maior número.
 *     O menor número.
 *     Se existem números iguais.
 *     Quais números são positivos.
 *     Quais números são negativos.
 *     Quais números são iguais a zero.
 *
 * Exemplo
 *
 * Número 1: 10
 * Número 2: -5
 * Número 3: 10
 *
 * Maior: 10
 * Menor: -5
 * Existem números iguais.
 *
 * Objetivo
 *
 * Praticar:
 *
 *     if
 *     else
 *     Operadores relacionais
 *     Operadores lógicos
 *     Comparação entre múltiplos valores
 */
import java.util.Scanner;

public class ClassificadorDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];
        String numerosPositivos = "";
        String numerosNegativos = "";
        String numerosIguaisAZero = "";
        String numerosIguais = "Nao existem numeros iguais.";
        int maior = 0;
        int menor = 0;

        System.out.println("Entre com 3 numeros inteiros: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Numero %d: ", (i+1));
            numeros[i] = entrada.nextInt();

            // Coletando numeros positivos, negativos ou 0
            if(numeros[i] > 0){
                numerosPositivos += numeros[i] + " ";
            } else if (numeros[i] < 0){
                numerosNegativos += numeros[i] + " ";
            } else {
                numerosIguaisAZero += numeros[i] + " ";
            }

            // Avaliando o maior e menor numeros
            if (i == 0){
                maior = numeros[0];
            } else {
                if (numeros[i] > maior){
                    maior = numeros[i];
                }
            }

            if (i == 0){
                menor = numeros[0];
            } else {
                if (numeros[i] < menor){
                    menor = numeros[i];
                }
            }
        }

        if (numeros[0] == numeros[1] || numeros[0] == numeros[2] ||
            numeros[1] == numeros[2]){
            numerosIguais = "Existem numeros iguais.";
        }

        System.out.printf("Maior: %d" +
                "\nMenor: %d" +
                "\nNumeros positivos: %s" +
                "\nNumeros negativos: %s" +
                "\nNumeros iguais a zero: %s" +
                "\n%s", maior, menor, numerosPositivos, numerosNegativos,
                numerosIguaisAZero, numerosIguais);

    }
}
