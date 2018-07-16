package home.blackharold;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    
        int amount = 0;
    
       
    
    /********************************************/
    
    JLabel label = new JLabel("0");
    JLabel loginLabel = new JLabel("Login: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JButton loginButton = new JButton("Sign in");
    JButton registrationButton = new JButton("Registration");
    JTextField loginText = new JTextField(15);
    JPasswordField passwordText = new JPasswordField(15);
    
    public void init() {
    
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
    
        this.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1, 12, 2,
                new Insets(2, 2, 2, 2), 0, 0));
    
        this.add(loginText, new GridBagConstraints(1, 0, 1, 1, 1, 1, 12, 2,
                new Insets(2, 2, 2, 2), 0, 0));
    
        this.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1, 12, 2,
                new Insets(2, 2, 2, 2), 0, 0));
    
        this.add(passwordText, new GridBagConstraints(1, 1, 1, 1, 1, 1, 12, 2,
                new Insets(2, 2, 2, 2), 2, 3));
    
        this.add(loginButton, new GridBagConstraints(1, 2, 1, 1, 1, 1, 12, 1,
                new Insets(2, 2, 5, 2), 0, 0));
    
        this.add(registrationButton, new GridBagConstraints(0, 2, 1, 1, 1, 1, 12, 2,
                new Insets(2, 5, 5, 2), 0, 0));
        
        this.add(label, new GridBagConstraints(0, 4, 1, 1, 1, 1, 12, 2,
                new Insets(2, 5, 5, 2), 0, 0));
    
        loginButton.addActionListener(new ButtonActionListener());
        registrationButton.addActionListener(new ButtonActionListener());
    
        this.setVisible(true);
        this.pack();
    }
    
        private class ButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() instanceof JButton) {
                    String nameButton = ((JButton) e.getSource()).getText();
                    System.out.println(nameButton);
                }
                String str1 = loginText.getText();
                String str2 = passwordText.getText();
                
                loginText.setText(str2);
                passwordText.setText(str1);
                amount++;
                label.setText(String.valueOf(amount));
            }
        }
    }
