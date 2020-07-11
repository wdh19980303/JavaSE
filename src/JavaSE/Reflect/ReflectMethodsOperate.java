package JavaSE.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectMethodsOperate {
    public static void main(String[] args) {
        try {
            Class c = StaticClass.staticClass();


            Constructor con = c.getConstructor();
            Object ose = con.newInstance();

            Method me = c.getMethod("setField",String.class,int.class); //选择方法名称，以及参数类型
            me.invoke(ose,"China",23);//参数1是实例化的对象，后面两个参数是方法的实际参数

            Method pme = c.getDeclaredMethod("setSchool",String.class); //调用私有方法进行参数装填
            pme.setAccessible(true); //解除私有方法
            pme.invoke(ose,"nans");

            //调用一个重载方法
            Method overMethod = c.getDeclaredMethod("info");
            overMethod.invoke(ose);

            //有返回值的方法
            Method reMethod = c.getDeclaredMethod("getSchool" );

            System.out.println("school = " +reMethod.invoke(ose));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
