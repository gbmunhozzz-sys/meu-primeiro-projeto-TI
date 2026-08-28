package org.example;

public class Main {
    public static void main(String[] args) {
                // 1. Declara a variável double com valor fracionado
                double valorDecimal = 9.99;

                // 2. Casting explícito (força a conversão de double para int)
                int valorInteiro = (int) valorDecimal;

                // 3. Exibe ambos os valores no console
                System.out.println("Valor em double: " + valorDecimal);
                System.out.println("Valor em int (após casting): " + valorInteiro);
    }
}
