package JavaSE.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectFields {
    public static void main(String[] args) {
        //            Field[] fs = c.getFields();//获取本类包括父类公有的属性
            /*Field[] fs = c.getDeclaredFields();//获取本类的全部的属性
            for(Field f : fs){
                System.out.println("________________");
                System.out.println("修饰符:"+ f.getModifiers());
                System.out.println("类型:"+ f.getType());
                System.out.println("名称:"+ f.getName());

                System.out.println("_________________");

            }

            Package p = c.getPackage(); //获取类所在的包
            System.out.println(p.getName());*/



        try {
            Class c = StaticClass.staticClass();
            Constructor con = c.getConstructor();
            Student stu = (Student)con.newInstance();
            Field score = c.getField("score"); //选取属性
            score.set(stu,12); //设置stu的属性值
            System.out.println(score.get(stu));

            Field school = c.getDeclaredField("school"); //获取私有属性
            school.setAccessible(true);//破除私有封装
            school.set(stu,"mi"); //设置私有的属性
            System.out.println(school.get(stu));





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
