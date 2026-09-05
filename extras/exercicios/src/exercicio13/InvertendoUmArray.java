package exercicio13;

/**
 * Crie um array contendo dez números.
 *
 * Depois exiba os valores na ordem original e na ordem inversa.
 * Exemplo
 *
 * Original:
 *
 * 1 2 3 4 5
 *
 * Invertido:
 *
 * 5 4 3 2 1
 *
 * Desafio
 *
 * Crie um segundo array para armazenar os valores invertidos.
 * Objetivo
 *
 * Praticar:
 *
 *     Arrays
 *     Índices
 *     length
 *     for
 *     Acesso reverso aos elementos
 */
public class InvertendoUmArray {
    public static void main(String[] args) {
        int[] arrayOriginal = new int[]{1, 12, 23, 27, 30, 107, 32, 63, 70, 31};
        int[] arrayInvertido = new int[10];

        // array original
        System.out.println("Original: ");
        for(int i = 0; i < arrayOriginal.length; i++){
            System.out.printf("%d ", arrayOriginal[i]);
        }

        // array invertido
        // criando
        for(int i = 1; i <= arrayOriginal.length; i++){
            arrayInvertido[i-1] = arrayOriginal[arrayOriginal.length - i];
        }

        // exibindo
        System.out.println("\nInvertido: ");
        for(int i = 0; i < arrayInvertido.length; i++){
            System.out.printf("%d ", arrayInvertido[i]);
        }
    }
}
