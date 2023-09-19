package org.example;

import java.util.*;

public class Desafio1 {
/* =============================================================================
============================================================================== */
// Desafio 1
// Ordenando Números Pares e Ímpares

    /* Crie um programa onde você receberá valores inteiros não negativos como
    entrada.

    Ordene estes valores de acordo com o seguinte critério:

    - Primeiro os Pares
    - Depois os Ímpares
    - Você deve exibir os pares em ordem crescente e na sequência os ímpares em
    ordem decrescente.

    - Entrada

    A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
    Este é o número de linhas de entrada que vem logo a seguir. As próximas N
    linhas terão, cada uma delas, um valor inteiro não negativo.

    - Saída

    Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
    Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenandoNumerosParesImpares desafio1 = new MetodosOrdenandoNumerosParesImpares(scanner);
        List<Integer> numeros = desafio1.getListaInteiroPositivo();
        System.out.println("Números: " + numeros);
        System.out.println("Pares em ordem crescente: " + desafio1.getNumerosPares(numeros));
        List<Integer> numerosImpares = new ArrayList<>(desafio1.getNumerosImpares(numeros)); // Copiar a lista original
        Collections.sort(numerosImpares, Collections.reverseOrder());
        System.out.println("Ímpares em ordem decrescente" + numerosImpares);
    }


    public static class MetodosOrdenandoNumerosParesImpares {
        private Scanner scanner;

        public MetodosOrdenandoNumerosParesImpares(Scanner scanner) {

            this.scanner = scanner;
        }

        public Integer getContinuar() {
            int escolha;

            do {
                try {
                    System.out.println("Quer continuar? Digite 1 para sim e 2 para não.");
                    escolha = scanner.nextInt();
                    if (escolha != 1 && escolha != 2) {
                        System.out.println("Opção inválida. Digite 1 para continuar ou 2 para sair.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Formato inválido. Digite 1 para continuar ou 2 para sair.");
                    scanner.nextLine();
                    escolha = 0;
                }
            } while (escolha != 1 && escolha != 2);

            return escolha;
        }

        public Integer getNumeroInteiroPositivo() {
            int numero;
            do {
                System.out.println("Digite um número inteiro positivo:");
                try {
                    numero = scanner.nextInt();
                    if (numero >= 0) {
                        return numero;
                    } else {
                        System.out.println("O valor deve ser um número inteiro positivo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Formato inválido.");
                    scanner.nextLine();
                }
            } while (true);
        }

        public List<Integer> getListaInteiroPositivo() {
            List<Integer> numeros = new ArrayList<>();

            do {
                int numero = getNumeroInteiroPositivo();
                numeros.add(numero);

                int escolha = getContinuar();
                if (escolha != 1) {
                    break;
                }

            } while (true);

            return numeros;
        }

        public List<Integer> getNumerosPares(List<Integer> numerosPositivos) {
            List<Integer> numerosPares = new ArrayList<>();

            for (int numero : numerosPositivos) {
                if (numero % 2 == 0) {
                    numerosPares.add(numero);
                }
            }

            return numerosPares;
        }

        public List<Integer> getNumerosImpares(List<Integer> numerosPositivos) {
            List<Integer> numerosImpares = new ArrayList<>();

            for (int numero : numerosPositivos) {
                if (numero % 2 != 0) {
                    numerosImpares.add(numero);
                }
            }

            return numerosImpares;
        }

    }

}