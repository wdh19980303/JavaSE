package JavaSE.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectMethods {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("JavaSE.Reflect.Student");
        Method[] methods = c.getMethods(); //获取公有的方法数组
//        Method[] methods = c.getMethods(); //获取全部的方法数组
        for (Method m : methods) {
            System.out.println("-------------------------------------");
            System.out.println("methodName:" + m.getName());
            System.out.println("returnTypeName:" + m.getReturnType());
            System.out.println("modifiers:" + m.getModifiers());
            Class[] pcs = m.getParameterTypes(); //参数类型返回的是数组

            if (pcs != null && pcs.length > 0) {
                for (Class s : pcs) {
                    System.out.println("参数类型:" + s.getName());
                }

            }
            System.out.println("-------------------------------------");

        }

    }
}
