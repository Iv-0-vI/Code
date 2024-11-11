package Demo.Javax;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
public class JFrameTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("默认 title");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,300);
        jf.setLocation(500, 300);
        // jf.setLayout(new FlowLayout());
        // jf.setLayout(new GridLayout(20,20,20,20));
        // jf.setLayout(new BorderLayout(2,2)); //全部居中了
        jf.setLayout(new GridLayout(5,5));// 美
        // jf.setLayout(new GridBagLayout());


        //for循环很多Button
        for (int i = 1; i <= 100; i++) {
            jf.add(new Button("Button"+i));
        }




        jf.setVisible(true);
    }
}
