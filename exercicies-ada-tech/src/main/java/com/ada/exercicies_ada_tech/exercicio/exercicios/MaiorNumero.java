package com.ada.exercicies_ada_tech.exercicio.exercicios;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int numero3 = scanner.nextInt();

        // Encontrando o maior número usando operador ternário
        int maior = (numero1 > numero2) ?
                    (Math.max(numero1, numero3)) :
                    (Math.max(numero2, numero3));

        System.out.println("O maior número inserido é: " + maior);

        scanner.close();
    }
}
