package Ex007;

import java.util.Scanner;

public class Principal007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Digite dois números iguais para formar a matriz quadrada: ");
        System.out.println("Exemplo: Linha: 4 Coluna: 4 ----> Matriz 4x4 ");
        System.out.println("------------------------------------------------------------");
        System.out.print("Linha da Matriz: ");
        int linha = sc.nextInt();
        System.out.print("Coluna: ");
        int coluna = sc.nextInt();

        int[][]matrizA = MatrizComposta.geradorA(linha, coluna);
        MatrizComposta.mostrarA(matrizA);
        System.out.println();
        int[][]matrizB = MatrizComposta.geradorB(linha, coluna);
        MatrizComposta.mostrarB(matrizB);
        MatrizComposta.matrizADiagonaleSuperior(linha,coluna);
        MatrizComposta.matrizBParteInferior(linha, coluna);
        MatrizComposta.matrizC(linha, coluna);




    }
}
