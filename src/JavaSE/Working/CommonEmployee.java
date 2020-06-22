package JavaSE.Working;

public class CommonEmployee extends Employee {
    public void setCommonEmployeeInfo(int id, String name, double salary) {
        super.ID = id ;
        super.name = name ;
        super.salary = salary ;
    }



    @Override
    public void work() {
        System.out.println("普通员工");
    }
}
