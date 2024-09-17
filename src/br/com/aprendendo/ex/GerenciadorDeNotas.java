package br.com.aprendendo.ex;

import java.util.Scanner;

public class GerenciadorDeNotas {
    public static void main(String[] args) {

        double[] notaAluno = new double[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < notaAluno.length; i++){
            System.out.println("Digite a nota: " + (i+1));
            notaAluno[i] = sc.nextDouble();
        }

        double somaNota = 0;
        for (int i = 0; i < notaAluno.length; i++){
            somaNota+= notaAluno[i];
        }

        double media = somaNota / notaAluno.length;

        System.out.println(media);
    }
}
