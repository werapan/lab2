package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLogin {
    private JTextField textLogin;
    private JPasswordField textPassword;
    private JButton submitButton;
    private JLabel textResult;
    private JPanel panelMain;

    public FormLogin() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textResult.setText(textLogin.getText() + " " + new String(textPassword.getPassword()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login App");
        frame.setContentPane(new FormLogin().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
