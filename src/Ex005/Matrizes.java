package Ex005;

import java.util.Random;

public class Matrizes {
    static int[][]matrizA;
    static int[][]matrizB;
    static int[][]matrizC;
    static int[][]matrizTransposta;
    public static int[][] geradorA(int linhas, int colunas) {
        matrizA = new int[linhas][colunas];
        Random random = new Random();
        System.out.println("MATRIZ A");
        System.out.println();
        for(int i = 0; i <linhas; i++) {
            for (int j = 0; j < colunas; j++){
                matrizA[i][j] = random.nextInt(100);

            }
        }
        return matrizA;
    }
    public static void mostrarA(int[][]matriz){
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] geradorB(int linha, int coluna) {
        matrizB = new int[linha][coluna];
        Random randomB = new Random();

        for(int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++){
                matrizB[i][j] = randomB.nextInt(100);

            }
        }
        return matrizB;
    }
    public static void mostrarB(int[][]matriz){
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
    static void soma(int lin, int col){
       matrizC = new int[lin][col];
        System.out.println();
       for(int i = 0; i < lin; i++ ){
           for (int j = 0; j < col; j++){
               matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
               System.out.print(matrizC[i][j] + " ");
           }
           System.out.println();
       }

    }
    static void transposta(int linha, int coluna){
        matrizTransposta = new int[coluna][linha];
        System.out.println();
        for(int i = 0; i < coluna; i++ ){
            for (int j = 0; j < linha; j++){
                matrizTransposta[i][j] = matrizC[j][i];
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

    }
}






