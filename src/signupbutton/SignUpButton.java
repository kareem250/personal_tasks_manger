/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signupbutton;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author wika
 */
public class SignUpButton extends JFrame {

    public static void main(String[] args) {
        UIManager.put("Button.arc", 25);                  // زرار مدور
UIManager.put("Component.arc", 15);               // لكل العناصر
UIManager.put("TextComponent.arc", 10);           // التكسيت فيلد
UIManager.put("Button.background", Color.BLUE);   // لون الزرار
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            System.out.println("done");
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        JFrame frame = new JFrame("JLabel demo");               // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(600, 500);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        JPanel panal = new JPanel(new MigLayout());
        JButton button = new JButton("click");
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setBackground(new Color(7, 164, 121));
        button.setForeground(new Color(250, 250, 250));
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBounds(155, 100, 220, 45);
    
        button.setFocusPainted(false);
        button.setBackground(new Color(7, 164, 121));
        panal.add(button);
        MyTextField feild = new MyTextField();
        feild.setBounds(20, 20, 240, 50);
        feild.setHint("input user name");
        feild.setPrefixIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/user.png")));
        panal.add(feild,"span, growx");
        frame.setContentPane(panal);
        
                frame.setVisible(false);
                new home_page().setVisible(true);
                new NewJFrame().setVisible(true);
    }

}
