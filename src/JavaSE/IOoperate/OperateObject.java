package JavaSE.IOoperate;

import java.io.*;
import java.nio.file.Path;
//序列化与反序列化
//序列化类类要实现接口


public class OperateObject  {


    public static void main(String[] args) {
        String path = "F:\\JetBrains\\IntelliJ IDEA\\src\\JavaSE\\IOoperate\\object.txt";
        try {
            testSerialize(path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            testDeserialize(path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void testSerialize(String path) throws Exception {
        //定义对象输出，将其放到指定文件中
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));

        Person person = new Person();
        person.setEmployee("police");
        person.setAge(12);
        person.setGender("man");
        person.setAddress("China");

        out.writeObject(person);
        out.flush();
        out.close();

    }

    public static void testDeserialize(String path) throws Exception{
        ObjectInputStream  in = new ObjectInputStream(new FileInputStream(path));
        Object object = in.readObject();
        Person p = (Person)object;
        System.out.println(p.getAddress());

    }

}
