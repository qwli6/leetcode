package com.qiwen.interview;

/**
 * StringBuilder 线程不安全示例
 * @author liqiwen
 * @since 1.2
 * @version 1.2
 */
public class StringBuilderDemo {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 10; i++){

            new Thread(() -> {
                for(int j = 0; j < 1000; j++) {
                    stringBuilder.append("a");
                }
            }).start();
        }

        Thread.sleep(2000);
        System.out.println("StringBuilder 的实际长度为: " + stringBuilder.length());
    }
}
