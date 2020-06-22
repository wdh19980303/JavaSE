package JavaSE.Factory;

public interface BWM {
    void showInfo();
}
class BMW3i implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马3系车");
    }
}
class BMW5 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马5系车");
    }
}
class BMW7 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马7系车");
    }
}
class BMW9 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("宝马9系车");
    }
}