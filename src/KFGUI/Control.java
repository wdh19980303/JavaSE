package KFGUI;

import jdk.jfr.Label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Control {
    public static void main(String[] args) {

        JFrame ControlFrame = new JFrame("KF.D3D11");
        GridLayout GL = new GridLayout(2, 1, 100, 20);
        ControlFrame.setSize(300, 150);
        ControlFrame.setLocationRelativeTo(null);
        ControlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel ControlPanel = new JPanel(GL);
        JButton confirm = new JButton("confirm");
        String information = "当前文件";
        Font font = new Font("微软雅黑", Font.PLAIN, 18);
        JLabel ControlLabel = new JLabel(information, JLabel.CENTER);
        confirm.setFont(font);
        ControlLabel.setFont(font);
        ControlPanel.add(ControlLabel);
        ControlPanel.add(confirm);


        ControlFrame.setContentPane(ControlPanel);
        ControlFrame.setVisible(true);
        File d3d11_source = new File("D:\\Steam\\steamapps\\common\\killingfloor2\\Binaries\\Win64\\d3d11.dll");
        File d3d11_hide = new File("D:\\Steam\\steamapps\\common\\killingfloor2\\Binaries\\Win64\\d3d11_hide.dll");
        if (d3d11_source.exists()) {
            ControlLabel.setText("当前d3d11.dll存在");
        } else if (d3d11_hide.exists()) {
            ControlLabel.setText("当前d3d11_hide.dll存在");
        }else{
            ControlLabel.setText("当前引用文件不存在");
        }


        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File d3d11_source = new File("D:\\Steam\\steamapps\\common\\killingfloor2\\Binaries\\Win64\\d3d11.dll");
                File d3d11_hide = new File("D:\\Steam\\steamapps\\common\\killingfloor2\\Binaries\\Win64\\d3d11_hide.dll");

                if (d3d11_source.exists()) {
                    d3d11_source.renameTo(d3d11_hide);
                    ControlLabel.setText("当前取消d3d11.dll使用");
                } else if (d3d11_hide.exists()) {
                    d3d11_hide.renameTo(d3d11_source);
                    ControlLabel.setText("当前恢复d3d11.dll使用");
                }


            }
        });

    }
}
