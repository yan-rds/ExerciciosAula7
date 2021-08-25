package br.com.zup;

import java.util.Scanner;

public class Exercicio4_scanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        double celsius;

        // Pegando o valor em celsius do usuário
        System.out.println("Por favor insira o valor em °C a ser convertido");
        celsius = leitor.nextDouble();

        // Calculando o Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Informando a conversão ao usuário
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F.");
    }
}
