package br.com.exercicios.cursos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 1000: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
