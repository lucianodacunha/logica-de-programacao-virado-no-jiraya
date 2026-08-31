public class CondicionaisAula1 {
    public static void main(String[] args) {

            boolean condicao = false;
            String mensagem = null;

            if (condicao) {
                System.out.println("Condicao " + condicao);
                mensagem = "Condição era true";
            } else {
                System.out.println("Condicao " + condicao);
                mensagem = "Condição era false";
            }

        System.out.println("Resultado: " + mensagem);
    }
}
