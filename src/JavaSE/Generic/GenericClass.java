package JavaSE.Generic;

public class  GenericClass {
    public static void main(String[] args) {
        A<String> a = new A<>();//new 对象的时候确定了类型，不指定类型就是Object
        a.setKey("ws");
        System.out.println(a.getKey());
    }
}

class A<T>{
    private T key;
    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}