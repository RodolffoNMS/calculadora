package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;
        final int TAMANHO_MAXIMO = 15; // Define o tamanho máximo permitido para o vetor


        do {
            // Menu da calculadora
            System.out.println("Escolha a operação desejada: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Imprimir vetor com for");
            System.out.println("6 - Imprimir vetor com while");
            System.out.println("7 - Imprimir vetor com do/while");
            System.out.println("0 - Sair");
            System.out.print("Digite o número correspondente à operação: ");
            operacao = scanner.nextInt();

            if (operacao == 0) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            switch (operacao) {
                case 1:
                    System.out.print("Digite o primeiro número da operação: ");
                    double numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número da operação: ");
                    double numero2 = scanner.nextDouble();
                    System.out.println("Resultado da adição: " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número da operação: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número da operação: ");
                    numero2 = scanner.nextDouble();
                    System.out.println("Resultado da subtração: " + (numero1 - numero2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número da operação: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número da operação: ");
                    numero2 = scanner.nextDouble();
                    System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número da operação: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número da operação: ");
                    numero2 = scanner.nextDouble();
                    if (numero2 != 0) {
                        System.out.println("Resultado da divisão: " + (numero1 / numero2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;

                case 5:
                    // Solicita o tamanho do vetor
                    int tamanhoVetor;
                    do {
                        System.out.print("Digite o tamanho do vetor (máximo " + TAMANHO_MAXIMO + "): ");
                        tamanhoVetor = scanner.nextInt();
                        if (tamanhoVetor > TAMANHO_MAXIMO) {
                            System.out.println("Erro: O tamanho do vetor não pode ser maior que " + TAMANHO_MAXIMO + ".");
                        } else if (tamanhoVetor <= 0) {
                            System.out.println("Erro: O tamanho do vetor deve ser maior que 0.");
                        }
                    } while (tamanhoVetor > TAMANHO_MAXIMO || tamanhoVetor <= 0);
                    // Declara o vetor com o tamanho informado pelo usuário
                    int [] vetor = new int[tamanhoVetor];
                    // Preenche o vetor com valores fornecidos pelo usuário
                    System.out.println("Digite os valores do vetor:");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetor[i] = scanner.nextInt();
                    }
                    System.out.println("Imprimindo vetor com for:");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.println(vetor[i]);
                    }
                    break;

                case 6:
                    // Solicita o tamanho do vetor
                    do {
                        System.out.print("Digite o tamanho do vetor (máximo " + TAMANHO_MAXIMO + "): ");
                        tamanhoVetor = scanner.nextInt();
                        if (tamanhoVetor > TAMANHO_MAXIMO) {
                            System.out.println("Erro: O tamanho do vetor não pode ser maior que " + TAMANHO_MAXIMO + ".");
                        } else if (tamanhoVetor <= 0) {
                            System.out.println("Erro: O tamanho do vetor deve ser maior que 0.");
                        }
                    } while (tamanhoVetor > TAMANHO_MAXIMO || tamanhoVetor <= 0);
                    // Declara o vetor com o tamanho informado pelo usuário
                    vetor = new int[tamanhoVetor];
                    // Preenche o vetor com valores fornecidos pelo usuário
                    System.out.println("Digite os valores do vetor:");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetor[i] = scanner.nextInt();
                    }
                    System.out.println("Imprimindo vetor com while:");
                    int i = 0;
                    while (i < vetor.length) {
                        System.out.println(vetor[i]);
                        i++;
                    }
                    break;


                case 7:
                    // Solicita o tamanho do vetor
                    do {
                        System.out.print("Digite o tamanho do vetor (máximo " + TAMANHO_MAXIMO + "): ");
                        tamanhoVetor = scanner.nextInt();
                        if (tamanhoVetor > TAMANHO_MAXIMO) {
                            System.out.println("Erro: O tamanho do vetor não pode ser maior que " + TAMANHO_MAXIMO + ".");
                        } else if (tamanhoVetor <= 0) {
                            System.out.println("Erro: O tamanho do vetor deve ser maior que 0.");
                        }
                    } while (tamanhoVetor > TAMANHO_MAXIMO || tamanhoVetor <= 0);
                    // Declara o vetor com o tamanho informado pelo usuário
                    vetor = new int[tamanhoVetor];
                    // Preenche o vetor com valores fornecidos pelo usuário
                    System.out.println("Digite os valores do vetor:");
                    for (i = 0; i < vetor.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetor[i] = scanner.nextInt();
                    }
                    System.out.println("Imprimindo vetor com do/while:");
                    i = 0;
                    do {
                        System.out.println(vetor[i]);
                        i++;
                    } while (i < vetor.length);
                    break;

                default:
                    System.out.println("Erro: Operação inválida.");
            }

            System.out.println(); // Linha em branco para separar as interações
        } while (true);

        scanner.close(); // Fechando o Scanner fora do loop
    }
}