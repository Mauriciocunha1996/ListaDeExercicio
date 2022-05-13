package Ex006;


import java.util.Scanner;

public class Principal006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int coluna;

        System.out.print("Digite quantos números deseja digitar no vetor: ");
        coluna = sc.nextInt();

        //Gerar Vetor A
        VetoresAeB vetorA = new VetoresAeB();
        vetorA.gerarVetorA(coluna);
        //Gerar Vetor B
        VetoresAeB vetorB = new VetoresAeB();
        vetorB.gerarVetorB(coluna);
        //Gerar Vetor Intersecao
        VetoresAeB vetorIntersecao = new VetoresAeB();
        vetorIntersecao.intersecao(coluna);
        //Gerar Vetor Uniao
        VetoresAeB vetorUniao = new VetoresAeB();
        vetorUniao.uniao();
        //Gerar Vetor soma
        VetoresAeB vetorSoma = new VetoresAeB();
        vetorSoma.soma();
        //Gerar Vetor diferença entre A-B
        VetoresAeB vetorDiferencaAeb = new VetoresAeB();
        vetorDiferencaAeb.diferencaAeB();
        //Gerar Vetor diferença entre B-A
        VetoresAeB vetorDiferencaBeA = new VetoresAeB();
        vetorDiferencaBeA.diferencaBeA();


    }
}
