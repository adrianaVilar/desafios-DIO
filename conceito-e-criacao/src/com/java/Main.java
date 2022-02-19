package com.java;

public class Main {

    public static void main(String[] args) {

        ifSemFlecha();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifSemFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else {
            System.out.println("Setembro");
        }
    }

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    private static void switchSemana() {

        String dia = "terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;

            case "Quarta":
                System.out.println(4);
                break;

            case "Quinta":
                System.out.println(5);
                break;

            case "Sexta":
                System.out.println(6);
                break;

            case "Sábado":
                System.out.println(7);
                break;

            case "Domingo":
                System.out.println(1);
                break;

            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias(){
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}
