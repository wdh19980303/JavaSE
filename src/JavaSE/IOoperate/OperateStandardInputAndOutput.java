package JavaSE.IOoperate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperateStandardInputAndOutput {
    public static void main(String[] args) {
        testKeyBroad();

    }


    //获取键盘输入然后输出
    public static void testKeyBroad(){
        InputStreamReader Isr = new InputStreamReader(System.in);
        BufferedReader Br = new BufferedReader(Isr);

        String string = "";
        while (true){
            try {
                if (!((string = Br.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

                System.out.println(string);

        }

        try {
            Isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

