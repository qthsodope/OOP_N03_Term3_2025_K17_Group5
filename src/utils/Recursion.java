package utils;

public class Recursion {
    // giai thua 
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // sum tu 1 -> n
    public static int sumTo(int n) {
        if (n <= 1) return 1;
        return n + sumTo(n - 1);
    }
}
