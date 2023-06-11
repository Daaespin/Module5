package cen3024;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci{
    private static Map<Integer, Long> memoizationMap = new HashMap<>();
    public static long fibonacciRecursive(int n){
        if (n <= 1)
            return n;
        if (memoizationMap.containsKey(n))
            return memoizationMap.get(n);
        long fibo = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        memoizationMap.put(n, fibo);
        return fibo;
    }

    public static long fibonacciIterative(int n){
        if (n <= 1)
            return n;
        long fibo = 0;
        long prev1 = 1;
        long prev2 = 0;

        for (int i=2; i<=n; i++) {
            fibo = prev1 + prev2;
            prev2 = prev1;
            prev1 = fibo;
        }
        return fibo;
    }
}
