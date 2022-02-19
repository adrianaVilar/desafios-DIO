package com.dio;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(23);


        //Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(1000, 2);


        //Areas
        System.out.println("Exercicio areas");
        Areas.area(5);
        Areas.area(5, 3);
        Areas.area(2, 5, 3);
        Areas.area(2f, 5f);


        //Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Retorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retorno.area(5, 3);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Retorno.area(2,5, 4);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }


}
