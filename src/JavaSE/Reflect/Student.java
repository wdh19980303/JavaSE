package JavaSE.Reflect;

public class Student extends Person implements Move, Study {
    int ad = 0;
    String school = "";

    public Student() {
    }

    public Student(int ad) {
        this.ad = ad;
    }

    private Student(String school) {
        this.school = school;
    }

    @Override
    public void moveType() {
        System.out.println("火箭上学");
    }

    @Override
    public void info() {
        System.out.println("自行车上学");
    }
}
