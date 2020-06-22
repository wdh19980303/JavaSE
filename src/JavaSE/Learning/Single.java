package JavaSE.Learning;

public class Single {

    //饿汉模式
    private Single() {

    }

    private  static Single single = new Single(); //私有的Single类变量
    public static Single getInstance(){
        return  single;
    }


}
