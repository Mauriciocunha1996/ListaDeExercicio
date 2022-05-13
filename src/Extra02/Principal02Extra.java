package Extra02;

import java.util.Scanner;

public class Principal02Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de base decimal: ");
        int numeroDecimal = sc.nextInt();
        System.out.println();
        System.out.println("Qual conversão deseja? ");
        System.out.println("1-Binário");
        System.out.println("2-Hexadecimal");
        System.out.print("Opção: ");
        int opcaoDeEscolha = sc.nextInt();

        ConversaoBinarioEHexadecimal opcoes = new ConversaoBinarioEHexadecimal();
        opcoes.escolhas(numeroDecimal, opcaoDeEscolha);

    }
}
