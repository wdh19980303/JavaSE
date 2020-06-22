package JavaSE.Experiment;

import javax.swing.*;
import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

public class Experiment_5 {
    public static void main(String[] args) {
        new BCC().test1();
        new BCC().test2();

        @SuppressWarnings({})
        List list = new ArrayList();

        BCC bcc = new BCC();
        System.out.println(bcc.name);
    }
}

class ACC {
    public void test1() {
    }
}

class BCC extends ACC {
    @TestAnn(id = 100, desc = "desc")
    String name;


    @Override //重写方法
    public void test1() {
        super.test1();
    }

    @Deprecated //过时方法
    public void test2() {
    }

}

@Target(ElementType.FIELD) //这个注解类是给其它类的属性做注解
@Retention(RetentionPolicy.RUNTIME) //定义注解的生命周期
@Documented
@interface TestAnn {
    public int id() default 0;

    public String desc() default "";

}