package Ex005;

import java.util.Scanner;


public class Principal005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Linha: ");
        int linha = sc.nextInt();
        System.out.print("Coluna: ");
        int coluna = sc.nextInt();

        int[][]matrizA = Matrizes.geradorA(linha, coluna);
        Matrizes.mostrarA(matrizA);
        System.out.println();
        int[][]matrizB = Matrizes.geradorB(linha, coluna);
        Matrizes.mostrarB(matrizB);
        Matrizes.soma(linha,coluna);
        Matrizes.transposta(linha,coluna);


    }
}
