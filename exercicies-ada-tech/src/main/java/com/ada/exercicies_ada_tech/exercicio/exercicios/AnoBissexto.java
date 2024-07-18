package com.ada.exercicies_ada_tech.exercicio.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnoBissexto {

    enum MesAno {
        JANEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30), MAIO(31), JUNHO(30),
        JULHO(31), AGOSTO(31), SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

        private final int numeroDias;

        MesAno(int dias) {
            numeroDias = dias;
        }

        public int getDias(int ano) {
            int diasFevereiro = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? 1 : 0;
            return numeroDias + (this == FEVEREIRO ? diasFevereiro : 0);
        }
    }

    public static void imprimeDiasNoMes(int ano, String mes, Map<String, MesAno> mesesMap) {
        MesAno mesAno = mesesMap.get(mes.toUpperCase());
        System.out.println(mesAno != null
                           ? "O mês de " + mes + " no ano de " + ano + " tem " + mesAno.getDias(ano) + " dias."
                           : "Mês inválido. Por favor, insira um mês válido.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, MesAno> mesesMap = new HashMap<>();
        mesesMap.put("JANEIRO", MesAno.JANEIRO);
        mesesMap.put("FEVEREIRO", MesAno.FEVEREIRO);
        mesesMap.put("MARCO", MesAno.MARCO);
        mesesMap.put("ABRIL", MesAno.ABRIL);
        mesesMap.put("MAIO", MesAno.MAIO);
        mesesMap.put("JUNHO", MesAno.JUNHO);
        mesesMap.put("JULHO", MesAno.JULHO);
        mesesMap.put("AGOSTO", MesAno.AGOSTO);
        mesesMap.put("SETEMBRO", MesAno.SETEMBRO);
        mesesMap.put("OUTUBRO", MesAno.OUTUBRO);
        mesesMap.put("NOVEMBRO", MesAno.NOVEMBRO);
        mesesMap.put("DEZEMBRO", MesAno.DEZEMBRO);

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        System.out.println("Digite o mês: ");
        String mes = scanner.next();

        imprimeDiasNoMes(ano, mes, mesesMap);

        scanner.close();
    }
}