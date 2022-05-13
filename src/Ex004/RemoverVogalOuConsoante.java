package Ex004;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoverVogalOuConsoante {

    public void remover(String palavra) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja Remover: ");
        System.out.println("1 - Vogais");
        System.out.println("2 - Consoante");
        System.out.print("Digite sua escolha: ");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            Character[] vogais = new Character[]{'a', 'A', 'á', 'Á', 'ã', 'Ã', 'Â', 'â',
                    'e', 'E', 'É', 'é', 'ê', 'Ê',
                    'i', 'I', 'Í', 'í',
                    'o', 'O', 'ó', 'Ó', 'õ', 'ô', 'Ô', 'Õ',
                    'u', 'U', 'ú', 'U'};
            List<Character> al = Arrays.asList(vogais);

            StringBuffer sa = new StringBuffer(palavra);

            for (int i = 0; i < sa.length(); i++) {

                if (al.contains(sa.charAt(i))) {
                    sa.replace(i, i + 1, "");
                    i--;
                }
            }
            System.out.println(sa);
        } else if (escolha == 2) {
            Character[] consoantes = new Character[]{'B', 'b', 'c', 'C', 'd', 'D', 'f', 'F', 'G', 'g',
                    'H','h','j', 'J', 'K', 'k', 'L', 'l', 'm', 'M', 'N', 'n','p', 'P', 'Q', 'q', 'r', 'R',
                    'S', 's', 't', 'T', 'V', 'v', 'w', 'W', 'X', 'x', 'Y', 'y', 'Z', 'z'};
            List<Character> al = Arrays.asList(consoantes);

            StringBuffer sb = new StringBuffer(palavra);

            for(int j = 0; j < sb.length(); j++){

                if (al.contains(sb.charAt(j))) {
                    sb.replace(j, j + 1, "");
                    j--;

                }
            }
            System.out.println(sb);

        }
    }
}



