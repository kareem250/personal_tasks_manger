/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signupbutton;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author wika
 */
public class SignUpButton extends JFrame{

    public static void main(String[] args) {
          UIManager.put("Component.arc", 100);
        try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
            System.out.println("done");
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
         JFrame frame = new JFrame("JLabel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(400, 300);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setVisible(true);
        JButton button = new JButton("click");
        button.setFont(new Font("Arial",Font.PLAIN,20));
        button.setBackground(new Color(7,164,121));
        button.setForeground(new Color(250,250,250));
        button.setOpaque(true); // مهم جدًا
button.setContentAreaFilled(true); 
   button.setBounds(155, 100, 220, 45);
frame.setLayout(null);
    button.putClientProperty("JButton.buttonType", "roundRect");
button.setFocusPainted(false);           
        button.setBackground(new Color(7,164,121));
        frame.add(button);
        MyTextField feild = new MyTextField();
        feild.setBounds(150, 20, 200, 40);
        feild.setHint("input user name");
        feild.setPrefixIcon(new ImageIcon("So/icon/user.png"));
        frame.add(feild);
    }
    
}
