package br.com.exercicios.cursos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();;

        while(tipo != 4){
            if (tipo == 1){
                alcool ++;
            } else if (tipo == 2){
                gasolina ++;
            }else if(tipo == 3){
                diesel++;
            }
            tipo = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("quantidade de álcool: " + alcool);
        System.out.println("quantidade de gasolina: " + gasolina);
        System.out.println("quantidade de diesel: " + diesel);

    }
}
