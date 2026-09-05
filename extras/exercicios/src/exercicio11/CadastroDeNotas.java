package exercicio11;

/**
 * Crie um array para armazenar cinco notas de um aluno.
 *
 * Solicite as notas ao usuário.
 *
 * Depois:
 *
 *     Exiba todas as notas.
 *     Calcule a soma.
 *     Calcule a média.
 *     Encontre a maior nota.
 *     Encontre a menor nota.
 *     Informe quantas notas estão acima da média.
 *
 * Exemplo
 *
 * Notas:
 *
 * 8
 * 7
 * 9
 * 6
 * 10
 *
 * Maior nota: 10
 * Menor nota: 6
 * Soma: 40
 * Média: 8
 * Notas acima da média: 2
 *
 * Objetivo
 *
 * Praticar:
 *
 *     Arrays
 *     Índices
 *     length
 *     for
 *     Acumuladores
 *     Comparações
 */
import java.util.Scanner;

public class CadastroDeNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[5];
        double maior;
        double menor;
        double soma = 0.0;
        double media;
        int notasAcimaDaMedia = 0;

        System.out.println("Digite as 5 notas do aluno:");

        // entrada das notas
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Nota %d: ", (i+1));
            notas[i] = entrada.nextDouble();
        }

        // soma das notas
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        // media das notas
        media = soma / notas.length;

        // notas acima da media
        for(int i = 0; i < notas.length; i++){
            if (notas[i] > media){
                notasAcimaDaMedia++;
            }
        }

        // menor e maior
        menor = notas[0];
        maior = notas[0];
        for(int i = 1; i < notas.length; i++){
            if (notas[i] < menor){
                menor = notas[i];
            }
            if (notas[i] > maior){
                maior = notas[i];
            }
        }

        // exibindo as notas
        System.out.printf("%nNotas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.printf("%.2f ", notas[i]);
        }

        // exibindo estatisticas
        System.out.printf(
                "%nMenor: %.2f" +
                "%nMaior: %.2f" +
                "%nSoma: %.2f" +
                "%nMedia: %.2f" +
                "%nNotas Acima da Media: %d",
                menor, maior, soma, media, notasAcimaDaMedia
        );

        entrada.close();
    }
}
