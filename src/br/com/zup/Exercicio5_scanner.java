package br.com.zup;

import java.util.Scanner;

public class Exercicio5_scanner {
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

        // Calculando o salário sem impostos
        double salario = horasTrabalhadas * salarioPorHora;

        // Calculando impostos
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double impostoDeRenda = salario * 0.11;

        //Calculando o salario liquido
        double salarioLiquido = salario - inss - sindicato - impostoDeRenda;

        //Dando essa informação ao usuário
        System.out.println("Esse mês você trabalhou " + horasTrabalhadas + " horas, com um salário de R$" + salarioPorHora + " por hora.");
        System.out.println("Seu salário sem impostos seria R$" + salario);
        System.out.println("Foi descontado R$" + inss + " referente ao INSS e R$" + sindicato + " referente ao sindicato" );
        System.out.println("Seu salário líquido será de R$" + salarioLiquido);

    }
}
