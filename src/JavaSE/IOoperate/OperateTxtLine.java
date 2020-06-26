package JavaSE.IOoperate;

import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.source.tree.IfTree;

import java.io.*;

public class OperateTxtLine {
    public static void main(String[] args) {
        try {
            testChar("F:\\IOtest\\se.txt");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }


    public static void testChar(String path) throws Exception {
        FileReader reader = new FileReader(path);
        BufferedReader inBuff = new BufferedReader(reader);

        String string = null;
        while ((string = inBuff.readLine()) != null ){
            if (string.contains("spr")){
                System.out.println("line:"+string);
                System.out.println(string.indexOf("="));


            }

        }
        inBuff.close();
        reader.close();




    }
}
