package br.com.zup;


import java.util.Scanner;

public class Exercicio1_scanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int soma;
        int media;

        // Dando essa informação ao usuário
        System.out.println("Bem vindo ao sistema de média de notas");
        System.out.println("Escreva abaixo sua primeira nota");
        nota1 = leitor.nextInt();
        System.out.println("Escreva abaixo sua segunda nota");
        nota2 = leitor.nextInt();
        System.out.println("Escreva abaixo sua terceira nota");
        nota3 = leitor.nextInt();
        System.out.println("Escreva abaixo sua quarta nota");
        nota4 = leitor.nextInt();

        //Criando Sistema de Soma
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;

        // Apresentando a média pro usuário
        System.out.println("Sua média este ano é de: " + media);
    }
}
