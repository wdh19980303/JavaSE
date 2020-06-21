package Factory;

public class FactoryCar  {
    public static void main(String[] args) {
        BWM b3 = new BWM3Factory().productBMW();
        BWM b5 = new BWM5Factory().productBMW();
        b3.showInfo();
        b5.showInfo();
    }

}
