package JavaSE.Learning;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("给爷爬");
    }

    @Override
    public void action() {
        System.out.println("给我变");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.action();
        cat.move();
    }
}
