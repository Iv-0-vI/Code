package Demo.Javax;

import javax.swing.*;

public class JFrameBook {
    public static void main(String[] args) {
        // 窗口必选
        JFrame jf = new JFrame();
        jf.setTitle("图书馆界面");
        jf.setSize(600, 400);
        jf.setLocation(800, 300);
        jf.setResizable(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //组装按钮
        Box btn_按钮 = Box.createHorizontalBox();
        JButton btn_登录 = new JButton("登录");
        JButton btn_注册 = new JButton("注册");
        btn_按钮.add(btn_注册);
        btn_按钮.add(btn_登录);
        //组装用户名
        Box uBox = Box.createHorizontalBox();
        JLabel userLabel = new JLabel("用户名: ");
        JTextField userField = new JTextField("", 15);
        uBox.add(userLabel);

        //组装用户密码
        Box pBoxBox = Box.createVerticalBox();
        JLabel passwordLabel = new JLabel("密码");
        JTextField passwordField = new JTextField("", 15);
        uBox.add(passwordLabel);

        //组装进面板
        
        jf.setVisible(true);

    }

}

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
