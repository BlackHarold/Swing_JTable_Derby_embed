package home.blackharold;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        JFrame frame = new JFrame("Authorization in system: ");
        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        /********************************************/
        frame.setLayout(new GridBagLayout());
        /********************************************/
        
        JLabel loginLabel = new JLabel("Login: ");
        JLabel passwordLabel = new JLabel("Password: ");
        
        JButton loginButton = new JButton("Login in");
        JButton registrationButton = new JButton("Registration");
        
        JTextField loginText = new JTextField(15);
        JPasswordField passwordText = new JPasswordField(15);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 0;
        c.gridheight = 0;
        c.weightx = 0;
        c.weighty = 0.1;
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5); // top/left/bottom/right
        
        frame.add(loginButton, c);
        frame.add(registrationButton);
        frame.setVisible(true);
        
        
    }
}
