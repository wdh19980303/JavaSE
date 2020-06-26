package JavaSE.IOoperate;

import javax.xml.crypto.Data;
import java.io.*;

//数据流 做基本类型数据的读写
public class OperateDataStream {
    final static String string = "F:\\IOtest\\hello.txt";

    public static void main(String[] args) {
        try {
            outDataStream(string);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            inDataStream(string);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    //数据流 写入和读入文件 类型一致才能正常读取
    public static void outDataStream (String path) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
        out.writeBoolean(true);
        out.flush();
        out.close();

    }

    public static void inDataStream(String path) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream(path));
        System.out.println(in.readBoolean());
        in.close();


    }
}

