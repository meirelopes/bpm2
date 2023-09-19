package org.example;

public class Desafio3 {
    /* =============================================================================
    ============================================================================== */
    // Desafio 3
// Sequência de Fibonacci (Recursividade)

    /*
    A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
    cada termo subsequente é obtido pela soma dos dois termos predecessores:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

    Fibonacci(0) = 0
    Fibonacci(1) = 1
    Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

    - Entrada

    O arquivo de entrada contém um valor inteiro N.

    - Saída

    Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

    N = 0  => saída "Fib = 0"
    N = 1  => saída "Fib = 1"
    N = 3  => saída "Fib = 2"
    M = 29 => saída "Fib = 514229"

     */

    public static void main(String[] args) {
        int quantidadeDeTermos = 29;
        int resultado = 0;
        System.out.println("Sequência de Fibonacci com " + quantidadeDeTermos + " termos:");
        for (int i = 0; i <= quantidadeDeTermos; i++) {
            resultado = fibonacci(i);
            System.out.print(resultado + " ");
        }
        System.out.println("\nFib = " + resultado);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}
