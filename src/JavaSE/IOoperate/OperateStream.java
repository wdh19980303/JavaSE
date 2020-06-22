package JavaSE.IOoperate;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class OperateStream {
    public static void main(String[] args) {
        FileInputStream in;


        try {
            in = new FileInputStream("F:\\TestA\\testB\\my1.txt");

            byte[] b = new byte[99];//设置一个数组来接收读取问文件的内容
            int len = 0;//设置一个读取数据的长度


            //read方法有一个返回值，返回值是读取的数据的长度，还会向后读取到一个数据，此时返回-1，也就是返回-1就读取结束
            while ((len = in.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

            System.out.println(in.read(b));


            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        testFileOutputStream();
        String inPath = "F:\\TestA\\新建文本文档.txt";
        String outPath = "F:\\TestA\\testB\\hello\\world\\java\\新建文本文档.txt";
        CFChar(inPath,outPath);


    }


    //inPath为原路径，outPath为新路径
    //比特流没有文件格式要求
    public static void CF(String inPath,String outPath) {
        try {
            FileInputStream in = new FileInputStream(inPath);
            FileOutputStream out = new FileOutputStream(outPath);

            byte[] b = new byte[99999];
            int len = 0;
            while((len=in.read(b)) != -1){
                out.write(b,0,len);
            }

            out.flush();
            out.close();
            in.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //字符流只能使用文本文件
    public static void CFChar(String inPath,String outPath) {
        try {
            FileReader in = new FileReader(inPath);
            FileWriter out = new FileWriter(outPath);

            char[] b = new char[99999];
            int len = 0;
            while((len=in.read(b)) != -1){
                out.write(b,0,len);
            }

            out.flush();
            out.close();
            in.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testFileOutputStream() {
        try {
            FileOutputStream out = new FileOutputStream("F:\\TestA\\testB\\my4.txt");
            String str = "hello world 4";
            out.write(str.getBytes());//数据写到内存
            out.flush();//数据刷到硬盘
            out.close();//关闭流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
