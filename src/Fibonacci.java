import java.util.HashMap;
import java.util.Map;

/**
 * Buatlah fungsi untuk menampilkan n bilangan Fibonacci pertama
 * 0,1,1,2,3,5,8,13
 * n-1 , n-2
 * (n-1)-1, (n-1)-2  | ((n-2)-1), ((n-2)-2)
 */
public class Fibonacci {
    public static void main(String[] args) {
        int input = 10;
//        showFib(input);
//        System.out.println();
        showFibonacci(input);
    }
    private static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void showFib(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        }
    }

    Map<Integer,Integer> cache = new HashMap<>();
    public int fibOptimized(int n){
        if(cache.containsKey(n)){
            return cache.get(n);
        }else {
            if(n<=1){
                return n;
            }else{
                int result = fibOptimized(n-1) + fibOptimized(n-2);
                cache.put(n,result);
                return result;
            }
        }
    }

    public static void showFibonacci(int n){
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibOptimized(i)+" ");
        }
    }



}