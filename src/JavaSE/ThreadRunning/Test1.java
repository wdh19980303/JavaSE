package JavaSE.ThreadRunning;

public class Test1 {
    public static void main(String[] args) {
        /*Thread t0 = new TestThread();
        Thread t1 = new TestThread();
        t0.start();//启动线程，运行run方法 ，异步执行 相对于main()
        t1.start();//与上一条代码异步执行*/
//        TEST(); //同步代码

        /*Thread t3 = new Thread( new TestRunnable());  // 利用runnable实现线程
        t3.start();

        Thread t4 = new Thread(new TestRunnable(),"t4");
        //第一个参数，线程实例，第二个参数是线程名称
        t4.start();*/

        Runnable target = new TestRunnable();
        Thread t3 = new Thread(target);  // 利用runnable实现线程
        t3.start();

        Thread t4 = new Thread(target, "t4");
        t4.start();

        System.out.println("__________________");
        System.out.println("__________________");
        System.out.println("__________________");

        /*
         *从控制台多次运行main方法
         *main方法的打印与线程运行的是混合的
         *而且main方法中的打印与run方法中的打印语句顺序是不固定的

         *为什么？
         *main方法运行t0在开启多线程后，t0.start()后面的代码与其自身的代码无关了
         *两个代码并行运行，各不相干
         *控制台输出的结果由两条并行程序的结果总和
         */
    }

    public static void  TEST(){
        System.out.println("多线程代码");
        for (int i = 0; i < 5; i++) {
            System.out.println("多线程逻辑代码:" + i);
        }
    }
}
