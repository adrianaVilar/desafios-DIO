package com.dio;

public class Main {

    public static void main(String[] args) {

        int i;
        // int i; //está comentado, pq não pode repetir variáveis
        int I; //é diferente da variável anterior, pq está em maiúsculo e java é case sensitive
        /* int 1a; //não começar com número
        //int _1a; //evitar "_"
        //int $aq; //evitar "$"*/
        int as58saf2 = 5;

        i = 5;
        I = 10;
        /*_1a = 20;
         *$qa = 7;
         */

        int quantidadeProduto = 50;
        //int QuantidadeProduto; //não é camel case
        final int NUMERO_TENTIVAS = 5; //CERTO! Quando for int final, usar maiúsculo e "_"
        /*final int numeroTentativas = 5; final, ler comentário anterior
        int NUMERO_TENTATIVAS = 5; maiúsculo só com int final
        int qtdProd; não é intuitivo
        int i; ok, se for usar para uma variável "descartável", mas foi comentada pq já está no início do código
*/

        System.out.println(i);
        System.out.println(I);
        /* System.out.println(_1a);
         * System.out.println($aq);
         *
         *       System.out.println(j);
         */
        System.out.println(as58saf2);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTIVAS);
    }
}
