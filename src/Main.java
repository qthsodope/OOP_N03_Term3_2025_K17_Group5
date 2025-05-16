import test.UserTest;
import test.TimeTest;
import test.RecursionTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Test User ==");
        new UserTest().test();

        System.out.println("\n== Test Time ==");
        new TimeTest().test();

        System.out.println("\n== Test Recursion ==");
        new RecursionTest().test();
    }
}
