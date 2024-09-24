package br.com.aprendendo.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class VocacaoFilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> filmes = Arrays.asList("O Poderoso Chefão", "A Origem", "Clube da Luta", "Forrest Gump");
        // Inicialize e gerencie os votos aqui
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i + 1) + " " + filmes.get(i));
        }
        int voto;
        int maxVoto = 0;
        int poderoso = 0;
        int origem = 0;
        int clube = 0;
        int gump = 0;
//        do{
//            for (int i = 1; i <= filmes.size(); i++) {
//                System.out.println("Digite seu voto: ");
//                voto = scanner.nextInt();
//                switch (voto) {
//                    case 1:
//                        poderoso++;
//                        break;
//                    case 2:
//                        origem++;
//                        break;
//                    case 3:
//                        clube++;
//                        break;
//                    case 4:
//                        gump++;
//                        break;
//                }
//            }
//            System.out.println(poderoso);
//            System.out.println(origem);
//            System.out.println(clube);
//            System.out.println(gump);
//
//        } while (voto != 0);

//            if (poderoso > origem && poderoso > clube && poderoso > gump) {
//                System.out.println("O filme da noite é poderoso");
//            } else if (origem > poderoso && origem > clube && origem > gump) {
//                System.out.println("O filme da noite é origem");
//            } else if (clube > poderoso && clube > origem && clube > gump) {
//                System.out.println("O filme da noite é Club");
//            } else if (gump > poderoso && gump > origem && gump > clube) {
//                System.out.println("O filme da noite é gump");
//            }


        // Seu código para listar os filmes, registrar e contar votos
        // Determine e anuncie o filme vencedor
    }
}