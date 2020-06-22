package JavaSE.Working;

public class Manger extends Employee {
    @Override
    public void work() {
        System.out.println("这是领导");
    }
    double bonus ;

    public void setMangerInfo(int id, String name, double salary ,int bonus) {
        super.ID = id ;
        super.name = name ;
        super.salary = salary ;
        this.bonus = bonus ;
    }

    public void getMangerInfo() {
        System.out.println(super.ID);
        System.out.println(super.name);
        System.out.println(super.salary);
        System.out.println(this.bonus);
    }
}
