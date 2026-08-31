/**
 * Dado um determinado salario:
 * se o salario for maior que 500, imprima 30% do valor
 * senao imprima 15% do valor.
 */
public class CalculaPercentualDeSalariosComIF {
    public static void main(String[] args) {
        double salario = 499.90;
        double resultado = 0.0;
        String mensagem = "Faixa salarial corresponde a ";

        if (salario > 500.0){
            resultado = salario * 0.3;
            mensagem += "30%: $" + resultado;
        } else {
            resultado = salario * 0.15;
            mensagem += "15%: $" + resultado;
        }

        System.out.println("Resultado: " + mensagem);
    }
}
