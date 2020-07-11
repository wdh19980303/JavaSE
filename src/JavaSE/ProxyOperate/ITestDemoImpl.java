package JavaSE.ProxyOperate;



public class ITestDemoImpl implements ITestDemo  {
    int s1 = 1 ;
    int s2 = 1 ;



    @Override
    public void test1() {
        System.out.println("执行test1:"+s1);
        s1++;
    }

    @Override
    public void test2() {
        System.out.println("执行test2:"+s2);
        s2++;
    }
}
