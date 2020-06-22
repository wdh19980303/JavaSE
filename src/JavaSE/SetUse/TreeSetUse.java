package JavaSE.SetUse;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUse {
    public static void main(String[] args) {
        /*Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(4);
        set.add(2);
        set.add(9);
        System.out.println(set);

        for(int i : set){
            System.out.println(i);
        }*/

        Set<Person> set = new TreeSet<Person>(new Person());
        Person p1 = new Person(12,"张三");
        Person p2 = new Person(15,"张手");
        Person p3 = new Person(8,"韩武");
        Person p4 = new Person(199,"劳历史");


        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        for(Person p : set){
            System.out.println(p.name+"年龄："+p.age);
        }

    }
}

class Person implements Comparator<Person> {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age>o2.age){
            return 1;
        }

        else if (o1.age<o2.age){
            return -1;
        }
        else return 0;


    }


}