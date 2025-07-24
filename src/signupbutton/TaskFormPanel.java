package signupbutton;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import signupbutton.MyTextField;

public class TaskFormPanel extends JPanel {
    public TaskFormPanel() {
        setLayout(null);

        int startX = 40;
        int startY = 30;
        int labelWidth = 100;
        int fieldWidth = 300;
        int height = 30;
        int gap = 15;

        JLabel dueDateLabel = new JLabel("due_date");
        dueDateLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        dueDateLabel.setBounds(startX, startY, labelWidth, height);
        add(dueDateLabel);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("yyyy-MM-dd"); // شكل التاريخ
        dateChooser.setBounds(startX + labelWidth + 10, startY, 300, height);
        dateChooser.setForeground(new Color(7, 164, 121));
        add(dateChooser);

        startY += height + gap;

        JLabel taskNameLabel = new JLabel("Task_name");
        taskNameLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        taskNameLabel.setBounds(startX, startY, labelWidth, height);
        add(taskNameLabel);

        MyTextField taskNameField = new MyTextField();
        taskNameField.setBounds(startX + labelWidth + 10, startY, fieldWidth, height);
        taskNameField.setHint("Enter Task Name");
        add(taskNameField);

        startY += height + gap;

        JLabel priorityLabel = new JLabel("priority");
        priorityLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        priorityLabel.setBounds(startX, startY, labelWidth, height);
        add(priorityLabel);

        JComboBox<String> priorityCombo = new JComboBox<>(new String[]{"High", "Medium", "Low"});
        priorityCombo.setBounds(startX + labelWidth + 10, startY, fieldWidth, height);
        add(priorityCombo);

        startY += height + gap;

        JLabel descLabel = new JLabel("description");
        descLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        descLabel.setBounds(startX, startY, labelWidth, height);
        add(descLabel);

        MyTextField descField = new MyTextField();
        descField.setBounds(startX + labelWidth + 10, startY, fieldWidth, height);
        descField.setHint("Enter Description");
        add(descField);

        startY += height + gap;

        JLabel statusLabel = new JLabel("status");
        statusLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        statusLabel.setBounds(startX, startY, labelWidth, height);
        add(statusLabel);

        JComboBox<String> statusCombo = new JComboBox<>(new String[]{"Not Started", "In progress", "Completed", "Canceled"});
        statusCombo.setBounds(startX + labelWidth + 10, startY, fieldWidth, height);
        add(statusCombo);

        startY += height + 2 * gap;

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(startX + labelWidth + 10, startY, fieldWidth, height);
        addBtn.setBackground(new Color(7, 164, 121));
        addBtn.addActionListener((e) -> {
              try {
  String sql ="insert into tasks values (?,?,?,sysdate,?,?,?)";
  Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
PreparedStatement ps =c.prepareStatement(sql);
ps.setString(1, task_id.getText());
ps.setString(2, task_name.getText());
ps.setString(3, description.getText());
//ps.setString(4, due_date.getDateFormatString());
ps.setString(4,(String) priority.getSelectedItem());
ps.setString(5,(String) status.getSelectedItem() );
//   String user= usermap.get(combo.getSelectedItem().toString());
        ps.setString(6,user_id);
   int x = ps.executeUpdate();
if(x==1){
JOptionPane.showMessageDialog(this,"the task is saved in Database");
}else {

JOptionPane.showMessageDialog(this,"Error");

    
}
  }
  catch (HeadlessException | SQLException ex){
      JOptionPane.showMessageDialog(this, ex.getMessage());
  }
        });
        add(addBtn);
    }
}
