package JavaSE.ProxyOperate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDemo implements InvocationHandler {
    Object object;//被代理的对象
    public ProxyDemo(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"开始执行");
        Object result = method.invoke(this.object,args);

        System.out.println(method.getName()+"执行完成");
        return result;
    }
}
