/*
面试题9：求Fibonacci数列的第n项
*/

public class Fibonacci{
    public long fibonacci(int n){
        if(n < 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacciNew(int n){
        int [] result = {0, 1};
        if(n < 2)
            return result[n];
        long fibNMinusOne = 1;
        long fibNMinusTwo = 0;
        long fibN = 0;
        for(int i = 2; i <= n; i++){
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }
}