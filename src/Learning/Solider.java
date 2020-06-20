package Learning;

public class Solider extends Person {
    static String country ;
    @Override
    public int getAge() {
        super.setAge(8);
        return super.getAge() + 1;
    }





    public static void main(String[] args) {
        /*Solider solider = new Solider();
        Person person = new Person();
        Person PLA = new Solider();
        System.out.println(PLA.getAge());
        System.out.println(solider.getAge());*/
        int i = 5;
        Solider.country = "China" ;
        Solider sun = new Solider();
        System.out.println(country);
        double s= (float) (Math.random() * 10 + 10);
        System.out.println(s);
        String strings = "e" ;
        System.out.println(Utils.isEmpty(strings));

        Single single = Single.getInstance();
        Singleto singleto = Singleto.getInstance();
        Person person = new Person();







    }
}

