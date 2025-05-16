package test;

import utils.Time;

public class TimeTest {
    public void test() {
        Time t = new Time(23, 59, 58);
        System.out.println("Initial Time: " + t);

        // thay doi time
        t.setHour(8);
        t.setMinute(15);
        t.setSecond(45);

        System.out.println("Updated Time: " + t);
    }
}
