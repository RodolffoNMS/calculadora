package calculadora.handlers;

public class OperacoesVetorHandler {
    private static final int TAMANHO_MAXIMO = 15;

    // Método para criar um vetor com validação de tamanho e valores
    public int[] criarVetor(int tamanho, int[] valores) {
        if (tamanho <= 0 || tamanho > TAMANHO_MAXIMO) {
            throw new IllegalArgumentException("Tamanho do vetor inválido. Deve ser entre 1 e " + TAMANHO_MAXIMO + ".");
        }
        if (valores.length != tamanho) {
            throw new IllegalArgumentException("Número de valores fornecidos não corresponde ao tamanho do vetor.");
        }
        return valores;
    }

    // Método para imprimir o vetor usando um loop for
    public void imprimirVetorComFor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    // Método para imprimir o vetor usando um loop while
    public void imprimirVetorComWhile(int[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.println(vetor[i]);
            i++;
        }
    }

    // Método para imprimir o vetor usando um loop do-while
    public void imprimirVetorComDoWhile(int[] vetor) {
        int i = 0;
        do {
            System.out.println(vetor[i]);
            i++;
        } while (i < vetor.length);
    }
}
