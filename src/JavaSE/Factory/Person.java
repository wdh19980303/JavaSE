package JavaSE.Factory;

import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;


    private int age = 0;
    private String address = "";
    private String employee = "";
    private String gender = "";

//    TestPerson tp = new TestPerson();



    public Person() {


    }

    /*{
        System.out.println("非静态代码块");
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
