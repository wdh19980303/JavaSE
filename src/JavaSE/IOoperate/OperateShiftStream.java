package JavaSE.IOoperate;

import javax.swing.*;
import java.io.*;

public class OperateShiftStream {

    public static void main(String[] args) {
        String path = "F:\\IOtest\\se.txt";
        try {
            testInputStreamReader(path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        String out = "F:\\IOtest\\hello.txt";
        String filed ="哈喽，世界";

        try {
            testOutputStreamReader(out,filed);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //转换流 将字节转换为字符流
    //当文件全是字符的时候使用转换流效率更高

    //在转换字符流的时候，设置的字符集编码要与读取的文件数据编码一致
    public static void testInputStreamReader(String Path) throws Exception{
        FileInputStream Fis = new FileInputStream(Path);
//        File file = new File(Path);


        // 第一个参数是流，第二个是文件编码格式，必须与原文件保持一致
        InputStreamReader in =new InputStreamReader(Fis,"UTF-8");

        char[] chars = new char[1024];
        int length= 0 ;
        while ((length = in.read(chars)) != -1){
            System.out.println(new String(chars,0,length));
        }

        in.close();
        Fis.close();

    }

    //转换字符流输出流为字节流输出
    public static void testOutputStreamReader(String Path,String field) throws Exception{
        FileOutputStream Fos = new FileOutputStream(Path);
        OutputStreamWriter out = new OutputStreamWriter(Fos,"GBK");
        out.write(field);
        out.flush();
        Fos.close();
        out.close();

    }

}


