package Ex001;

public class Primos{
    public void intervalo(int a, int b){
        for (int i = a; i <= b; i++){
            boolean primo = true;
            if(i == 1){
                primo = false;
            }
            for(int j = 2; j < i; j++){
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}


