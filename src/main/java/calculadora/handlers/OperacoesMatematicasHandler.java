package calculadora.handlers;

public class OperacoesMatematicasHandler {

    public double realizarAdicao(double a, double b) {
        return a + b;
    }

    public double realizarSubtracao(double a, double b) {
        return a - b;
    }

    public double realizarMultiplicacao(double a, double b) {
        return a * b;
    }

    public double realizarDivisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
