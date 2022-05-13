package Extra02;


public class ConversaoBinarioEHexadecimal {

    public void escolhas(int numeroDecimal, int escolha){
        switch (escolha) {
            case 1 -> {
                int modulo;
                StringBuilder binario = new StringBuilder();
                while (numeroDecimal > 0) {
                    modulo = numeroDecimal % 2;
                    binario.append(modulo);
                    numeroDecimal /= 2;
                }
                System.out.println(new StringBuilder(binario.toString()).reverse());
            }
            case 2 -> {
                int resto;
                StringBuilder hexadecimal = new StringBuilder();
                while (numeroDecimal != 0) {
                    resto = numeroDecimal % 16;
                    numeroDecimal /= 16;
                    if (resto == 10) {
                        hexadecimal.append("A");
                    } else if (resto == 11) {
                        hexadecimal.append("B");
                    } else if (resto == 12) {
                        hexadecimal.append("C");
                    } else if (resto == 13) {
                        hexadecimal.append("D");
                    } else if (resto == 14) {
                        hexadecimal.append("E");
                    } else if (resto == 15) {
                        hexadecimal.append("F");
                    } else {
                        hexadecimal.append(resto);
                    }
                }
                System.out.println(new StringBuilder(hexadecimal.toString()).reverse());
                break;
            }
            default -> {
                if(escolha != 1 && escolha != 2){
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;

                }
            }

        }

    }

}



