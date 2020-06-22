package JavaSE.Learning;

//懒汉单例模式
public class Singleto {
    //私有化方法，外面无法使用
    private Singleto() {

    }

    private static Singleto singleto = null; //先初始化，但是不分配空间

    public static Singleto getInstance() {
        if (singleto == null){
            singleto =new Singleto(); //如果第一人来进行空间分配
        }

        return singleto;
    }




}
