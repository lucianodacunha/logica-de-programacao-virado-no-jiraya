package exercicio03;

/**
 * @author Luciano
 *
 * Crie um programa que receba três notas de um aluno.
 *
 * Calcule a média e determine a situação do aluno.
 *
 * Utilize as seguintes regras:
 *
 * Média >= 7     → Aprovado
 * Média >= 5     → Recuperação
 * Média < 5      → Reprovado
 *
 * Requisito adicional
 *
 * As notas devem estar entre 0 e 10.
 *
 * Caso uma nota seja inválida, informe o usuário.
 * Exemplo
 *
 * Nota 1: 8
 * Nota 2: 7
 * Nota 3: 9
 *
 * Média: 8.0
 * Situação: Aprovado
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Entrada de dados
 *     Operadores
 *     if
 *     else if
 *     else
 *     Comparações
 */
import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        // Declaracao e inicializacao
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0.0;
        double media = 0.0;
        String resultado;
        boolean notaInvalida = true;

        // Insercao de notas
        System.out.println("Entre com as notas do aluno:");
        for(int i = 0; i < notas.length; i++){
            while(notaInvalida){
                System.out.printf("Nota %d: ", (i+1));
                notas[i] = entrada.nextDouble();
                // Verificacao de nota
                if(notas[i] >= 0 && notas[i] <= 10){
                    break;
                } else {
                    System.out.println("Nota invalida, digite novamente.");
                }
            }
        }

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;

        System.out.printf("\nMedia: %.2f\n", media);

        if (media >= 7){
            resultado = "Aprovado";
        } else if(media >= 5) {
            resultado = "Recuperacao";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("Situacao: " + resultado);
    }
}
