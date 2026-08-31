/**
 * Dado um numero inteiro, imprima se ele e par ou impar.
 */
public class ImprimeImparOuPar {
    public static void main(String[] args) {
        int numero = 42;

        if ((numero % 2) == 0){
            System.out.println("Numero par: " + numero);
        } else {
            System.out.println("Numero impar: " + numero);
        }
    }
}
