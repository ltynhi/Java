package Encryptable;
import javax.swing.SwingUtilities;

public class mainGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EncryptionGUI().setVisible(true);
        });
    }
}