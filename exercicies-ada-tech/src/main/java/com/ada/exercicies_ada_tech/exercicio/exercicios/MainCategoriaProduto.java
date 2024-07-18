package com.ada.exercicies_ada_tech.exercicio.exercicios;

import com.ada.exercicies_ada_tech.exercicio.enums.CategoriaProduto;

import java.util.Scanner;

public class MainCategoriaProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a categoria do Produto (ELETRONICO, VESTUARIO, ALIMENTO): ");
        String input = scanner.next().toUpperCase();

        CategoriaProduto categoria = CategoriaProduto.valueOf(input);


        switch (categoria) {
            case ELETRONICO:
                System.out.println("Você escolheu a categoria Eletrônico.");
                break;
            case VESTUARIO:
                System.out.println("Você escolheu a categoria Vestuário.");
                break;
            case ALIMENTO:
                System.out.println("Você escolheu a categoria Alimento.");
                break;
            default:
                System.out.println("Categoria inválida.");
        }

        scanner.close();
    }
}
