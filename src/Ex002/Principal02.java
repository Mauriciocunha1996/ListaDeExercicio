package Ex002;

import java.util.Scanner;

public class Principal02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Quantos Elementos no vetor 1: ");
        int variaveis1 = sc.nextInt();
        System.out.print("Quantos Elementos no vetor 2: ");
        int variaveis2 = sc.nextInt();

        Vetores vetores = new Vetores();
        vetores.vetor(variaveis1, variaveis2);
    }
}
