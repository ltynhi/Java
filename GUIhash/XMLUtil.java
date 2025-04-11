package GUIhash;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {
	public static void writeUsersToXML(List<User> users, String filePath) {
	    try {
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        Document doc = builder.newDocument();

	        Element root = doc.createElement("users");
	        doc.appendChild(root);

	        for (User user : users) {
	            Element userElement = doc.createElement("user");

	            Element username = doc.createElement("username");
	            username.setTextContent(user.getUsername());
	            userElement.appendChild(username);

	            Element fullName = doc.createElement("fullName");
	            fullName.setTextContent(user.getFullName());
	            userElement.appendChild(fullName);

	            Element password = doc.createElement("hashedPassword");
	            password.setTextContent(user.getHashedPassword());
	            userElement.appendChild(password);

	            root.appendChild(userElement);
	        }

	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer = tf.newTransformer();
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File(filePath));

	        transformer.transform(source, result);

	        System.out.println("Đã ghi file XML thành công.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    }
	    public static List<User> readUsersFromXML(String filePath) {
	        List<User> users = new ArrayList<>();

	        try {
	            File xmlFile = new File(filePath);
	            if (!xmlFile.exists()) return users;

	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.parse(xmlFile);

	            NodeList userNodes = doc.getElementsByTagName("user");

	            for (int i = 0; i < userNodes.getLength(); i++) {
	                Element userElement = (Element) userNodes.item(i);

	                String username = userElement.getElementsByTagName("username").item(0).getTextContent();
	                String fullName = userElement.getElementsByTagName("fullName").item(0).getTextContent();
	                String hashedPassword = userElement.getElementsByTagName("hashedPassword").item(0).getTextContent();

	                users.add(new User(username, hashedPassword, fullName));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return users;
	    
	}
}