package Ex003;

public class Fibonacci {

    public void fibonacci(int n){
        int ultimo = 1;
        int penultimo = 1;

        if(n == 1 || n == 2){
            System.out.println("1");
        }
        else{
            System.out.println("0");
            System.out.println(ultimo);
            System.out.println(penultimo);
            int total;
            int soma = 0;
            for(int i = 0; i < n-3; i++) {
                total = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = total;
                soma += total;
                System.out.println(total);
            }
            int sequencia  = soma + 2;
            System.out.println("A soma dos "+ n +" primeiros termos é "+ sequencia);
        }
    }
}