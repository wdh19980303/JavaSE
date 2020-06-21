package Factory;

public interface BWMFactory {
    BWM productBMW();
}

class BWM3Factory implements BWMFactory{
    @Override
    public BWM productBMW() {
        System.out.println("生产宝马3系");
        return new BMW3i();
    }
}
class BWM5Factory implements BWMFactory{
    @Override
    public BWM productBMW() {
        System.out.println("生产宝马5系");
        return new BMW5();
    }
}
class BWM7Factory implements BWMFactory{
    @Override
    public BWM productBMW() {
        System.out.println("生产宝马7系");
        return new BMW7();
    }
}
class BWM9Factory implements BWMFactory{
    @Override
    public BWM productBMW() {
        System.out.println("生产宝马9系");
        return new BMW9();
    }
}

