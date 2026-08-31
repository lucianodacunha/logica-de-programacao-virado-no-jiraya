/**
 * Receber uma idade.
 * Se a idade for maior que 18, imprimir que a pessoa e adulta.
 * Caso contrario, informar que ainda nao e adulta.
 */
public class VerficaIdade {
    public static void main(String[] args) {
        int idade = 17;

        if (idade > 18){
            System.out.println("Já e adulto");
        } else {
            System.out.println("Ainda nao e adulta");
        }
    }
}
