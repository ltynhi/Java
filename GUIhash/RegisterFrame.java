package GUIhash;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
public class RegisterFrame extends JFrame {
    private JTextField usernameField;
    private JTextField fullNameField;
    private JPasswordField passwordField;

    private java.util.List<User> userList;

    public RegisterFrame(List<User> userList) {
        this.userList = userList;
        setTitle("Đăng ký người dùng");
        setSize(350, 200);                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);     
        initUI();                          
    }

    public RegisterFrame() {
        setTitle("Đăng ký người dùng");
        setSize(460, 348);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setLayout(null);

        JLabel label = new JLabel("Tên đăng nhập:");
        label.setBounds(16, 10, 73, 13);
        panel.add(label);
        usernameField = new JTextField();
        usernameField.setBounds(10, 23, 366, 47);
        panel.add(usernameField);

        JLabel label_1 = new JLabel("Họ tên:");
        label_1.setBounds(16, 70, 34, 13);
        panel.add(label_1);
        fullNameField = new JTextField();
        fullNameField.setBounds(10, 83, 366, 47);
        panel.add(fullNameField);
        JLabel label_2 = new JLabel("Mật khẩu:");
        label_2.setBounds(16, 130, 46, 13);
        panel.add(label_2);
        passwordField = new JPasswordField();
        passwordField.setBounds(10, 143, 366, 47);
        panel.add(passwordField);

        JButton registerButton = new JButton("Đăng ký");
        registerButton.setBounds(16, 190, 69, 21);
        registerButton.addActionListener(this::handleRegister);
        panel.add(registerButton);

        JButton switchToLoginButton = new JButton("Đã có tài khoản? Đăng nhập");
        switchToLoginButton.setBounds(16, 211, 161, 21);
        switchToLoginButton.addActionListener(e -> {
            new LoginFrame(userList).setVisible(true);
            this.dispose();
        });
        panel.add(switchToLoginButton);

        JButton showUsersButton = new JButton("Hiển thị danh sách người dùng");
        showUsersButton.setBounds(16, 232, 171, 21);
        showUsersButton.addActionListener(e -> {
            StringBuilder sb = new StringBuilder();
            for (User user : userList) {
                sb.append("Tên đăng nhập: ").append(user.getUsername())
                  .append(" - Họ tên: ").append(user.getFullName()).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Danh sách người dùng", JOptionPane.INFORMATION_MESSAGE);
        });
        panel.add(showUsersButton);

        getContentPane().add(panel);
        setSize(400, 300);
    }

    private void handleRegister(ActionEvent e) {
        String username = usernameField.getText();
        String fullName = fullNameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty() || fullName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        String hashedPassword = PasswordUtil.hashPassword(password);
        User user = new User(username, hashedPassword, fullName);

        userList.add(user);
        JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
        XMLUtil.writeUsersToXML(userList, "users.xml");

        LoginFrame loginFrame = new LoginFrame(userList);
        loginFrame.setVisible(true);

        this.dispose();
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegisterFrame().setVisible(true));
    }
}