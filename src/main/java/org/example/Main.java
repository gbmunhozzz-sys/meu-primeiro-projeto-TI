package org.example;

public class Main {
    public static void main(String[] args) {
        // Declara uma variavel do tipo int e atribui um valor
        int numeroInt = 42;

        // Ocorre o casting implicito (promocao automatica de int para double)
        double numeroDouble = numeroInt;

        // Exibe o valor da variavel double no console
        System.out.println("Valor em double: " + numeroDouble);
    }
}
