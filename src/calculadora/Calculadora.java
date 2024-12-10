package calculadora;

import java.util.Scanner;

/**
 *
 * @author sirnivass
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definindo os números da operação
        System.out.print("Digite o primeiro número da operação: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número da operação: ");
        double numero2 = scanner.nextDouble();

        int operacao; // Variável de controle para a operação

        do {
            // Menu da calculadora:
            System.out.println("Escolha a operação desejada: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Digite o número correspondente à operação: ");
            operacao = scanner.nextInt();

            if (operacao == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            // Realizando a operação escolhida
            switch (operacao) {
                case 1:
                    System.out.println("Resultado da adição: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("Resultado da divisão: " + (numero1 / numero2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Erro: Operação inválida.");
            }

            System.out.println(); // Linha em branco para separar as interações

        } while (true);

        scanner.close(); // Fechando o Scanner fora do loop
    }
}