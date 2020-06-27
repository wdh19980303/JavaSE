package JavaSE.Reflect;

import java.lang.reflect.Constructor;

public class StudentReflect {
    public static void main(String[] args) {

        Student student = new Student();

        try {
            Class studentClass = Class.forName("JavaSE.Reflect.Student");
            Class superClass = studentClass.getSuperclass(); //获取父类
            System.out.println(superClass.getName());

            Class[] interFaceClass = studentClass.getInterfaces();
            for (Class s : interFaceClass) {
                System.out.println("interFace" + s.getName());
            }

            Constructor[] constructors1 = studentClass.getConstructors(); //获取到类的公有构造方法
            Constructor[] constructors2 = studentClass.getDeclaredConstructors(); //获取全部的构造方法

            System.out.println("public");
            for (Constructor c : constructors1){

                System.out.println("__________________________________________");
                System.out.println("constructors:"+ c.getName()); //取得构造方法名称

                //取得修饰符，其中getModifiers返回值为1代表public，返回值为2为private
                System.out.println("constructors:"+ c.getName()+  "    mod:" + c.getModifiers());

                System.out.println("__________________________________________");
            }


            System.out.println("all");
            for (Constructor c : constructors2){
                System.out.println("__________________________________________");
                System.out.println("constructors:"+ c.getName()); //取得构造方法名称

                //取得修饰符，其中getModifiers返回值为1代表public，返回值为2为private
                System.out.println("constructors:"+ c.getName()+  "    mod:" + c.getModifiers());

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();


        }
    }
}
