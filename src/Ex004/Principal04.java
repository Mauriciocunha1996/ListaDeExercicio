package Ex004;

import java.util.Scanner;

public class Principal04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um frase ou palavra: ");
        String palavraOuFrase = sc.nextLine();

        RemoverVogalOuConsoante remover = new RemoverVogalOuConsoante();
        remover.remover(palavraOuFrase);


    }
}
