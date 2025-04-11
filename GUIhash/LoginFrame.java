package GUIhash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private List<User> userList; 

    public LoginFrame(List<User> userList) {
        this.userList = userList;

        setTitle("Đăng nhập");
        setSize(660, 404);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Tên đăng nhập:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(130, 59, 140, 34);
        panel.add(label);
        usernameField = new JTextField();
        usernameField.setBounds(309, 60, 258, 34);
        panel.add(usernameField);

        JLabel label_1 = new JLabel("Mật khẩu:");
        label_1.setForeground(new Color(0, 0, 0));
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label_1.setBounds(130, 146, 140, 34);
        panel.add(label_1);
        passwordField = new JPasswordField();
        passwordField.setBounds(309, 147, 258, 34);
        panel.add(passwordField);

        JButton loginButton = new JButton("Đăng nhập");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        loginButton.setBounds(228, 252, 180, 76);
        loginButton.addActionListener(this::handleLogin);
        panel.add(loginButton);

        getContentPane().add(panel);
    }

    private void handleLogin(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        User foundUser = userList.stream()
            .filter(u -> u.getUsername().equals(username))
            .findFirst()
            .orElse(null);

        if (foundUser == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng.");
            return;
        }

        boolean passwordMatch = PasswordUtil.checkPassword(password, foundUser.getHashedPassword());

        if (passwordMatch) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Sai mật khẩu!");
        }
    }
}