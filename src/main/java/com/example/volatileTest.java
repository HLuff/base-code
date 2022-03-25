package com.example;

public class volatileTest {
    private volatile int inc = 0;
    private volatile static int count = 10;

    private void increase() {
        ++inc;
    }

    public static void main(String[] args) {
        int loop = 10;
        volatileTest nothing = new volatileTest();
        while (loop-- > 0) {
            nothing.operation();
        }
    }

    private void operation() {
        final volatileTest test = new volatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    test.increase();
                }
                --count;
            }).start();
        }

        // 保证前面的线程都执行完
        while (count > 0) {

        }
        System.out.println("最后的数据为：" + test.inc);
    }
}
