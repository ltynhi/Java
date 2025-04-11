package GUIhash;

import javax.swing.SwingUtilities;
import javax.swing.*;
		import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        List<User> userList = XMLUtil.readUsersFromXML("users.xml");

		        SwingUtilities.invokeLater(() -> {
		            RegisterFrame registerFrame = new RegisterFrame(userList);
		            registerFrame.setVisible(true);
		            registerFrame.addWindowListener(new java.awt.event.WindowAdapter() {
		                @Override
		                public void windowClosing(java.awt.event.WindowEvent e) {
		                    LoginFrame loginFrame = new LoginFrame(userList);
		                    loginFrame.setVisible(true);
		                }
		            });
		        });
		    }
		}