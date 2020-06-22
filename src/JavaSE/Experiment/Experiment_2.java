package JavaSE.Experiment;

public class Experiment_2 {
    public static void main(String[] args) {
        String[] str = new String[]{"a","b","c"};
        for (int i = 0; i < 3 ;i++){
            try{
                System.out.println(str[i]);
            }catch (Exception exception) {
//                exception.printStackTrace();
                System.out.println(exception.getMessage());
            }finally {
                System.out.println("Exception");
            }

        }
    }

}
