package JavaSE.Experiment;

public class Experiment_1 {
    public static void main(String[] args) {
        A a = new A();
        a.testB();
        a.testC();
    }
}

class A {
    public void testB() {
        new InnerB().testB();
    }

    public void testC() {
        new InnerC().testC();

    }

    private class InnerB extends B {
        @Override
        public void testB() {
            System.out.println("重写b方法");
        }
    }

    private class InnerC extends C {
        @Override
        public void testC() {
            System.out.println("重写c方法");
        }
    }

}

class B {
    public void testB() {

    }
}

class C {
    public void testC() {

    }
}