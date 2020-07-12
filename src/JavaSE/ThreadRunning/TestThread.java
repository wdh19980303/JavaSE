package JavaSE.ThreadRunning;

import jdk.swing.interop.SwingInterOpUtils;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("多线程代码");
        for (int i = 0; i < 5; i++) {
            System.out.println("多线程逻辑代码:" + i);
        }
    }
}
