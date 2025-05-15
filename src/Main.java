import test.UserTest;
import test.ProductTest;
import test.OrderTest;
class Main{
    public static void main(String[] args) {

        //test User
        UserTest ut = new UserTest();
        ut.test();
         ProductTest pt = new ProductTest();
        pt.test();
        OrderTest ot = new OrderTest();
        ot.test();
    }
}
