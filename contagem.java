package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int i ; //inicialização
        System.out.println("Contagem regressiva, digite um número:");
        i = entrada.nextInt();
	while ( i >= 0){
            System.out.println(i);
            i--; //variável de controle incrementada ou decrementada!
        }
    }
}
