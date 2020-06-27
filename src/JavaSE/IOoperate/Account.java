package JavaSE.IOoperate;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.Data;
import java.io.*;

public class Account {
    public static void main(String[] args) {
        String path = "F:\\IOtest\\account.txt"; //本地文件路径
        try {
            account(path);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void account(String path) throws Exception {
        InputStreamReader accountInfo = new InputStreamReader(new FileInputStream(path)); //读取本地文件
        BufferedReader accountInfoEx = new BufferedReader(accountInfo); //缓冲

        InputStreamReader keyboard = new InputStreamReader(System.in); //读取键盘输入
        BufferedReader reader = new BufferedReader(keyboard);

        String password = "";
        String user = "";
        String data = "";

        user = accountInfoEx.readLine();     //两次读取获取用户名密码
        password = accountInfoEx.readLine();


        accountLoop:while ((data = reader.readLine()) != null){
            if(user.equals(data)){
                while ((data = reader.readLine()) != null){
                    if(data.equals(password)){
                        System.out.println("enter is success");
                        break accountLoop; //输入密码成功时跳到最外层
                    }
                    else System.out.println("password is mistake");
                }
            }
            else {
                System.out.println("account no exist");

            }

        }

        accountInfo.close();
        accountInfoEx.close();
        keyboard.close();
        reader.close();





    }
}
