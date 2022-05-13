package Ex006;

import java.util.*;

public class VetoresAeB {
    Scanner sc = new Scanner(System.in);
    static int[] vetorA;
    static int[] vetorB;

    public void gerarVetorA(int coluna) {
        int numero;
        vetorA = new int[coluna];

        for (int i = 0; i < coluna; i++) {
            System.out.print("VETOR A: Digite o " + (i + 1) + "º valor: "); //pedirá o valor ao usuário
            numero = sc.nextInt();
            vetorA[i] = numero; //incrementará o a váriavel(numero) na posição i(contagem).
        }
        System.out.println("\nVETOR A");
        System.out.println(Arrays.toString(vetorA)); //mostará o vetor A com colchetes
        System.out.println("-----------------------------");

    }

    public void gerarVetorB(int coluna) {
        int numeroB;
        vetorB = new int[coluna];
        for (int i = 0; i < coluna; i++) {
            System.out.print("VETOR B: Digite o " + (i + 1) + "º valor: ");
            numeroB = sc.nextInt();
            vetorB[i] = numeroB;
        }
        System.out.println("VETOR B");
        System.out.println(Arrays.toString(vetorB)); //mostará vetor B com colchetes
        System.out.println("-----------------------------");

    }

    public void intersecao(int coluna) {
        List<Integer> vetorInterseccao = new ArrayList<>(); // fazer vetor sem limites
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < coluna; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorInterseccao.add(vetorA[i]);
                }

            }

        }
        System.out.println("\nVetor Interseção");
        Arrays.sort(new List[]{vetorInterseccao}); // tirar duplicatas e mostará o vetor em ordem crescente
        System.out.println(vetorInterseccao); // mostrar os valores a intersecção do vetor A e B
        System.out.println("-----------------------------");
    }

    public void uniao() {
        int lenvetorA = vetorA.length;
        int lenvetorB = vetorB.length;
        int[] uniao = new int[lenvetorA + lenvetorB];
        System.arraycopy(vetorA, 0, uniao, 0, lenvetorA);
        System.arraycopy(vetorB, 0, uniao, lenvetorA, lenvetorB);
        Set<Integer> uniaodeAeB = new HashSet<>(); // Interface Set: são usados quando o programador não precisar ter nenhum dado duplicado na coleção
        for (int i : uniao) {
            if (uniaodeAeB.add(i)) {
            }
        }
        // visto que Set é uma Interface, então passaremos para array para por em ordem crescente
        System.out.println("\nVetor União");
        List<Integer> vetorUniao = new ArrayList<>(uniaodeAeB);
        Arrays.sort(new List[]{vetorUniao});
        System.out.println(vetorUniao);
        System.out.println("-----------------------------");


    }

    public void soma() {
        int[] vetorSoma = new int[vetorA.length];
        for (int i = 0; i < vetorSoma.length; i++) {
            for (int j = 0; j < vetorSoma.length; j++) {
                vetorSoma[i] = vetorA[i] + vetorB[i];
            }

        }
        System.out.println("\nVetor Soma");
        System.out.println(Arrays.toString(vetorSoma));
        System.out.println("-----------------------------");

    }
    public void diferencaAeB() {
        List<Integer> vetorDiferencaAeB = new ArrayList<>();
        int[] vetorCopiaDeA = new int[vetorA.length];
        int contador = 0;
        int resultado;
        for(int i = 0; i < vetorA.length; i++){
            vetorCopiaDeA[i] = vetorA[i];
        }
        while (contador < vetorB.length) {
            resultado = vetorB[contador]; // resultado é igual ao valor da posição B
            for (int i = 0; i < vetorA.length; i++) {
                if (vetorCopiaDeA[i] == resultado) { // se valor da posição i do vetor A for igual ao resultado
                    vetorCopiaDeA[i] = -1; //subtraí o valor e finalizá ai volta
                    break;
                }
            }
            contador++; // contando o laço do while
        }
        for (int i = 0; i < vetorCopiaDeA.length; i++) {
            if (vetorCopiaDeA[i] >= 0) {
                vetorDiferencaAeB.add(vetorCopiaDeA[i]);

            }
        }
        System.out.println("\nVetor diferença A-B");
        System.out.println(vetorDiferencaAeB);
        System.out.println("-----------------------------");
    }

    public static void diferencaBeA() {
        List<Integer> vetorDiferencaBeA = new ArrayList<>();
        int contador = 0;
        int resultado;
        while (contador < vetorB.length){
            resultado = vetorA[contador]; // resultado é igual ao valor da posição B
            for (int i = 0; i < vetorB.length; i++) {
                if (vetorB[i] == resultado) { // se valor da posição i do vetor A for igual ao resultado
                    vetorB[i] = -1; //subtraí o valor e finalizá ai volta
                    break;
                }
            }
            contador++; // contando o laço do while
        };
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] >= 0) {
                vetorDiferencaBeA.add(vetorB[i]);

            }
        }
        System.out.println("\nVetor diferença B-A");
        System.out.println(vetorDiferencaBeA);
        System.out.println("-----------------------------");
    }
}







