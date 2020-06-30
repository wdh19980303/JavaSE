package JavaSE.Reflect;

import java.lang.reflect.Constructor;
import java.net.SocketTimeoutException;

public class ReflectConstruct {
    public static void main(String[] args) {

        //Student student = new Student();

        try {
            //利用反射的构造方法来创建对象
            Class studentClass = Class.forName("JavaSE.Reflect.Student");
            //利用反射的得到的Class获取的构造方法构造对象,不填代表无参构造，填了参数要在getConstructor()的括号中补上Type.class
            Object obj = studentClass.getConstructor(int.class).newInstance(2);
            Student student = (Student)obj;

            //利用反射破除封装调用私有方法构造对象
            Constructor c = studentClass.getDeclaredConstructor(int.class,String.class); //指定使用对应参数类型的构造器
            c.setAccessible(true); //解除私有的封装，进行调用
            Student stu = (Student)c.newInstance(2,"set"); //填入参数




            /*Class studentClass = Class.forName("JavaSE.Reflect.Student");
            Class superClass = studentClass.getSuperclass(); //获取父类
            System.out.println(superClass.getName());

            Class[] interFaceClass = studentClass.getInterfaces(); // 获取接口
            for (Class s : interFaceClass) {
                System.out.println("interFace" + s.getName());
            }

            Constructor[] constructors1 = studentClass.getConstructors(); //获取到类的公有构造方法
            Constructor[] constructors2 = studentClass.getDeclaredConstructors(); //获取全部的构造方法


            System.out.println("public");
            for (Constructor c : constructors1) {

                System.out.println("__________________________________________");
                System.out.println("constructors:" + c.getName()); //取得构造方法名称

                //取得修饰符，其中getModifiers返回值为1代表public，返回值为2为private
                System.out.println("constructors:" + c.getName() + "    mod:" + c.getModifiers());

                System.out.println("__________________________________________");
            }


            System.out.println("all");


            for (Constructor c : constructors2) {
                System.out.println("__________________________________________");
                System.out.println("constructors:" + c.getName()); //取得构造方法名称

                //取得修饰符，其中getModifiers返回值为1代表public，返回值为2为private
                System.out.println("constructors:" + c.getName() + "    mod:" + c.getModifiers());

                Class[] pcs = c.getParameterTypes();//获取参数类型，返回数组，有几个参数就返回几个数组
                for (Class pc : pcs) {
                    System.out.println("______________type_______________");
                    System.out.println("ConstructName " + c.getName() + "type:    " + pc.getName());//遍历获取当前构造方法的参数类型
                    System.out.println("______________type_______________");
                }


            }*/

        } catch (Exception e) {
            e.printStackTrace();





        }
    }
}
