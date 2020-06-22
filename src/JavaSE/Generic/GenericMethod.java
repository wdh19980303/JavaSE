package JavaSE.Generic;

public class GenericMethod {
    public static void main(String[] args) {
        CC<String> cc = new CC<String>();
        cc.setE("这个是泛型");
        cc.tset1();


    }
}

class CC<E> {

    private E e;
    //无返回值的的泛型方法
    public static void test3(){
//        System.out.println(e); 在静态方法中，不能使用类定义的泛型，只能使用自己定义的泛型
    }

    public void setE(E e) {
        this.e = e;
    }

    public  <T> void tset1(){
        System.out.println(e);
    }









}