package JavaSE.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        DD dd = new DD();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        dd.test(strings);
        List<C1> c1 = new ArrayList<>();
        List<A1> a1 = new ArrayList<>();
        List<B1> b1 = new ArrayList<>();
        List<D1> d1 = new ArrayList<>();


    }


}

class DD {
    public void test(List<?> list) {//test方法需要一个list集合的参数，但是不确定list集合的具体类型
        System.out.println(list);
    }

    public void test1(List<? extends C1> list) { //参数是C1及其子类

    }

    public void test2(List<? super C1> list) {//参数是C1及其父类

    }

    public void test3(List<? extends interfaceTest> list) {//参数是interfaceTest的实现类

    }

}

class A1 {
}

class B1 extends A1 {
}

class C1 extends B1 {
}

class D1 extends C1 {
}

interface interfaceTest{

}

class APItest implements interfaceTest{}