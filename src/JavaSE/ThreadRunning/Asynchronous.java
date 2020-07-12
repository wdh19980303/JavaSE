package JavaSE.ThreadRunning;

public class Asynchronous {
    public static void main(String[] args) {
        Account account = new Account();
        User user_weChat = new User(account, 2000);
        User user_aliPay = new User(account, 2000);
        Thread weChat = new Thread(user_weChat, "微信");
        Thread aliPay = new Thread(user_aliPay, "支付宝");
        weChat.start();
        aliPay.start();
    }
}

class Account {
    public static int money = 3000; //全局共享变量，所有操作都使用这个
    /*出现问题
     * 一个线程还没执行完，另一个线程也在进行
     * 最后导致资金变负数
     * 解决思路：在一个线程执行完这个方法之后，另一个方法才执行这个线程
     * 通过synchronized同步锁完成
     * */

    //将synchronized加到普通方法就行，但是实际上锁的是整个对象
    //不同的对象是不同锁

    //静态方法加同步锁，所有对象都是同一个锁

    public static synchronized void drawing(int m) {


        String threadName = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(threadName + "---" + "用户金额不足");
        } else {
            System.out.println("\n");
            System.out.println(threadName + "---" + "账户原有金额：" + money);
            System.out.println(threadName + "---" + "取款金额：" + m);
            money -= m;
            System.out.println(threadName + "---" + "账户余额：" + money);
        }


    }

    public synchronized void drawingSync(int m) {

        String threadName = Thread.currentThread().getName();


        //使用synchronized关键字代码块进行锁
        //this表示当前对象，如果其他方法中使用synchronized代码块，那么使用的是同一锁
        //如果代码块参数不是this而是其他对象，那么不同的对象对应不同的锁
        synchronized (this) {
            if (money < m) {
                System.out.println(threadName + "---" + "用户金额不足");
            } else {
                System.out.println("\n");
                System.out.println(threadName + "---" + "账户原有金额：" + money);
                System.out.println(threadName + "---" + "取款金额：" + m);
                money -= m;
                System.out.println(threadName + "---" + "账户余额：" + money);
            }
        }


    }

    public void drawingSyncSelect(int m, Account account) {
        synchronized (this) { //不同的对象有了不同的锁
            String threadName = Thread.currentThread().getName();
            //如果是微信操作，先不执行，等支付宝执行完成再执行微信操作
            if (threadName.equals("微信")) {

                try {
                    account.wait();//当前线程进入等待状态，等待进入阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }




            if (money < m) {
                System.out.println(threadName + "---" + "用户金额不足");
            } else {
                System.out.println("\n");
                System.out.println(threadName + "---" + "账户原有金额：" + money);
                System.out.println(threadName + "---" + "取款金额：" + m);
                money -= m;
                System.out.println(threadName + "---" + "账户余额：" + money);
            }

            if(threadName.equals("支付宝")){
                account.notify();//唤醒当前的优先最高的线程，进入就绪
            }

        }
    }
}

class User implements Runnable {
    Account account;
    int money;

    public User(Account account, int money) {
        this.account = account;
        this.money = money;

    }

    @Override
    public void run() {
        account.drawingSyncSelect(this.money,this.account);
    }
}


