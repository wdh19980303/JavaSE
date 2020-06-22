package JavaSE.Experiment;

public class Experiment_4 {


    public static void main(String[] args) {
        Season Spring1 = Season.SPRING;
        Season Spring2 = Season.SPRING;
        Spring1.showInfo();
        System.out.println(Spring1.equals(Spring2)); //枚举得到的单例模式 每一个Season.SPRING都指向同一个对象
        Spring1.test();
    }

}

enum Season implements testIF{

    SPRING("春天", "舒服"),
    SUMMER("夏天", "睡觉"),
    AUTUMN("秋冬", "收货"),
    WINTER("冬天", "白雪");//此处相当于有参数构造
    private final String Name;
    private final String Desc;

    private Season(String name, String desc) {
        this.Desc = desc;
        this.Name = name;
    }

    public void showInfo() {
        System.out.println(this.Name + this.Desc);
    }

    @Override
    public void test() {
        System.out.println("这是枚举实现的方法");
    }
}

interface testIF {
    void test();
}