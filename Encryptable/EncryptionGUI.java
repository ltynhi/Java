package Encryptable;

import javax.swing.*;
import java.awt.*;

public class EncryptionGUI extends JFrame {
    private JTextArea inputArea, outputArea;
    private JButton encryptBtn, decryptBtn;
    private JRadioButton aesOption, rsaOption;
    private JTextField keyField;

    public EncryptionGUI() {
        setTitle("Encryption App");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        inputArea = new JTextArea(5, 40);
        outputArea = new JTextArea(5, 40);
        outputArea.setEditable(false);

        encryptBtn = new JButton("Encrypt");
        decryptBtn = new JButton("Decrypt");

        aesOption = new JRadioButton("AES", true);
        rsaOption = new JRadioButton("RSA");

        ButtonGroup group = new ButtonGroup();
        group.add(aesOption);
        group.add(rsaOption);

        keyField = new JTextField(20);

        // Panels
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.add(new JScrollPane(inputArea));
        topPanel.add(new JScrollPane(outputArea));

        JPanel optionPanel = new JPanel();
        optionPanel.add(aesOption);
        optionPanel.add(rsaOption);

        JPanel keyPanel = new JPanel();
        keyPanel.add(new JLabel("Key:"));
        keyPanel.add(keyField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(encryptBtn);
        bottomPanel.add(decryptBtn);

        getContentPane().add(topPanel, BorderLayout.CENTER);
        getContentPane().add(optionPanel, BorderLayout.NORTH);
        getContentPane().add(keyPanel, BorderLayout.WEST); // đặt bên trái
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        encryptBtn.addActionListener(e -> runInThread(true));
        decryptBtn.addActionListener(e -> runInThread(false));
    }

    private void runInThread(boolean isEncrypt) {
        String text = inputArea.getText();
        String key = keyField.getText();

        Thread thread = new Thread(() -> {
            try {
                Encryptable encryptor;
                if (aesOption.isSelected()) {
                    if (key.isEmpty()) {
                        throw new Exception("Vui lòng nhập khóa AES!");
                    }
                    encryptor = new AESEncryption(key);
                } else {
                    encryptor = new RSAEncryption(); // vẫn tự tạo key
                }

                String result = isEncrypt ? encryptor.encrypt(text) : encryptor.decrypt(text);
                SwingUtilities.invokeLater(() -> outputArea.setText(result));
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> outputArea.setText("Lỗi: " + ex.getMessage()));
            }
        });
        thread.start();
    }
}