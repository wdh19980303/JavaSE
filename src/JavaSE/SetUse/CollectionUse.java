package JavaSE.SetUse;

import java.util.*;

public class CollectionUse {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("2b");
        list.add("b32");
        list.add("1b");
        list.add("bc");
        list.add("b");
        list.add("b");
        list.add("b");
        System.out.println(list);
        Collections.reverse(list); //翻转排序
        System.out.println(list);
        Collections.shuffle(list);//随机排序
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);//按字典升序
        Collections.swap(list,3,2);//交换指定位置的
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list,"b"));// 返回指定集合指定对象出现的次数
        Collections.replaceAll(list,"b","Auto");
        System.out.println(list);






        /*List<Student> students = new ArrayList<Student>();
        Student student_1 = new Student(98,"whs");
        Student student_2 = new Student(15,"wes");
        Student student_3 = new Student(41,"wsc");
        Student student_4 = new Student(12,"whd");

        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_4);
        for(Student student:students){
            System.out.println("name:"+student.name+"___"+"age:"+student.age);
        }

        System.out.println('\n');
        Collections.sort(students,new Student()); //进行自定义排序
        Student studentMin = Collections.min(students,new Student());
        Student studentMax = Collections.max(students,new Student());
        System.out.println("name:"+studentMin.name+"___"+"ageMin:"+studentMin.age);//返回自定义排序的最小值对象
        System.out.println("name:"+studentMax.name+"___"+"ageMax:"+studentMax.age);//返回自定义排序的最大值对象


        //自定义的排序方式
        for(Student student:students){
            System.out.println("name:"+student.name+"___"+"age:"+student.age);
        }*/

    }


}

class Student implements Comparator<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age > o2.age) {
            return 1;
        }
        else if (o1.age < o2.age) {
            return -1;
        }

        else return 0;

    }
}
