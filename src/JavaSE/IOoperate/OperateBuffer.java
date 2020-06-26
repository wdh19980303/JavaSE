package JavaSE.IOoperate;

import java.io.*;

public class OperateBuffer {

    public static void main(String[] args) {
        /*String Path = "F:\\IOtest\\se.txt";
        testBufferedInputStream(Path);
        try {
            testBufferedOutputSteam(Path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("___________________________________________");
        testBufferedInputStream(Path);*/

        String source = "F:\\IOtest\\hello.txt";
        String target = "F:\\IOtest\\新建文件夹\\world.txt";
        try {
            Copy(source,target);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        testBufferedInputStream(target);

    }
    //缓冲输入流 字节
    public static void testBufferedInputStream(String Path) {
        try {
            FileInputStream in = new FileInputStream(Path);
            BufferedInputStream brIn = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = brIn.read(bytes)) != -1){
                System.out.println(new String(bytes,0,length));
            }
            //关闭一个流的时候，最晚开的最早关，最早开的最晚关
            brIn.close();
            in.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //缓冲输出流 字节
    public static void testBufferedOutputSteam(String Path) throws Exception {
        FileOutputStream out = new FileOutputStream(Path);
        BufferedOutputStream outputStream = new BufferedOutputStream(out);
        String s = "hello world!";
        out.write(s.getBytes());
        out.flush();
        out.close();

    }

    //复制函数 字节
    public static void Copy(String source , String target) throws Exception{
        BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream(target));
        BufferedInputStream in = new BufferedInputStream( new FileInputStream(source));

        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = in.read(bytes)) != -1){
            out.write(bytes,0,length);
        }

        out.flush();
        out.close();
        in.close();
    }



}
