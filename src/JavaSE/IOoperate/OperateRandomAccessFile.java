package JavaSE.IOoperate;

import java.io.RandomAccessFile;

public class OperateRandomAccessFile {
    public static void main(String[] args) {

        try {
            testRandomAccessWrite(PathString.path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            testRandomAccessRead(PathString.path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void testRandomAccessRead(String path) throws Exception {
        //RandomAccessFile的构造有两个参数，参数1是读写的文件的路径
        //参数2是指定 RandomAccessFile 的访问模式
        //r: 以只读方式打开
        //rw：打开以便读取和写入
        //rwd:打开以便读取和写入；同步文件内容的更新
        //rws:打开以便读取和写入；同步文件内容和元数据的更新
        //最常用是r和rw

        RandomAccessFile RAF = new RandomAccessFile(path, "r");
        RAF.seek(0); //读取位置，包含换行符，按字符来的  通过设置文件起始点来去读取文件的任意位置
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = RAF.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, length));
            System.out.println(length);
        }
        RAF.close();
    }

    public static void testRandomAccessWrite(String path) throws Exception {
        RandomAccessFile RAF =new RandomAccessFile(path,"rw");
        RAF.seek(0); //从起始点写
        //注意，如果从中间或者开头写，会替换掉等长的内容
        RAF.seek(RAF.length()); //从结尾的地方开始
        RAF.write("hello".getBytes());
    }
}
