package OPENDIR;

import java.io.*;

public class DirPathFile {

    private File paths = new File("D:\\OPEN_DIR.txt");
    private int index = 0;
    private int endIndex = 0;

    {
        if (!paths.exists()) {
            try {
                paths.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private FileReader PathFile = new FileReader(paths);
    private FileReader PathFileCount = new FileReader(paths);
    private BufferedReader buPathFile = new BufferedReader(PathFile);
    private BufferedReader buCount = new BufferedReader(PathFileCount);

    {
        while (buCount.readLine() != null) {
            ++Elements.elements; //计算，产生一个常数

        }

    }

    private String[] FileName = new String[Elements.elements];
    private String[] FilePath = new String[Elements.elements];

    {
        String[] namePath = new String[Elements.elements];
        while (index < Elements.elements && (namePath[index] = buPathFile.readLine()) != null ) {
            index++;
        }
        PathFile.close();
        buPathFile.close();


        index = 0;
        while (index < Elements.elements) {
            String[] Name_path_split = namePath[index].split("=");
            FileName[index] = Name_path_split[0];
            FilePath[index] = Name_path_split[1];
            index++;
        }
        endIndex = index;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public String[] getFileName() {
        return FileName;
    }

    public String[] getFilePath() {
        return FilePath;
    }

    public DirPathFile() throws Exception {
    }
}
