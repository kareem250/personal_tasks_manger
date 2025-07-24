/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signupbutton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author wika
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        int frameWidth = jPanel1.getWidth();
        int frameHeight = jPanel1.getHeight();
        MyTextField feild = new MyTextField();
        feild.setHint("input user name");
        JLabel labal = new JLabel("Sign In");
        labal.setFont(new Font("Arial", Font.PLAIN, 24));
        labal.setForeground(new Color(7, 164, 121));
        labal.setBounds((int) (frameWidth / 2.1), (int) (frameHeight * 0.03), (int) (frameWidth * 0.3), 45);
        jPanel1.add(labal);
        JLabel labal2 = new JLabel();
        labal2.setBackground(new Color(7, 164, 121));
        labal2.setBounds(0, 0, (int) (frameWidth / 3), frameHeight);
        labal2.setOpaque(true);

// X = (panel width - field width) / 2   --> نص العرض عشان يتوسط أفقي
        int x = (int) ((frameWidth - (frameWidth * 0.4)) / 1.25);
// Y = (panel height - field height) / 2 --> نص الارتفاع عشان يتوسط رأسي
        int y = (int) (frameHeight * 0.25);
        System.out.println();
        feild.setBounds(x, y, (int) (frameWidth * 0.4), 35);
        feild.setPrefixIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/user.png")));
        jPanel1.add(feild);

        PassFeildCom feild2 = new PassFeildCom();
        feild2.setHint("input password");

// X زي الأول (متوسط أفقي)
        int x2 = x;
        int y2 = y + 60;

        feild2.setBounds(x2, y2, (int) (frameWidth * 0.4), 35);
        feild2.setPrefixIcon(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/pass.png")));
        jPanel1.add(feild2);
        JCheckBox check = new JCheckBox();
        check.addActionListener(e -> {
        if(check.isSelected()){
                feild2.setEchoChar((char) 0);
                }else{
                    feild2.setEchoChar('*');
                }
        });
        check.setBounds((x2 + 20) + (feild2.getWidth()), y2, 300, 30);
        jPanel1.add(check);
        int xbutton = (int) ((frameWidth - (int) (frameWidth * 0.25)) / 1.3);
        JButton button = new JButton("Sign In");
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setBackground(new Color(7, 164, 121));
        button.setForeground(new Color(250, 250, 250));
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBounds(xbutton, (y2 + 80), (int) (frameWidth * 0.25), 40);

        button.setFocusPainted(false);
        button.setBackground(new Color(7, 164, 121));
        JButton textButton = new JButton("forget password ?");

textButton.setContentAreaFilled(false);
textButton.setBorderPainted(false);
textButton.setFocusPainted(false);
textButton.setOpaque(false);
textButton.setForeground(Color.GRAY);
textButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
textButton.setBounds((x2 + feild2.getWidth()) - 50, y2 + 45, 130, 40);

jPanel1.add(textButton);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
            String sql = "select * from  users where user_name =? and  password =?";
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            PreparedStatement ps =c.prepareStatement(sql);
            ps.setString(1,feild.getText() );
            ps.setString(2,feild2.getText() );
            int x = ps.executeUpdate();
            if(x==1){
                JOptionPane.showMessageDialog( jPanel1 ,"done" );
 new home_page().setVisible(true);
 dispose();
            }else{
                JOptionPane.showMessageDialog( jPanel1 ,"user_name or password wrong" );
            }
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(jPanel1, ex.getMessage());
        }
            }
        }
        );
        jPanel1.add(button);
        int xbutton2 = (int) ((frameWidth / 3) - (int) (frameWidth * 0.25)) / 2;
        System.out.println(xbutton2);
        
        JButton button2 = new JButton("Sign Up");
        button2.setFont(new Font("Arial", Font.PLAIN, 20));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(7, 164, 121));
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setFocusPainted(false);
        button2.setBounds(xbutton2, y2 + 80, (int) (frameWidth * 0.25), 40);
        JLabel WelcomeLabel = new JLabel("welcome back");
        WelcomeLabel.setFont(new Font("Arial", Font.BOLD, 28) {
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new sign_up().setVisible(true);
                dispose();
            }
        });
       WelcomeLabel.setBounds(xbutton2  + 12,(int)(frameHeight * 0.2),(int)(frameWidth * 0.25),40);
       WelcomeLabel.setForeground(Color.white);
       WelcomeLabel.setOpaque(true);
       WelcomeLabel.setBackground(new Color(7, 164, 121));
        labal2.add(WelcomeLabel);
        JLabel massegeLabel = new JLabel("if you dont have acount");
        massegeLabel.setFont(new Font("Arial", Font.BOLD, 16) {
        });
       massegeLabel.setBounds(xbutton2  + 12,(int)(frameHeight * 0.3),(int)(frameWidth * 0.25),40);
       massegeLabel.setForeground(Color.white);
       massegeLabel.setOpaque(true);
       massegeLabel.setBackground(new Color(7, 164, 121));
        labal2.add(massegeLabel);
               JLabel massegeLabel2 = new JLabel("click here");
        massegeLabel2.setFont(new Font("Arial", Font.BOLD, 16) {
        });
       massegeLabel2.setBounds(xbutton2  + 12,(int)(frameHeight * 0.3) + 30,(int)(frameWidth * 0.25),40);
       massegeLabel2.setForeground(Color.white);
       massegeLabel2.setOpaque(true);
       massegeLabel2.setBackground(new Color(7, 164, 121));
               labal2.add(massegeLabel2);
        labal2.add(button2);
        jPanel1.add(labal2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
