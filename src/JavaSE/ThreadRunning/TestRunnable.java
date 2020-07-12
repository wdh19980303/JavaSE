package JavaSE.ThreadRunning;

import java.util.concurrent.ThreadLocalRandom;

public class TestRunnable implements Runnable {
    int count = 0;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "----多线程代码:runnable");
        for (int i = 0; i < 5; i++) {
          /*  count++;*/
           /* System.out.println(Thread.currentThread().getName() + "多线程逻辑代码:" + i);*/
            System.out.println(Thread.currentThread().getName()+":"+count++);
        }
    }
}