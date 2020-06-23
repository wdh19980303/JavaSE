package JavaSE.IOoperate;

import java.io.*;
import java.lang.reflect.WildcardType;

public class CopyOperation {
    public static void main(String[] args) {
        try {
            CopyFolder("F:\\java","F:\\新建文件夹");
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }



    public static void CopyFolder(String sourcePath, String targetPath) throws Exception {

        File sourceFile = new File(sourcePath);

        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            throw new Exception("source file no exist");
        }
        if (!sourceFile.isDirectory()) {
            throw new Exception("source no folder");
        }
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        if (!targetFile.isDirectory()) {
            throw new Exception("target no folder");
        }


        File[] files = sourceFile.listFiles();
        if (files == null | files.length == 0) {
            return;
        }

        for (File file : files) {
            String movePath = targetPath + File.separator + file.getName();
            if (file.isDirectory()) {
                CopyFolder(file.getAbsolutePath(), movePath);
            } else {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(movePath));
                byte[] bytes = new byte[1024];
                int length;
                while ((length = in.read(bytes)) != -1){
                    out.write(bytes,0,length);

                }
                out.close();
                in.close();

            }
        }

    }

}
