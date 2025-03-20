package calculadora;

public class Menu  {

    public void exibirMenu() {
        System.out.println("Escolha a operação desejada: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Operações com Vetor");
        System.out.println("6 - Calcular Idade");
        System.out.println("0 - Sair");
        System.out.print("Digite o número correspondente à operação: ");
    }

    // Método auxiliar para exibir mensagens genéricas (opcional)
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}