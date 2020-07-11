package JavaSE.Reflect;

public class StaticClass {
    public static Class staticClass() throws ClassNotFoundException {
        Class c = Class.forName("JavaSE.Reflect.Student");
        return c;
    }
}
