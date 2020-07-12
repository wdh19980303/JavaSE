package JavaSE.ThreadRunning;

public class
Test2 {
    public static void main(String[] args) {
        Runnable run0 = new TestRunnable();
        Thread t0 = new Thread(run0,"run0");
        Runnable run1 = new TestRunnable();
        Thread t1 = new Thread(run1 ,"run1");
        //线程优先级，那个线程有较大的概率执行，优先级在1——10表示，数字越大，优先级越高
        //如果没有设置优先级，优先级默认为5
        //优先级只是提高概率，并不是强制

        /*t0.setPriority(10); // 设置线程优先级
        t1.setPriority(1);*/

        t0.start();
        t1.start();
        System.out.println(t0.getPriority()); //获取优先级，返回int
        System.out.println(t1.getPriority());
        System.out.println(t0.getName()); //如果创建线程没有定义名称，则会在使用时分配名称
        System.out.println(t1.getName());

        System.out.println("----------------1");
        System.out.println("----------------2");
       /* try {
            t1.join();
            *//*
             *专业的说法
             * 阻塞当前的main方法，先不执行System.out.print("-----------3")
             * join的线程执行完成过后再执行
             *//*
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("----------------3");
    }
}

class TestRun implements Runnable {
    int count = 0;


    @Override
    public void run() {


        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5;i++){
            /*if(i%2 == 0){

                Thread.yield();//线程让步
                System.out.println("线程让步");
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+count++);
            System.out.println("\n");
        }
    }
}