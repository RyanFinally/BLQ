import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Buatlah fungsi untuk menampilkan n bilangan Fibonacci pertama
 * 0,1,1,2,3,5,8,13
 * n-1 , n-2
 * (n-1)-1, (n-1)-2  | ((n-2)-1), ((n-2)-2)
 */
public class Fibbonaci {
    public static void main(String[] args) {
        int input = 10;
        showFib(input);
    }
    private static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void showFib(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        }
    }




}
