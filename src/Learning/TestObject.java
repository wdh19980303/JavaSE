package Learning;

public class TestObject {

    public void test(Object object) {

    }

    public static void main(String[] args) {
        TestObject testObject = new TestObject();
        Person person = new Person();
        Solider solider = new Solider();
        String stringcont = new String("sex");
        String stringtext = new String("sexs");
        System.out.println(stringcont == stringtext);
        System.out.println(stringcont.equals(stringtext));


        Inner inner = new Inner();


    }

}
