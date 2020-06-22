package JavaSE.Experiment;

public class Experiment_3 {
    public static void main(String[] args)  {
        /*testB b = new testB();
        try{//throws在代码这里抛出异常，调用捕获方法处理
            b.test();
        }catch (Exception exception){
            exception.printStackTrace();
        }*/
        testB b = new testB();

        try {
            b.test1(150);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}

class testB {
    int age;

    public void test(int age) throws Exception {
        this.age = age;
        if (age > 0 && age < 100)
            System.out.println("年龄为"+age);
        else throw new Exception("年龄错误范围错误");
    }

    public void test1(int age) throws myException {
        this.age = age;
        if (age > 0 && age < 100)
            System.out.println("年龄为"+age);
        else throw new myException("年龄错误范围错误,你玩尼玛呀");
    }
}

class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}