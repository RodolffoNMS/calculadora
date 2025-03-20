package calculadora.operacoes;

public class Divisao {
    public double calcular(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Não existe Divisão por zero!");
        }
        return numero1 / numero2;
    }
}
