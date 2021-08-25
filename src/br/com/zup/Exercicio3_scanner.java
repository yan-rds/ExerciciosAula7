package br.com.zup;

import java.util.Scanner;

public class Exercicio3_scanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        double horasTrabalhadas;
        double salarioPorHora;

        //Pegando as informações do usuário
        System.out.println("Por favor insira o total de horas trabalhadas este mês");
        horasTrabalhadas = leitor.nextDouble();
        System.out.println("Agora, por favor insira seu salário por hora");
        salarioPorHora = leitor.nextDouble();

        // Calculando o salário
        double salario = horasTrabalhadas * salarioPorHora;

        System.out.println("Seu salário será R$" + salario);
    }
}
