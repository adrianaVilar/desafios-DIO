package Classe;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica
        double porcentagemAumento = ((B * 100 / A) - 100);

        System.out.println(new DecimalFormat("0.00").format(porcentagemAumento) + '%');
    }

}