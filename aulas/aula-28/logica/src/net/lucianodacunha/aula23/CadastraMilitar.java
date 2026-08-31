package net.lucianodacunha.aula23;
/**
 * aula-23
 * Como secretario de alistamento militar, eu gostaria de agilizar o processo de
 * cadastramento de reservistas, para isso, meu sistema devera avaliar os
 * seguintes parametros, de sexo (M/G, idade e imprimir uma mensagem:
 * Masculino e >= 18: Alistamento obrigatorio.
 * Masculino e < 18: Alistamento nao permitido.
 * Feminino e >= 18: Deseja se alistar?
 * Feminino e < 18: Alistamento nao permitido.
 */
import java.util.Scanner;

public class CadastraMilitar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o sexo do reservista: ");
        char sexo = entrada.next().charAt(0);
        System.out.print("Qual a idade do reservista: ");
        int idade = entrada.nextInt();

        if (sexo == 'M' && idade >= 18){
            System.out.println("Alistamento obrigatorio");
        } else if ((sexo == 'M' || sexo == 'F') && idade < 18){
            System.out.println("Alistamento nao permitido");
        } else if (sexo == 'F' && idade >= 18){
            System.out.println("Alistamento opcional");
        } else {
            System.out.println("Opcao Invalida!" +
                    "\nSexo: " + sexo +
                    "\nIdade: " + idade);
        }
    }
}
