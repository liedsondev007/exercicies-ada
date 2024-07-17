package com.ada.exercicies_ada_tech.exercicio;

import java.util.Scanner;

public class Sign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês do seu nascimento (número): ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();

        String signo = (mes == 1 && dia >= 20) || (mes == 2 && dia <= 18) ? "Aquário" :
                       (mes == 2 && dia >= 19) || (mes == 3 && dia <= 20) ? "Peixes" :
                       (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19) ? "Áries" :
                       (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20) ? "Touro" :
                       (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20) ? "Gêmeos" :
                       (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22) ? "Câncer" :
                       (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22) ? "Leão" :
                       (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22) ? "Virgem" :
                       (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22) ? "Libra" :
                       (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21) ? "Escorpião" :
                       (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21) ? "Sagitário" :
                       (mes == 12 && dia >= 22) || (mes == 1 && dia <= 19) ? "Capricórnio" :
                       "Data inválida";

        System.out.printf("Seu signo é %s.\n", signo);
    }
}
