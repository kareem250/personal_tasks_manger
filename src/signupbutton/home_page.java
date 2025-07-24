/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signupbutton;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author wika
 */
public class home_page extends javax.swing.JFrame {
Color white = new Color(250,250,250);
Color green = new Color(7, 164, 121);
JButton button = new JButton("add task",new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/pass.png")));
JButton button2 = new JButton("home",new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/user.png")));
JButton button4 = new JButton("home",new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/pass.png")));
JButton button3 = new JButton("home",new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/user.png")));
@SuppressWarnings("empty-statement")
    public home_page() {
        initComponents();
        int width = jPanel1.getWidth();
        int hight = jPanel1.getHeight();
        int x = (int) (jPanel1.getWidth() * 0.03);
        int y = (int) (jPanel1.getHeight() * 0.2);
        JLabel AppBarLabel = new JLabel(
    "task management",
    new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("icon/mail.png")),
    SwingConstants.LEFT  
);
        AppBarLabel.setFont(new Font("Arial",Font.PLAIN,14));
        AppBarLabel.setBounds(0, 0, 150, 50);
        
        button.setBounds(x, (int)(hight * 0.2), 160, 40);
        button.setBackground( new Color(7, 164, 121));
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setFocusPainted(false);
        button.setHorizontalAlignment(SwingConstants.LEFT);
         button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(green);
                button2.setBackground(white);
                button3.setBackground(white);
                button4.setBackground(white);
               jPanel1.repaint();
            }
        });
                
        button2.setBounds(x, (int)(hight * 0.35), 160, 40);
        button2.setBackground(new Color(250,250,250));
              button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setFocusPainted(false);
        button2.setHorizontalAlignment(SwingConstants.LEFT);
        button2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(white);
                button2.setBackground(green);
                button3.setBackground(white);
                button4.setBackground(white);
               jPanel1.repaint();
            }
        });
                
        button3.setBounds(x, (int)(hight * 0.50), 160, 40);
        button3.setBackground(new Color(250,250,250));
                      button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setFocusPainted(false);
        button3.setHorizontalAlignment(SwingConstants.LEFT);
        //
         button3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(white);
                button2.setBackground(white);
                button3.setBackground(green);
                button4.setBackground(white);
               jPanel1.repaint();
            }
        });
               //
                              button4.setOpaque(true);
        button4.setContentAreaFilled(true);
        button4.setFocusPainted(false);
                 button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               jPanel1.repaint();
            }
        });
        button4.setBounds(x, (int)(hight * 0.65), 160, 40);
        button4.setBackground(new Color(250,250,250));
        button4.setHorizontalAlignment(SwingConstants.LEFT);
         button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(white);
                button2.setBackground(white);
                button3.setBackground(white);
                button4.setBackground(green);
               jPanel1.repaint();
            }
        });
         jPanel1.add(button);
         jPanel1.add(button2);
         jPanel1.add(button3);
         jPanel1.add(button4);
         TaskFormPanel taskFormPanel = new TaskFormPanel();
                 taskFormPanel.setBounds((int)(jPanel1.getWidth() * 0.25), 0, (int)(jPanel1.getWidth() * 0.7), jPanel1.getHeight());
         jPanel1.add(taskFormPanel);
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
            .addGap(0, 819, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
