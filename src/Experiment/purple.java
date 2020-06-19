package Experiment;

public class purple {
    public static void main(String[] args) {
        /*int ints[] = new int[3];
        ints[1] = 1;
        ints[0] = 0;
        ints[2] = 2;
        for (int i = 0; i < 3; i++) {
            System.out.println(ints[i]);
        }
        System.out.print("hello");*/

        for(float y=(float)1.5;y>-1.5;y-=0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
