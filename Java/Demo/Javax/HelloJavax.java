package Demo.Javax;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloJavax{
    public static void main(String[] args){
        //成功运行标志
        System.out.println("Hello Javax");

        //创建一个框架
        JFrame frame = new JFrame("A Swing App");

        //关闭时的程序操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
