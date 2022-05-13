package Ex002;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    Scanner ler = new Scanner(System.in);


    public void vetor(int V, int U) {
        int[] vetor1;
        int[] vetor2;
        vetor1 = new int[V];
        vetor2 = new int[U];
        for (int i = 0; i < V; i++) {
            System.out.print("Informe o  valor da posição " + (i + 1) + "º do primeiro vetor: ");
            vetor1[i] = ler.nextInt();
        }
        System.out.println();
        for (int j = 0; j < U; j++) {
            System.out.print("Informe o  valor da posição " + (j + 1) + "º do segundo vetor: ");
            vetor2[j] = ler.nextInt();
        }
        int somaPar;
        int somaImpar;
        int somaMult;
        int contador = 0;
        int[] vetorPrincipal;
        vetorPrincipal = new int[V];
        while(contador < V){
                if (vetor1[contador] % 2 == 0 && vetor2[contador] % 2 == 0 ) {
                        somaPar = vetor1[contador] + vetor2[contador];
                        System.out.println(somaPar);
                        vetorPrincipal[contador] = somaPar;


                    }
            else if (vetor1[contador] % 2 != 0 && vetor2[contador] % 2 != 0) {
                        somaImpar = vetor1[contador] - vetor2[contador];
                        System.out.println(somaImpar);
                    vetorPrincipal[contador] = somaImpar;
                    }
            else{
                somaMult = vetor1[contador] * vetor2[contador];
                    System.out.println(somaMult);
                    vetorPrincipal[contador] = somaMult;
                }
            contador ++;
                }
        Arrays.sort(vetorPrincipal);
        System.out.println(Arrays.toString(vetorPrincipal));

            }
        }







