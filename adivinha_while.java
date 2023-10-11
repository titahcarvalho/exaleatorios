package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Random random = new Random();
	int numeroAleatorio = random.nextInt(101);
	int palpite, tentativa=0;
	System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");
	do {
        System.out.println("Digite um número: ");
        palpite = entrada.nextInt();
        tentativa++;
        if (palpite < numeroAleatorio) {
            System.out.println("O número é maior que esse: " + palpite + ". Tente novamente!");
        } else if (palpite < numeroAleatorio) {
            System.out.println("O número é menor que esse: " + palpite + ". Tente novamente!");
        } else {
            System.out.println("Parabéns! " + palpite + " é o número que procurava");
            System.out.println("Número de tentativas:" + tentativa);
        }

    }   while (palpite != numeroAleatorio) ;

        entrada.close();

    }
}
