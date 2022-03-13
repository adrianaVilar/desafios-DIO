package Classe;

import java.util.Scanner;


public class Main {
    public static void main2(String[] args) {

        Scanner leitor = new Scanner(System.in);


        int a = leitor.nextInt();
        int b = leitor.nextInt();

        //digite o seu código
        int x = a + b;

        System.out.println("X = " + x);
    }

    String texto = "Erick";

    private void imprime(String texto){
        System.out.println(texto);

        System.out.println(this.texto);
    }

    public static void main(String[] args) {
      //  imprimeComImpressor(new ImpressoraHp());
        //imprimeComImpressor2(new ImpressoraHp());

       Main main = new Main();
       main.imprime("outro texto");
    }



    private static void imprimeComImpressor(Impressor impressora) {
        impressora.imprime("texto");
    }

    private static void imprimeComImpressor2(Impressor impressora) {
        impressora.imprime("texto");
    }


}

interface Impressor {
    void imprime(String texto);
}

class ImpressoraHp implements Impressor {


    @Override
    public void imprime(String texto) {
        System.out.println(texto);
    }

    public void fazAlgo() {
    }
}

class ImpressoraSamsung implements Impressor {

    @Override
    public void imprime(String txt) {
        System.out.println("****" + txt + "****");
    }
}