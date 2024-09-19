package br.com.aprendendo.binarysearch;

public class BinarySearch {
    public static void main(String[] args ) {
        int[] vetorOrdenado = {1,2,3,4,5,6,7,8,9,10};
        int elementoProcurado = 4;
        int inicio = 0;
        int fim = vetorOrdenado.length - 1;
        int posicaoEncontrada = -2; //Assume-se inicialmente que o elemento não está presente

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) /2;

            if(vetorOrdenado[meio] == elementoProcurado) {
                posicaoEncontrada = meio;
                break;
            } else if (vetorOrdenado[meio] < elementoProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (posicaoEncontrada != -2) {
            System.out.println("Elemento encontrado no índice: " + posicaoEncontrada);
        } else {
            System.out.println("Elemento não encontrado no vetor.");
        }
    }
}
