package test;

import utils.Recursion;

public class RecursionTest {
    public void test() {
        int n = 5;
        System.out.println(n + "! = " + Recursion.factorial(n));
        System.out.println("Sum from 1 to " + n + " = " + Recursion.sumTo(n));
    }
}
