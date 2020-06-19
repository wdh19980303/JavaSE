package Learning;

public class Solider extends Person {
    @Override

    public int getAge() {
        super.setAge(8);
        return super.getAge() + 1;
    }

    public static void main(String[] args) {
        Solider solider = new Solider();
        Person person = new Person();
        Person PLA = new Solider();
        System.out.println(PLA.getAge());
        System.out.println(solider.getAge());

    }
}

