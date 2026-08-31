package net.lucianodacunha.aula31;

/**
 * aula-31
 * Apresentar ao usuario uma tela de login que solicite usuario e senha.
 * Caso o usuario entre com os dados corretos, exibir a mensagem:
 * "ACESSO CONCEDIDO"
 * Do contrario:
 * "ACESSO NEGADO"
 * Repetir a tela ate o usuario acertar os dados de login.
 * Os dados de login devem estar armazenados em suas respectivas constantes.
 */
import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String USUARIO = "admin";
        String SENHA = "123";

        while(true) {
            System.out.println("Login do Sistema");
            System.out.print("Usuario: ");
            String user = entrada.nextLine();
            System.out.print("Senha: ");
            String passw = entrada.nextLine();

            if (USUARIO.equals(user) && SENHA.equals(passw)) {
                System.out.println("ACESSO CONCEDIDO\n");
                break;
            } else {
                System.out.println("ACESSO NEGADO\n");
            }
        }
    }
}
