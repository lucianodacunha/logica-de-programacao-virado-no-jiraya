package net.lucianodacunha.aula22;
/**
 * aula-22
 * Eu, como administrador do sistema, gostaria de permitir, que os proprios
 * usuarios cadastrassem o nome de usuario (login) no sistema, para agilizar o
 * processo de migracao, do sistema antigo para o novo.
 * O usuario nao pode deixar o vazio "", ou criar um usuario com o login "admin"
 * ou "administrador".
 * Se o valor entrado for valido, o sistema devera exibir uma mensagem
 * [nome do usuario] cadastrado com sucesso.
 * Senao, o sistema devera mostrar o erro "Usuario invalido"
 */
import java.util.Scanner;

public class ValidandoLogin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String erro;

        System.out.print("Entre com seu novo nome de usuario: ");
        String username = entrada.nextLine();

        if (username == null){
            erro = "String nula.";
            System.out.println("Erro: " + erro +
                    "\nUsuario invalido!");
        } else if (username.isEmpty() || username.isBlank()){
            erro = "String vazia, valor 0 ou somente espacos em branco.";
            System.out.println("Erro: " + erro +
                    "\nUsuario invalido!");
        } else if (username.equals("admin")) {
            erro = "String utiliza palavra reservada 'admin'.";
            System.out.println("Erro: " + erro +
                    "\nUsuario invalido!");
        } else if (username.equals("administrador")) {
            erro = "String utiliza palavra reservada 'administrador'.";
            System.out.println("Erro: " + erro +
                    "\nUsuario invalido!");
        } else {
            System.out.println("<" + username + ">" +
                    " usuario cadastrado com sucesso");
        }
    }
}
