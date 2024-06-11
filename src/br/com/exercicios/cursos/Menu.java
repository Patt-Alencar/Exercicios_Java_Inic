package br.com.exercicios.cursos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double imposto, salario, novoSalario = 0;
        String classificacao;

        System.out.println("Digite a opção desejada: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Informe o valor do seu salário: ");
                salario = sc.nextDouble();
                if (salario < 1000){
                    imposto = (salario * 5)/100;
                } else if (salario > 1000 && salario < 3000){
                    imposto = (salario * 10)/100;
                } else {
                    imposto = (salario * 15)/100;
                }
                System.out.printf("Valor do imposto:  %.2f\n", imposto);
                break;

            case 2:
                System.out.println("Informe o valor do salario");
                salario = sc.nextDouble();
                if (salario > 4500) {
                    novoSalario = salario + 45;
                } else if ((salario >= 2250) && (salario <= 4500)) {
                    novoSalario = salario + 150;
                } else if ((salario >= 1350) && (salario <= 2249.99)) {
                    novoSalario = salario + 225;
                } else {
                    novoSalario = salario + 300;
                }
                System.out.printf("Valor do novo salário:  %.2f\n", novoSalario);
                break;

            case 3:
                System.out.println("Informe seu salário");
                salario = sc.nextDouble();
                if (salario <= 1500) {
                    classificacao = "Mal remunerado";
                }else {
                    classificacao = "Bem remunerado";
                }
                System.out.printf("Classificação:  %s\n", classificacao);
                break;
            default:
                System.out.println("Opção inválida");
        }



    }
}
