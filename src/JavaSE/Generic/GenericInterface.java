package JavaSE.Generic;

public class GenericInterface {
    public static void main(String[] args) {
        Base1<Integer> base1 = new Base1<Integer>();
        Base2 base2 = new Base2();
        base1.test(1);
        base2.test("test");
    }
}

interface IB<T>{
    public T test(T t);
}

class Base1<T> implements IB<T>{
    @Override
    public T test(T t) {
        System.out.println(t);
        return t;
    }
}

class Base2 implements IB<String>{
    @Override
    public String test(String s) {
        System.out.println(s);
        return null;

    }
}