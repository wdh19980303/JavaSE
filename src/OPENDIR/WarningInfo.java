package OPENDIR;

import javax.swing.*;
import java.awt.*;

public class WarningInfo {
    public static void WarningInfoInit(String Information){
        JFrame warning = new JFrame();
        ImageIcon imageIcon = new ImageIcon(Construction.class.getResource("images/icon.png"));
        Font font = new Font("微软雅黑",Font.BOLD,15);
        JLabel warningInformation = new JLabel(Information,SwingConstants.CENTER);
        warningInformation.setFont(font);
//        JPanel warningPanel = new JPanel();

        warningInformation.setVisible(true);

        warning.add(warningInformation);
        warning.setSize(300,100);
        warning.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        warning.setTitle("warning!");
        warning.setVisible(true);
        warning.setLocationRelativeTo(null);
        warning.setIconImage(imageIcon.getImage());
    }


}
