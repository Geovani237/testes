package br.com.aprendendo.teste1;

import java.util.Scanner;

public class MatrixCinema {
    public static void main(String[] args) {
        //Matriz representando os assentos do cinema (0 = livre, 1 = ocupado)
        Scanner scanner = new Scanner(System.in);
        int[][] salaCinema = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0}
        };

        //Exibe a situação atual dos assentos
        System.out.println("Situação atual do assentos (L = livre, O = Ocupado): ");
        for (int i = 0; i < salaCinema.length; i++) {
            for (int j = 0; j < salaCinema[i].length; j++) {
                System.out.print(salaCinema[i][j] == 0 ? "L " : "O ");
            }
            System.out.println(" <- Fila " + (i + 1));
        }
        System.out.println("Escolha a fila:");
        int filaEscolhida = scanner.nextInt() - 1; // ajuste para o índice do vetos base 0

        System.out.println("Escolha o número do assento: ");
        int assentoEscolhido = scanner.nextInt() - 1; // ajuste para o índice do veto base 0

        if (filaEscolhida >= 0 && filaEscolhida < salaCinema.length && assentoEscolhido >= 0 && assentoEscolhido < salaCinema[filaEscolhida].length) {
            if (salaCinema[filaEscolhida][assentoEscolhido] == 0) {
                salaCinema[filaEscolhida][assentoEscolhido] = 1;
                System.out.println("Assento reservado com sucesso!");
            } else {
                System.out.println("O assento já está ocupado, por favor escolha outro.");
            }
        } else {
            System.out.println("Escolha inválida, tente novamente.");
        }

        scanner.close();
    }
}
