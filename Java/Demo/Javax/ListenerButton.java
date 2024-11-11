package Demo.Javax;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.security.auth.login.CredentialExpiredException;
import javax.swing.JButton;
import javax.swing.JFrame;

//如何添加一个Button
public class ListenerButton {
    public static void main(String[] args) {
        // 顺序很重要

        JFrame frame = new JFrame("Window12");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 60));//匿名函数
        JButton button = new JButton("last");
        JLabel label = new JLabel("我的随身听");
        label.setFont(new Font("SansSerif",Font.BOLD,18));
        frame.add(label);
        frame.getContentPane().add(button);

        JButton button1 = new JButton("triangle");
        frame.getContentPane().add(button1);

        JButton button2 = new JButton("next");

        frame.getContentPane().add(button2);
        button.addActionListener(e -> {
            System.out.println("Button was clicked");
        });
        button1.addActionListener(e -> {
            System.out.println("Tik was clicked");
        });
        button2.addActionListener(e -> {
            System.out.println("Tok was clicked");
        });
        
        frame.setVisible(true);

    }
}
