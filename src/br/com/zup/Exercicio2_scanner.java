package br.com.zup;

import java.util.Scanner;

public class Exercicio2_scanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        double metros;


        // Dando essa conversão ao usuário
        System.out.println( " Bem Vindo ao sistema de conversão de medida" );
        System.out.println("Insira abaixo o valor em metros que você quer transformar em centímetros");
        metros = leitor.nextDouble();
        //Transformando os metros em centímetros
        double centimetros = metros * 100;
        // Informando ao usuário
        System.out.println("Isso equivale a " + centimetros + " centimetros");


    }
}