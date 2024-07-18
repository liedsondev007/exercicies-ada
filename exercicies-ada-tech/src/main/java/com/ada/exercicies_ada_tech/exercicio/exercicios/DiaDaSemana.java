package com.ada.exercicies_ada_tech.exercicio.exercicios;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int dia = scanner.nextInt();

        String diaDaSemana = (dia == 1) ? "Domingo" :
                             (dia == 2) ? "Segunda-feira" :
                             (dia == 3) ? "Terça-feira" :
                             (dia == 4) ? "Quarta-feira" :
                             (dia == 5) ? "Quinta-feira" :
                             (dia == 6) ? "Sexta-feira" :
                             (dia == 7) ? "Sábado" :
                             "Número inválido";

        System.out.println("O dia semana corresponde é: " + diaDaSemana);

        scanner.close();
    }
}
