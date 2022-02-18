package com.dio;

public class Exercicio {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; é maior do que o limite do short

        //int i1 = -1000000000; é menor do que o limite inferior
        int i2 = 28500;

        long l1 = 100000000000000000L;
        long l2 = 200400500500500500L;

        //float f1 = 4.5; deve usar o "f" no final, se não a linguagem java vai entender que é um double
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'a';
        //char c2 = 'aB'; só pode 1 caracter
        char c3 = '\u0057';

        String st1 = "Adriana";
        String st2 = "Vilar";
        String st3 = "Está no bootcamp DIO - #4 Java";
        //String st4 = "11/01/2022"; não se usa String para datas

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
