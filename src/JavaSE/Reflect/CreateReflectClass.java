package JavaSE.Reflect;

public class CreateReflectClass {
    public static void main(String[] args) {
        Person p = new Person();
        Class C0 = Person.class;//通过类名.class创建指定的Class实例
        Class C1 = p.getClass();//通过类的实例对象来获取对应类的Class实例
        try {
            Class C2 = Class.forName("JavaSE.Reflect.Person"); //通过路径来获取类，路径包含包名，类名
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/*public final  */
