package com.ada.exercicies_ada_tech.exercicio;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        int number = scanner.nextInt();

        // Verificação de número primo utilizando IntStream
        boolean isCousin = number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);

        String result = isCousin ? "é primo" : "não é primo";
        System.out.println("O numero " + number + " " + result);

        scanner.close();
    }
}
