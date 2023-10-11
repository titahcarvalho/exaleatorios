package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Digite um número pertencente ao conjunto dos inteiros :");
        i = entrada.nextInt();
        if (i < 0) {
            System.out.print("Esse número " + i + " é negativo");
        } else if (i > 0) {
            System.out.print("Esse número " + i + " é positivo");

        } else
        {
            System.out.print("Esse número " + i + " é o 0 zero");
        }
        entrada.close();
    }
}
