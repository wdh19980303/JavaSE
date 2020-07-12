package JavaSE.ThreadRunning;

import java.nio.channels.NonWritableChannelException;
import java.security.PublicKey;

public class Store {
    public static void main(String[] args) {


        Clerk clerk = new Clerk();
        //消费时不生产
        //生产时不消费
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (clerk) {
                    while (true) {
                        if (Clerk.productNum == 0) {
                            System.out.println("产品数为0，开始生产");
                            while (Clerk.productNum < 4) {
                                Clerk.productNum++;
                                System.out.println("库存：" + Clerk.productNum);
                            }
                            System.out.println("产品数：" + Clerk.productNum);
                            clerk.notify();//唤醒消费者
                        } else {
                            try {
                                clerk.wait(); //生产者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "生产者").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (clerk) {
                    while (true) { //无限循环代表无限消费次数，
                        if (Clerk.productNum == 4) {

                            System.out.println("产品数为4，开始消费");
                            while (Clerk.productNum > 0) {
                                Clerk.productNum--;
                                System.out.println("库存：" + Clerk.productNum);
                            }
                            System.out.println("产品数：" + Clerk.productNum + "结束消费");
                            clerk.notify(); //唤醒生产者
                        } else {
                            try {
                                clerk.wait();//消费者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "消费者").start();
    }
}

class Clerk {
    public static int productNum = 0;
}