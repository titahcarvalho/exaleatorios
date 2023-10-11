package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int i, soma = 0, contador = 0;
    System.out.println("Digite um número inteiro: ");
    i = entrada.nextInt();
    do {
        soma += i;
        contador++;
        System.out.println("Número = " + i);
        System.out.println("Digite um número inteiro: ");
        i = entrada.nextInt();
    } while ( i >= 0);
        System.out.println("Quantidade de número inseridos:" + contador);
        System.out.println("Soma de todos os números:" + soma);
        entrada.close();
    }
}
