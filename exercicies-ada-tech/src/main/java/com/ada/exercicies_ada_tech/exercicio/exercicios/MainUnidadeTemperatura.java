package com.ada.exercicies_ada_tech.exercicio.exercicios;

import com.ada.exercicies_ada_tech.exercicio.enums.UnidadeTemperatura;

import java.util.Scanner;

public class MainUnidadeTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a unidade de temperatura atual (CELSIUS, FAHRENHEITH, KELVIN): ");
        UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());


        System.out.print("Digite a unidade de temperatura desejada (CELSIUS, FAHRENHEITH, KELVIN): ");
        UnidadeTemperatura unidadeDesejada = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());


        System.out.print("Digite a temperatura atual: ");
        double temperaturaAtual = scanner.nextDouble();

        double temperaturaConvertida = 0;
        switch (unidadeAtual) {
            case CELSIUS:
                switch (unidadeDesejada) {
                    case FAHRENHEIT:
                        temperaturaConvertida = (temperaturaAtual * 9 / 5) + 32;
                        break;
                    case KELVIN:
                        temperaturaConvertida = temperaturaAtual + 273.15;
                        break;
                    default:
                        temperaturaConvertida = temperaturaAtual;
                        break;
                }
                break;
            case FAHRENHEIT:
                switch (unidadeDesejada) {
                    case CELSIUS:
                        temperaturaConvertida = (temperaturaAtual - 32) * 5 / 9;
                        break;
                    case KELVIN:
                        temperaturaConvertida = (temperaturaAtual + 459.67) * 5 / 9;
                        break;
                    default:
                        temperaturaConvertida = temperaturaAtual;
                        break;
                }
                break;
            case KELVIN:
                switch (unidadeDesejada) {
                    case CELSIUS:
                        temperaturaConvertida = temperaturaAtual - 273.15;
                        break;
                    case FAHRENHEIT:
                        temperaturaConvertida = (temperaturaAtual * 9 / 5) - 459.67;
                        break;
                    default:
                        temperaturaConvertida = temperaturaAtual;
                        break;
                }
                break;
        }

        System.out.println("Temperatura convertida: " + temperaturaConvertida);

    }
}
