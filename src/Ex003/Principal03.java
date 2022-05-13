package Ex003;
import java.util.Scanner;

public class Principal03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();

        Fibonacci fb = new Fibonacci();
        fb.fibonacci(n);
        }
    }
