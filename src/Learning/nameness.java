package Learning;

public class nameness {
    public static void main(String[] args) {
        Person p = new Person(){
            {
                super.setGender("men");//代码块代替构造方法
            }


            @Override
            public int getAge() {
                return super.getAge();
            }
        };
        final int width = 440 ;


        System.out.println(p.getGender());
    }
}

