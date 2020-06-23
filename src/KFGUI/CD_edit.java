package KFGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CD_edit {

    public static void main(String[] args) {
        editUI editUI = new editUI();

    }


}

class editUI {
    JFrame ControlFrame = new JFrame("CD.edit");
    GridLayout GL = new GridLayout(5, 2, 100, 20);

    {
        ControlFrame.setSize(300, 750);
        ControlFrame.setLocationRelativeTo(null);
        ControlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel ControlPanel = new JPanel(GL);
        JButton confirm = new JButton("confirm");

        String information = "当前文件";
        Font font = new Font("微软雅黑", Font.PLAIN, 18);

        JLabel MaxMonsters = new JLabel(information, JLabel.CENTER);
        JLabel CohortSize = new JLabel(information, JLabel.CENTER);
        JLabel SpawnMod = new JLabel(information, JLabel.CENTER);
        JLabel SpawnPoll = new JLabel(information, JLabel.CENTER);
        JLabel WaveFakeSize = new JLabel(information, JLabel.CENTER);

       /* JTextField  =new JTextField("se");
        JTextField field =new JTextField("se");
        JTextField field =new JTextField("se");
        JTextField field =new JTextField("se");
        JTextField field =new JTextField("se");*/


        MaxMonsters.setFont(font);
        CohortSize.setFont(font);
        SpawnMod.setFont(font);
        SpawnPoll.setFont(font);
        WaveFakeSize.setFont(font);




        confirm.setFont(font);

        ControlPanel.add(MaxMonsters);
        ControlPanel.add(CohortSize);
        ControlPanel.add(SpawnMod);
        ControlPanel.add(SpawnPoll);
        ControlPanel.add(WaveFakeSize);
        //ControlPanel.add(field);

//        ControlPanel.add(confirm);


        ControlFrame.setContentPane(ControlPanel);
        ControlFrame.setVisible(true);
    }
}