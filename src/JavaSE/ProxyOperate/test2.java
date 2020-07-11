package JavaSE.ProxyOperate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class test2 {
    public static void main(String[] args) {
        ITestDemo test = new ITestDemoImpl();
        //接口无法实例化，但是接口对象由实现接收，这是可以的，对应多态

        test.test1();
        test.test2();

        //要求：
        //在执行test1和test2时方法是需要加入一些东西
        //在执行方法前打印test1或test2开始执行
        //在执行方法后打印test2或test2执行完成

        InvocationHandler handler = new ProxyDemo(test);//选着代理对象


        /*
        * 参数1是代理对象的类加载器
        * 参数2是被代理对象的接口
        * 参数3是代理对象
        */
        ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);

        /* 注意一个对象要被Proxy.newProxyInstance方法代理
         * 那么这个对象一定要有接口
         * 就像本例子中的ITestDemo接口和实现类TestDemoImpl
         */





        t.test1();
        System.out.println("_________________");
        t.test2();

    }
}
