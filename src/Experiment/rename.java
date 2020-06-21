package Experiment;

import java.io.File;
import java.io.IOException;

public class rename {
    public static void main(String[] args) {
        File file = new File("f:\\1.txt");
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //调用renameTo()前
        System.out.println(file.exists());
        file.renameTo(new File("f:\\2.txt"));
        //调用renameTo()后
        System.out.println(file.exists());
    }
}
