package br.com.aprendendo.bobblesort;

public class BobbleSorte {
    public static void main(String[] args) {

        int[] vetor = {1,34,978,-5,4,99,22,54,0};
        //variavel de controle
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i=1; i < vetor.length;i++) {
                // comparar elementos adjacentes
                if (vetor[i - 1] > vetor[i]) {
                    //Trova os elementos de lugar
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    houveTroca = true; // Indica que uma troca ocorreu
                }
            }
        } while(houveTroca); // continua enquanto houver trocas
        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }


}
