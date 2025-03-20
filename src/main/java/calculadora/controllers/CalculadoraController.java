package calculadora.controllers;

import calculadora.Menu;
import calculadora.handlers.OperacoesMatematicasHandler;
import calculadora.handlers.OperacoesVetorHandler;

public class CalculadoraController {
    private final OperacoesMatematicasHandler operacoesMatematicasHandler;
    private final OperacoesVetorHandler operacoesVetorHandler;

    public CalculadoraController() {
        this.operacoesMatematicasHandler = new OperacoesMatematicasHandler();
        this.operacoesVetorHandler = new OperacoesVetorHandler();
    }

    public void iniciar(Menu menu) {
        menu.exibirMenu();
    }

    public void processarOperacao(String operacao, double a, double b) {
        switch (operacao) {
            case "adicao":
                System.out.println("Resultado: " + operacoesMatematicasHandler.realizarAdicao(a, b));
                break;
            case "subtracao":
                System.out.println("Resultado: " + operacoesMatematicasHandler.realizarSubtracao(a, b));
                break;
            case "multiplicacao":
                System.out.println("Resultado: " + operacoesMatematicasHandler.realizarMultiplicacao(a, b));
                break;
            case "divisao":
                System.out.println("Resultado: " + operacoesMatematicasHandler.realizarDivisao(a, b));
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }

    public void processarOperacoesComVetor(int tamanho, int[] valores) {
        try {
            int[] vetor = operacoesVetorHandler.criarVetor(tamanho, valores);
            System.out.println("Imprimindo vetor com for:");
            operacoesVetorHandler.imprimirVetorComFor(vetor);

            System.out.println("Imprimindo vetor com while:");
            operacoesVetorHandler.imprimirVetorComWhile(vetor);

            System.out.println("Imprimindo vetor com do-while:");
            operacoesVetorHandler.imprimirVetorComDoWhile(vetor);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            throw e;
        }
    }
}
