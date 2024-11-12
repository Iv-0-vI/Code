package Demo.Javax;

import java.awt.BorderLayout;

import javax.swing.*;

// todo
public class JFrameBook {
    public static void main(String[] args) {
        // 窗口必选
        JFrame jf = new JFrame();
        jf.setTitle("图书馆界面");
        jf.setSize(600, 400);
        jf.setLocation(800, 300);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //准备按钮
        Box password_Box = Box.createHorizontalBox();
        JButton btn_登录 = new JButton("登录");
        JButton btn_注册 = new JButton("注册");

        //添加按钮
        password_Box.add(btn_登录);
        jf.getContentPane().add(btn_登录);
        password_Box.add(Box.createHorizontalStrut(20));
        password_Box.add(btn_注册);
        jf.getContentPane().add(btn_注册);

        
        //准备用户名
        Box username_Box = Box.createHorizontalBox();
        JLabel userLabel = new JLabel("用户名: ");
        JTextField userField = new JTextField("", 15);
        username_Box.add(userLabel);

        //组装用户密码
        Box pBoxBox = Box.createVerticalBox();
        JLabel passwordLabel = new JLabel("密码");
        JTextField passwordField = new JTextField("", 15);
        username_Box.add(passwordLabel);

        //平面空间对象

        //组装进面板
        
        jf.setVisible(true);

    }

}

// test01
class JFrameBookInterface {
    final int WIDTH = 600;
    final int HEIGHT = 400;

    public void init() {
        JFrame jf = new JFrame();
        jf.setTitle("图书馆界面");
        jf.setSize(WIDTH, HEIGHT);
        jf.setLocation(800, 300);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Box uBox = Box.createHorizontalBox();
        JLabel userLabel = new JLabel("用户名: ");
        JTextField userField = new JTextField("用户名", 15);
        JLabel passwordLabel = new JLabel("密码");
        uBox.add(userLabel);

        Box vBox = Box.createVerticalBox();

        JTextField passwordField = new JTextField("用户名", 15);
        jf.setVisible(true);

    }

}
