package JavaSE.IOoperate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.InvalidPropertiesFormatException;
import java.util.concurrent.BrokenBarrierException;

public class OperateWriteTargetFile {

    public static void main(String[] args) {

        String string = "F:\\IOtest\\hello.txt";
        try {
            OperateWriteSystemIn(string);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void OperateWriteSystemIn (String path) throws Exception {
        //接收键盘数据
        InputStreamReader is = new InputStreamReader(System.in);

        //把输入流放到缓冲流里
        BufferedReader br = new BufferedReader(is);

        BufferedWriter out = new BufferedWriter(new FileWriter(path));

        String line = "";
        while ((line=br.readLine()) != null){
            if(line.equals("over")){
                break;
            }

            out.write(line);
        }

        out.flush();

        is.close();
        br.close();
        out.flush();




    }
}
