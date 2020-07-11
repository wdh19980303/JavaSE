package KFGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.http.WebSocket;

public class CD_edit {

    public static void main(String[] args) {
        editUI editUI = new editUI();

    }


}

class editUI {
    JFrame ControlFrame = new JFrame("CD.edit");
    GridLayout GL = new GridLayout(6, 1, 20, 20);


    {

        ControlFrame.setSize(660, 300);
        ControlFrame.setLocationRelativeTo(null);
        ControlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ControlFrame.setLayout(new GridLayout(1,2,10,20));


        JPanel ControlPanelLeft = new JPanel(GL);
        JPanel ControlPanelRight = new JPanel(GL);

        // 按钮
        JButton confirm = new JButton("confirm");

        String information = "当前文件";
        Font font = new Font("微软雅黑", Font.PLAIN, 18);



        JLabel MaxMonsters = new JLabel(information, JLabel.CENTER);
        JLabel CohortSize = new JLabel(information, JLabel.CENTER);
        JLabel SpawnMod = new JLabel(information, JLabel.CENTER);
        JLabel SpawnPoll = new JLabel(information, JLabel.CENTER);
        JLabel WaveFakeSize = new JLabel(information, JLabel.CENTER);

        JTextField MaxMonstersEdit =new JTextField("se");
        JTextField CohortSizeEdit =new JTextField("se");
        JTextField SpawnModEdit =new JTextField("se");
        JTextField SpawnPollEdit =new JTextField("se");
        JTextField WaveFakeSizeEdit =new JTextField("se");

        //字体设置
        MaxMonsters.setFont(font);
        CohortSize.setFont(font);
        SpawnMod.setFont(font);
        SpawnPoll.setFont(font);
        WaveFakeSize.setFont(font);




        confirm.setFont(font);

        //添加的显示
        ControlPanelLeft.add(MaxMonsters);
        ControlPanelLeft.add(CohortSize);
        ControlPanelLeft.add(SpawnMod);
        ControlPanelLeft.add(SpawnPoll);
        ControlPanelLeft.add(WaveFakeSize);
//        ControlPanelLeft.add(new Button("emmm"));

        //添加的字段
        ControlPanelRight.add(MaxMonstersEdit);
        ControlPanelRight.add(CohortSizeEdit);
        ControlPanelRight.add(SpawnModEdit);
        ControlPanelRight.add(SpawnPollEdit);
        ControlPanelRight.add(WaveFakeSizeEdit);

        //添加的按钮
        ControlPanelRight.add(confirm);



        ControlFrame.add(ControlPanelLeft);
        ControlFrame.add(ControlPanelRight);
//        ControlFrame.add(confirm);







        class ActionReq implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                MaxMonsters.setText("MaxMonsters");
            }
        }

        ActionReq actionReq = new ActionReq();

        confirm.addActionListener(actionReq);


        ControlFrame.setVisible(true);


    }
}