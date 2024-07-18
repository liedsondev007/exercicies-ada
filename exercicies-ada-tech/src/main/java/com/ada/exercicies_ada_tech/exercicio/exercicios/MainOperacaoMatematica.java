package com.ada.exercicies_ada_tech.exercicio.exercicios;

import com.ada.exercicies_ada_tech.exercicio.enums.OperacaoMatematica;

import java.util.Scanner;

public class MainOperacaoMatematica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pede os números ao usuário
        System.out.println("Digite o Primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o Segundo numero: ");
        double numero2 = scanner.nextDouble();

        // Pede a operação ao usuário
        System.out.println("Digite a operação (+, -, *, /): ");
        String simboloOperacao = scanner.next();

        OperacaoMatematica operacao;


        // Converte o símbolo da operação para o enum correspondente
        switch (simboloOperacao){
            case "+":
                operacao = OperacaoMatematica.SOMA;
                break;
            case "-":
                operacao = OperacaoMatematica.SUBTRACAO;
                break;
            case "*":
                operacao = OperacaoMatematica.MULTIPLICACAO;
                break;
            case "/":
                operacao = OperacaoMatematica.DIVISAO;
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }


        double resultado;


        // Realiza o cálculo baseado na operação escolhida
        switch (operacao) {
            case SOMA:
                resultado = numero1 + numero2;
                break;
            case SUBTRACAO:
                resultado = numero1 - numero2;
                break;
            case MULTIPLICACAO:
                resultado = numero1 * numero2;
                break;
            case DIVISAO:
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return;
                }
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
