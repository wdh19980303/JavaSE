package OPENDIR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;

public class Construction {
    static void windowsInit() throws Exception {

        JFrame windows = new JFrame();
        DirPathFile fileDirName = new DirPathFile();
        // 设置标题栏的图标为face.gif
        ImageIcon imageIcon = new ImageIcon(Construction.class.getResource("images/icon.png"));
        Font fontWindows = new Font("微软雅黑", Font.BOLD, 10);
        windows.setFont(fontWindows);
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windows.setTitle("OpenFile");
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
        windows.setIconImage(imageIcon.getImage());

        JButton[] buttons = new JButton[Elements.elements];
        JButton OPEN_DIR = new JButton();
        for (int i = 0; i < buttons.length; i++) { //必须这样写，要对按键再次进行初始化，不然会报空指针错误
            buttons[i] = new JButton(String.valueOf(i));
        }

        JPanel buttonPanel = new JPanel();
        String[] dirName = fileDirName.getFileName();
        String[] dirPath = fileDirName.getFilePath();
        Font font = new Font("微软雅黑", Font.BOLD, 25);
        int i;

        for (i = 0; i < Elements.elements; i++) {
            String path = dirPath[i];
            buttons[i].setFont(font);
            buttons[i].setVisible(true);
            buttons[i].setText(dirName[i]);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (!(new File(path).exists())) {
                        WarningInfo.WarningInfoInit("文件不存在");
                    } else {
                        try {
                            Desktop.getDesktop().open(new File(path));
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }


                }
            });

            buttonPanel.add(buttons[i]);

        }
        OPEN_DIR.setFont(font);
        OPEN_DIR.setVisible(true);
        OPEN_DIR.setText("OPEN_DIR");
        OPEN_DIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().open(new File("D:\\OPEN_DIR.txt"));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        buttonPanel.add(OPEN_DIR);
        GridLayout gridLayout = new GridLayout(fileDirName.getEndIndex() + 1, 1);
        buttonPanel.setLayout(gridLayout);
        windows.add(buttonPanel);
        windows.setSize(300, 50 * (fileDirName.getEndIndex() + 1));


    }

}
