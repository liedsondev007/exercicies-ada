package com.ada.exercicies_ada_tech.exercicio;

import java.util.Scanner;

public class IndentificarMes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero de 1 a 12: ");
        int numero = scanner.nextInt();

        String nomeMes = (numero == 1) ? "Janeiro" :
                         (numero == 2) ? "Fevereiro" :
                         (numero == 3) ? "Março" :
                         (numero == 4) ? "Abril" :
                         (numero == 5) ? "Maio" :
                         (numero == 6) ? "Junho" :
                         (numero == 7) ? "Julho" :
                         (numero == 8) ? "Agosto" :
                         (numero == 9) ? "Setembro" :
                         (numero == 10) ? "Outubro" :
                         (numero == 11) ? "Novembro" :
                         (numero == 12) ? "Dezembro" :
                         "Número inválido";

        System.out.println("O mês correspondente ao numero " + numero + " é: " +  nomeMes);

        scanner.close();
    }
}
