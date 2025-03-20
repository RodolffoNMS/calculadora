package calculadora.vetor;

public class OperacoesVetor {
    private static final int TAMANHO_MAXIMO = 15;

    public int[] criarVetor(int tamanho, int[] valores) {
        if (tamanho <= 0 || tamanho > TAMANHO_MAXIMO) {
            throw new IllegalArgumentException("Tamanho do vetor inválido. Deve ser entre 1 e " + TAMANHO_MAXIMO + ".");
        }
        if (valores.length != tamanho) {
            throw new IllegalArgumentException("Número de valores fornecidos não corresponde ao tamanho do vetor.");
        }
        return valores;
    }

    public void imprimirVetorComFor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void imprimirVetorComWhile(int[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.println(vetor[i]);
            i++;
        }
    }

    public void imprimirVetorComDoWhile(int[] vetor) {
        int i = 0;
        do {
            System.out.println(vetor[i]);
            i++;
        } while (i < vetor.length);
    }
}
