package JavaSE.IOoperate;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class OperateFile {
    public static void main(String[] args) {
        //注意 \是分隔符，但是一个java中，一个\是转义符，所以要两个\\代表分隔符
        File file = new File("F:\\TestA\\testB\\my.txt");//这个时候file是my.txt
        File path = new File("F:\\TestA\\testB");//这个时候file是my.txt
        File srcJava = new File("src/JaveSE");//这个时候file是my.txt
        //也可以用File.separator代表分隔符
        System.out.println(file.getName()); //获取当前文件名
        System.out.println(path.getName()); //获取当前文件夹名
        System.out.println(path.getPath()); //获取当前文件夹路径
        System.out.println(srcJava.getAbsolutePath()); //获取当前文件夹或者文件的绝对路径
        System.out.println(srcJava.getParent());//当前文件的或者文件夹的父级路径
        file.renameTo(new File("F:\\TestA\\testB\\my1.txt")); //修改文件名
        File file2 = new File("F:\\TestA\\testB\\my1.txt");
        System.out.println(file.exists());//判断文件夹或者文件是否存在
        System.out.println(file2.exists());
        System.out.println(file2.canRead());//判断文件是否可读
        System.out.println(file2.canWrite());//判断文件是否可写
        System.out.println(file2.isFile());//判断是不是文件
        System.out.println(file2.isDirectory());//判断是不是文件夹
        System.out.println(file2.length());//返回文件长度，单位字节
        System.out.println(file2.lastModified());//返回上一次修改的时间

        File creFile = new File("F:\\TestA\\testB\\my2.txt");
        if (!creFile.exists()) {
            try {
                creFile.createNewFile();//创建新文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(creFile.exists());
        //creFile.delete(); //删除文件
        System.out.println(creFile.exists());

        File f9 = new File("F:\\TestA\\testB\\hello");
        f9.mkdir();//创建单层目录
        File f10 = new File("F:\\TestA\\testB\\hello\\world\\java");
        f10.mkdirs(); //创建多层目录
        File f11 = new File("F:\\TestA");
        String[] filetree = f11.list(); //返回当前文件夹的子集的名称，包括目录和文件
        File[] filestree = f11.listFiles(); //返回当前文件夹的子集的的file对象，包括目录和文件


        System.out.println("____________________");
        for (String s : filetree) {
            System.out.println(s);
        }
        System.out.println("____________________");
        for (File filein : filestree) {
            System.out.println(filein);
        }

        System.out.println("_______________________");
        File file1 = new File("F:\\TestA");
        nameDD(file1);

    }


    //遍历文件夹下所有的文件，无论层级有多深 ==递归遍历
     static void nameDD(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是文件夹");
            File[] files = file.listFiles();
            if (files != null && files.length > 0) {
                for (File fileDOC : files) {
                    nameDD(fileDOC);
                }
            }
        }
    }

}

