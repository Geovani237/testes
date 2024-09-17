package br.com.aprendendo.ex;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        String[] produtos = {"tablet","notebook","relogio", "pc", "mouse"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("consulta de produto: ");
        String leitura = scanner.next();

        int i = 0;
        boolean produtoEncontrado = false;
        while (!produtoEncontrado && i < produtos.length) {
            if (produtos[i].equals(leitura)) {
                produtoEncontrado = true;
            }
            i++;
        }
        if (produtoEncontrado) {
            System.out.println("tem no estoque");
        }
    }
}
