package Ex007;

import java.util.Random;

public class MatrizComposta {
    static int[][] matrizA;
    static int[][] matrizB;
    static int[][] matrizDiagonal;
    static int[][] valoresAbaixoDaDiagonalB;
    static int[][] matrizC;

    public static int[][] geradorA(int linhas, int colunas) {
        matrizA = new int[linhas][colunas];
        Random random = new Random();
        System.out.println("MATRIZ A");
        System.out.println();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizA[i][j] = random.nextInt(100);

            }
        }
        return matrizA;
    }

    public static void mostrarA(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] geradorB(int linha, int coluna) {
        matrizB = new int[linha][coluna];
        Random randomB = new Random();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizB[i][j] = randomB.nextInt(100);

            }
        }
        return matrizB;
    }

    public static void mostrarB(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

    static void matrizADiagonaleSuperior(int lin, int col) {
        matrizDiagonal = new int[lin][col];
        int[][] valoresAbaixoDaDiagonal = new int[lin][col];
        System.out.println();
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= i) {
                    matrizDiagonal[i][j] = matrizA[i][j];
                }
            }

        }
    }

    static void matrizBParteInferior(int lin, int col) {
        valoresAbaixoDaDiagonalB = new int[lin][col];
        System.out.println();
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    valoresAbaixoDaDiagonalB[i][j] = matrizB[i][j];
                }
            }
        }
    }
    static void matrizC(int lin, int col){
        //alocando nas posições na matriz C
        matrizC = new int[lin][col];
        System.out.println();
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                if(j>i){
                    matrizC[i][j] = matrizDiagonal[i][j];
                }
                else if(i>j){
                    matrizC[i][j] = valoresAbaixoDaDiagonalB[i][j];
                }
                else if(i == j){
                    matrizC[i][i] = matrizDiagonal[i][j];
                }
            }

        }
        //gerador da matriz C que é a junção da diagonal e superior da A e parte inferior da B
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[0].length; coluna++) {
                System.out.print(matrizC[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
