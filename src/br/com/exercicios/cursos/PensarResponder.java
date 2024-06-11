package br.com.exercicios.cursos;

import javax.swing.JOptionPane;


public class PensarResponder {
    public static void main(String[] args) {
        String mensagem = "";
        int num1, num2;
        double div, expo;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        div = (int) num1 / (int) num2;
        expo = Math.pow(num1, num2);

        mensagem = mensagem + "A divisão de " + num1 + " por " + num2 + " é " + div + "." + "\n";
        mensagem = mensagem + "A potência de " + num1 + " por " + num2 + " é " + expo + ".";


        JOptionPane.showMessageDialog(null, mensagem);









    }
}
